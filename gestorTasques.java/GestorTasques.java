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
		lists.put("Baja", new ArrayList<Task>());
		lists.put("Media", new ArrayList<Task>());
		lists.put("Alta", new ArrayList<Task>());
		tasks = new HashMap<Integer, Task>();
	}

	public void addTask(String taskName, String priority) {
		Task task = new Task(taskName);
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

class Task 
{
	private static int numInstances = 0;
	private int id;
	private String name;
	private boolean isDone;

	public Task(String name) {
		this.name = name;
		this.isDone = false;
		this.id = ++numInstances;
	}

	public void done() {
		this.isDone = true;
	}

	public int getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public boolean isDone() {
		return this.isDone;
	}

	public String toString() {
		return "Id:" + id.toString() + " Name: " + name + "Is done:" + isDone.toString();
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