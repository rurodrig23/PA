package Desemvolupament;

import java.util.HashMap;

public class GestorLlibres {
    private HashMap<Integer, Llibre> llibreria;

    public GestorLlibres() {
        this.llibreria = new HashMap<>();
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
}