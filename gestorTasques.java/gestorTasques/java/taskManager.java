package gestorTasques.java;
import java.util.HashMap;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;

class TaskManagement
{
	HashMap<String, ArrayList<Task>> lists;
	HashMap<Integer, Task> tasks;
	String fileName;

	public TaskManagement(String nom_archivo) {
		this.fileName = nom_archivo;
		lists = new HashMap<String, ArrayList<Task>>();
		lists.put("Pendiente", new ArrayList<Task>());
		lists.put("En curso", new ArrayList<Task>());
		lists.put("Completada", new ArrayList<Task>());
		tasks = new HashMap<Integer, Task>();
		
	}

	public void addTask(String title, String description, String dueDate, String status) throws ParseException {
        Task task = new Task(title, description, dueDate, status);
        lists.get(status).add(task);
        tasks.put(task.getId(), task);
        
    }

	public void doneTask(int taskId) {
        Task task = tasks.get(taskId);
        task.setStatus("Completada");
    }

	public void deleteTask(int taskId) {
        Task task = tasks.get(taskId);
        lists.get(task.getStatus()).remove(task);
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