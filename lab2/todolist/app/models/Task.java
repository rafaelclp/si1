package models;

import java.util.*;

import play.db.ebean.*;
import play.db.ebean.Model.*;
import play.data.validation.Constraints.*;

import javax.persistence.*;

@Entity
public class Task extends Model {
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

	public static Task find(Long id) {
		List<Task> tasks = all();
		for (Task task : tasks) {
			if (task.id == id) {
				return task;
			}
		}
		return null;
	}

	public static void create(Task task) {
		task.save();
	}

	public static void delete(Long id) {
		find.ref(id).delete();
	}
}