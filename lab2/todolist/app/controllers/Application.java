package controllers;

import models.Task;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;

public class Application extends Controller {
	static Form<Task> taskForm = Form.form(Task.class);

	/**
	 * Redireciona para a página de tarefas (/task).
	 * 
	 * @return Resposta com o redirecionamento (303 See other).
	 */
	public static Result index() {
		return redirect(routes.Application.tasks());
	}

	/**
	 * Exibe a página de tarefas.
	 * 
	 * @return Retorna a resposta (200 OK) com a página de tarefas (lista de
	 *         tarefas e formulário de nova tarefa).
	 */
	public static Result tasks() {
		return ok(views.html.index.render(Task.sortByPriority(Task.all()), taskForm));
	}

	/**
	 * Cria uma nova tarefa.
	 * 
	 * @return Retorna a resposta (redirecionar para /tasks).
	 */
	public static Result newTask() {
		Form<Task> filledForm = taskForm.bindFromRequest();
		if (filledForm.hasErrors()) {
			return badRequest(views.html.index.render(
					Task.sortByPriority(Task.all()), filledForm));
		} else {
			Task.create(filledForm.get());
			return redirect(routes.Application.tasks());
		}
	}

	/**
	 * Remove uma tarefa.
	 * 
	 * @param id
	 *            Id da tarefa a ser removida.
	 * @return Retorna a resposta (redirecionar para /tasks).
	 */
	public static Result deleteTask(Long id) {
		Task.delete(id);
		return redirect(routes.Application.tasks());
	}

	/**
	 * Marca uma tarefa como completa ou incompleta, dependendo do seu stats
	 * atual (inverte/toggle).
	 * 
	 * @param id
	 *            Id da tarefa a ter seu status invertido.
	 * @return Retorna a resposta (redirecionar para /tasks).
	 */
	public static Result toggleCompletedTask(Long id) {
		Task task = Task.find(id);
		task.completed = !task.completed;
		task.update();
		return redirect(routes.Application.tasks());
	}
}
