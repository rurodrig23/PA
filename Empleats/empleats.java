package Empleats;

public class empleats {
    protected String nom;
    protected double salari;

    public empleats(String nom, double salari) {
        this.nom = nom;
        this.salari = salari;
    }

    public void imprimirDetalls() {
        System.out.println("Nom: " + nom + ", Salari: " + salari);
    }
}
