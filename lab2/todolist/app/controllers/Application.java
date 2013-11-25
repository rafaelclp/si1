package controllers;

import java.util.List;

import models.*;
import play.*;
import play.data.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {
	static Form<Task> taskForm = Form.form(Task.class);

	public static Result index() {
		return redirect(routes.Application.tasks());
	}

	public static Result tasks() {
		return ok(views.html.index.render(Task.allSortedByPriority(), taskForm));
	}

	public static Result newTask() {
		Form<Task> filledForm = taskForm.bindFromRequest();
		if (filledForm.hasErrors()) {
			return badRequest(views.html.index.render(Task.allSortedByPriority(), filledForm));
		} else {
			Task.create(filledForm.get());
			return redirect(routes.Application.tasks());
		}
	}

	public static Result deleteTask(Long id) {
		Task.delete(id);
		return redirect(routes.Application.tasks());
	}

	public static Result toggleCompletedTask(Long id) {
		Task task = Task.find(id);
		task.completed = !task.completed;
		task.update();
		return redirect(routes.Application.tasks());
	}
}
