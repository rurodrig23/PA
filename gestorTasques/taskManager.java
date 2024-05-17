package gestorTasques;
import java.util.HashMap;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

class TaskManagement
{
	File file = new File("/home/alumne_1r/Escriptori/PA/gestorTasques.java/archivo.txt");
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
		loadTasksFromFile();
	}

	public void addTask(String title, String description, String dueDate, String status) throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date date = (Date) format.parse(dueDate);
		Task task = new Task(title, description, date, status);
		lists.get(status).add(task);
		tasks.put(task.getId(), task);
		saveTasksToFile();
	}
	
     
	public void doneTask(int taskId) {
        Task task = tasks.get(taskId);
        task.setStatus("Completada");
		saveTasksToFile();
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

	private void loadTasksFromFile() {
        try {
            File file = new File(fileName);
            if (file.exists()) {
                BufferedReader reader = new BufferedReader(new FileReader(file));
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] fields = line.split(",");
				}
				reader.close();

				}
			} catch (IOException e) {
				System.out.println("Error loading tasks from file: " + e.getMessage());
			}
			}


			private void saveTasksToFile() {
				try {
					BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
					for (Task task : tasks.values()) {
						writer.write(task.toString());
						writer.write("\n");
					}
					writer.close();
				} catch (IOException e) {
					System.out.println("Error saving tasks to file: " + e.getMessage());
				}
			}
		}
	
	