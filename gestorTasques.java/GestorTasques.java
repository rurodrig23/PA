import java.util.HashMap;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;

class TaskManagement
{
	HashMap<String, ArrayList<Task>> lists;
	HashMap<Integer, Task> tasks;
	String nom_archivo;

	public TaskManagement(String nom_archivo) {
		this.nom_archivo = nom_archivo;
		lists = new HashMap<String, ArrayList<Task>>();
		lists.put("Pendiente", new ArrayList<Task>());
		lists.put("En curso", new ArrayList<Task>());
		lists.put("Completada", new ArrayList<Task>());
		tasks = new HashMap<Integer, Task>();
	}

	public void addTask(String taskName, String priority) {
		Task task = new Task(String title, String description, String datavenc, String status);
		lists.get(priority).add(task);
		tasks.put(task.getId(), task);
	}

	public void doneTask(int taskId) {
		tasks.get(taskId).done();
	}

	public void deleteTask(int taskId) {
		tasks.remove(taskId);
	}

	public void printAllTask() {
		tasks.forEach((key, task) -> {
			System.out.println(task);
		}
		);
	}

	public void printTaskByPriority(String priority) {
		System.out.println("Tareas de prioridad: " + priority);
		for (Task task: lists.get(priority)) {
			System.out.println(task);
		}
	}
}

class Main
{
	public static void main(String[] args) {
		TaskManagement manager = new TaskManagement();
		System.out.println("Add task");
		manager.addTask("Aprobar Programacion", "Alta");
		System.out.println("Hacemos Print de todo");
		manager.printAllTask();
		System.out.println("Hacemos Print de prioridad");
		manager.printTaskByPriority("Alta");
		System.out.println("Hacemos que la tarea este done");
		manager.doneTask(1);
		System.out.println("Hacemos Print de todo");
		manager.printAllTask();
		System.out.println("Eliminamos la tarea");
		manager.deleteTask(1);
		System.out.println("Hacemos Print de todo");
		manager.printAllTask();
	}
}