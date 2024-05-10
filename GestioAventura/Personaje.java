package GestioAventura;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import java.io.*;

public class Personaje<T> {
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




    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getNivel(){
        return nivel;

    }
    public void setNivel(int nivel){
        this.nivel = nivel;
        }    

    public int getPuntosDeVida(){
        return puntosDeVida;

    }

    public void setPuntosDeVida(int puntosDeVida) {
        this.puntosDeVida = puntosDeVida;
    }

    public int getPuntosDeMana(){
        return puntosDeMana;

    }

    public void setPuntosDeMana(int puntosDeMana) {
        this.puntosDeMana = puntosDeMana;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }
    public String getArmadura() {
        return armadura;
    }

    public void setArmadura(String armadura) {
        this.armadura = armadura;
    }
}