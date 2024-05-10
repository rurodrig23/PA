package GestioAventura;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import java.io.*;

public class Personaje {
    private String nombre;
    private int nivel;
    private int puntosDeVida;
    private int puntosDeMana;
    private String arma;
    private String armadura;



    public Personaje(String nombre, int nivel, int puntosDeVida, int puntosDeMana, String arma, String armadura){

    this.nombre = nombre;
    this.nivel = nivel;
    this.puntosDeVida = puntosDeVida;
    this.puntosDeMana = puntosDeMana;
    this.arma = arma;
    this.armadura = armadura;
    }

}