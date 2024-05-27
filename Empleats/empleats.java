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


    public class EmpleatPerHores extends empleats {
        private int horesTreballades;
        private double tarifaPerHora;

    public EmpleatPerHores(String nom, double tarifaPerHora, int horesTreballades) {
        this.nom = nom;
        this.tarifaPerHora = tarifaPerHora;
        this.horesTreballades = horesTreballades;
        this.calcularSalari();
    }

    public void calcularSalari() {
        this.salari = this.tarifaPerHora * this.horesTreballades;
    }
}
}
