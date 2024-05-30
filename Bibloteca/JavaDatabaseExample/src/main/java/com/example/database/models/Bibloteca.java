package Bibloteca.JavaDatabaseExample.src.main.java.com.example.database.models;
import java.util.HashMap;
import java.util.Map;

class LlistaLlibres {
    private Map<Integer, Libro> biblioteca;

    public LlistaLlibres() {
        biblioteca = new HashMap<>();
    }

    public void agregarLibro(String titulo) {
        Libro libro = new Libro(titulo);
        biblioteca.put(libro.getId(), libro);
    }

    public void eliminarLibro(int idLibro) {
        biblioteca.remove(idLibro);
    }

    public void imprimirTodosLosLibros() {
        for (Libro libro : biblioteca.values()) {
            System.out.println(libro);
        }
    }
}

class Libro {
    private static int numInstancias = 0;
    private String titulo;
    private int id;

    public Libro(String titulo) {
        this.titulo = titulo;
        id = ++numInstancias;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "ID: " + id + " Título: " + titulo;
    }
}

class Principal {
    public static void main(String[] args) {
        LlistaLlibres biblioteca = new LlistaLlibres();

        System.out.println("Agregar libro");
        biblioteca.agregarLibro("Piratas del caribe");
        System.out.println("Todos los libros: ");
        biblioteca.imprimirTodosLosLibros();
        System.out.println("Eliminar libro");
        biblioteca.eliminarLibro(1);
        System.out.println("Todos los libros: ");
        biblioteca.imprimirTodosLosLibros();
    }
}