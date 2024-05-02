package alumnes;

public class GestorNotes{

    private double[][] notesAlumnes;
    private String[] nomAlumnes;
    private int count;

    public GestorNotes(int numAlumnes, int numAssignatures)

        notesAlumnes= new double[numAlumnes][numAssignatures];
        nomAlumnes = new String [numAlumnes];
        count=0;
}
    public void resgistarNotes(String nomAlumne, double[] notes) {
        nomAlumnes[count] = nomAlumne;
        notesAlumnes[count] = notes;
        count++;

    public double[] obtenirNotes(){

      

    }

  }

