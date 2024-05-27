package Desemvolupament;

import java.util.HashMap;

public class GestorLlibres {
    private HashMap<Integer, Llibre> llibreria;

    public GestorLlibres() {
        this.llibreria = new HashMap<>();
    }

    public void prestar(int id, String usuario) {
        Llibre llibre = this.llibreria.get(id);
        if (llibre != null && llibre.disponible()) {
            llibre.prestar(usuario);
        } else {
            System.out.println("El llibre no està disponible.");
        }
    }

    public void tornar(int id, String usuario) {
        Llibre llibre = this.llibreria.get(id);
        if (llibre != null && !llibre.disponible() && llibre.getUsuari().equals(usuario)) {
            llibre.tornar();
        } else {
            System.out.println("No es pot tornar el llibre.");
        }
    }

    public void afegir(int id, Llibre llibre) {
        this.llibreria.put(id, llibre);
    }
}

class Llibre {
    private String titol;
    private String autor;
    private boolean prestat;
    private String usuario;

    public Llibre(String titol, String autor) {
        this.titol = titol;
        this.autor = autor;
        this.prestat = false;
    }

    public void prestar(String usuario) {
        this.prestat = true;
        this.usuario = usuario;
    }


public void tornar() {
    this.prestat = false;
    this.usuario = null;
}

public boolean disponible() {
    return !this.prestat;
}

public String getUsuari() {
    return this.usuario;
}
}