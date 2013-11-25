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

	public static Finder<Long, Task> find = new Finder<Long, Task>(Long.class,
			Task.class);

	public static List<Task> all() {
		return find.all();
	}

	public static void create(Task task) {
		task.save();
	}

	public static void delete(Long id) {
		find.ref(id).delete();
	}
}