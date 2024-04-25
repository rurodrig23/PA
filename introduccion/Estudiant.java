package introduccion;

public class Estudiant {
    private String nom;
    private int edat;
    private int curs;



    public Estudiant(String nom , int edat , int curs){

        this.nom = nom;
        this.edat = edat;
        this.curs = curs;

}


    public String getNom(){
        return this.nom;
}

    public void setNom(String nom_new){
        this.nom = nom_new;

}
}