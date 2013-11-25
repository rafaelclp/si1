package models;

import java.util.*;

import play.db.ebean.*;
import play.db.ebean.Model.*;
import play.data.validation.Constraints.*;

import javax.persistence.*;

@Entity
public class Task extends Model implements Comparable {
	@Id
	public Long id;

	@Required
	public String label;

	@Required
	public String description;

	@Required
	public String project;

	@Required
	public int priority;

	public boolean completed = false;

	public static Finder<Long, Task> find = new Finder<Long, Task>(Long.class,
			Task.class);

	public static List<Task> all() {
		return find.all();
	}

	public int compareTo(Object other) {
		int result = 0;
		if (other.getClass() == getClass()) {
			if (((Task)other).priority < priority) {
				result = 1;
			} else if (((Task)other).priority > priority) {
				result = -1;
			}
		}
		return result;
	}

	public static List<Task> allSortedByPriority() {
		List<Task> tasksList = all();
		Task[] tasks = new Task[tasksList.size()];
		tasksList.toArray(tasks);
		Arrays.sort(tasks);
		for (int i = 0; i < tasks.length; i++) {
			tasksList.set(i, tasks[i]);
		}
		return tasksList;
	}

	public static Task find(Long id) {
		Task result = null;
		List<Task> tasks = all();
		for (Task task : tasks) {
			if (task.id == id) {
				result = task;
				break;
			}
		}
		return result;
	}

	public static void create(Task task) {
		task.save();
	}

	public static void delete(Long id) {
		find.ref(id).delete();
	}
}