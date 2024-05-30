package com.example.database;
import Students.JavaDatabaseExample.src.main.java.DatabaseManager;

public class Main {
    public static void main(String[] args) {
        DatabaseManager dbManager = new DatabaseManager();
        dbManager.connect();


        // Crear un nou estudiant
        Llibre student = new Llibre(1, "pepito", "Garcia");
        dbManager.addStudent(student);


        // Recuperar estudiant
        LlistaLlibres retrievedStudent = dbManager.getLlibre(1);
        System.out.println(retrievedStudent);


        // Actualitzar estudiant
        Llibre.setLastName("Martínez");
        dbManager.updateStudent(student);


        // Eliminar estudiant
        dbManager.deleteLLibre(1);


        dbManager.disconnect();
    }
}

