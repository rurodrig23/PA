package gestorTasques;

import java.text.ParseException;

class Main
{
	public static void main(String[] args) {
		TaskManagement manager = new TaskManagement("archivo.txt");


        try {        
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
        } catch (ParseException e) {
        System.out.println("Error al procesar la fecha: " + e.getMessage());
    }
        }
	}
