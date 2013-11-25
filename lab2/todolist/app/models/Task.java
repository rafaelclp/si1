package models;

import java.util.Arrays;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import play.data.validation.Constraints.Required;
import play.db.ebean.Model;

@Entity
@SuppressWarnings("serial")
public class Task extends Model implements Comparable<Task> {
	/**
	 * Identificador da tarefa
	 */
	@Id
	public Long id;

	/**
	 * Informa se a tarefa está completa ou não.
	 */
	public boolean completed = false;

	/**
	 * Chaves de uma tarefa requisitadas ao usuário.
	 */
	@Required
	public String label;

	@Required
	public String description;

	@Required
	public String project;

	@Required
	public int priority;

	/**
	 * Permite realizar queries de busca ao banco de dados.
	 */
	public static Finder<Long, Task> find = new Finder<Long, Task>(Long.class,
			Task.class);

	/**
	 * Retorna uma lista com todas as tarefas criadas.
	 * 
	 * @return Lista com as tarefas.
	 */
	public static List<Task> all() {
		return find.all();
	}

	/**
	 * Compara esta a outra tarefa e informa se esta é menor (-1), igual (0)
	 * ou maior (1). Consideramos menor a que tem menor prioridade.
	 */
	public int compareTo(Task other) {
		int result = 0;
		if (other.priority < priority) {
			result = 1;
		} else if (other.priority > priority) {
			result = -1;
		}
		return result;
	}

	/**
	 * Ordena uma lista de tarefas pela prioridade.
	 * 
	 * @param tasksList
	 *            Lista a ser ordenada.
	 * @return Referência para a lista ordenada.
	 */
	public static List<Task> sortByPriority(List<Task> tasksList) {
		Task[] tasks = new Task[tasksList.size()];
		tasksList.toArray(tasks);
		Arrays.sort(tasks);
		for (int i = 0; i < tasks.length; i++) {
			tasksList.set(i, tasks[i]);
		}
		return tasksList;
	}

	/**
	 * Procura uma tarefa pelo id.
	 * 
	 * @param id
	 *            Id da tarefa que se deseja encontrar.
	 * @return Uma referência para a tarefa, caso exista, ou null.
	 */
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

	/**
	 * Salva uma tarefa no banco de dados.
	 * 
	 * @param task
	 *            A tarefa a ser salva.
	 */
	public static void create(Task task) {
		task.save();
	}

	/**
	 * Remove uma tarefa do banco de dados, caso exista.
	 * 
	 * @param id
	 *            Id da tarefa a ser removida.
	 */
	public static void delete(Long id) {
		try {
			find.ref(id).delete();
		} catch (Exception e) {
		}
	}
}