package Implementacion;
import trees.arbreBinari;
import trees.arbre;

public class App {

    public static void main(String[] args) {

        arbreBinari intArbol1 = new arbreBinari(5);
        arbreBinari intArbol2 = new arbreBinari(5);



        System.out.println("Contador de arboles: " + arbreBinari.count);

        arbreBinari charArbol1 = new arbreBinari(3);
        arbreBinari charArbol2 = new arbreBinari(3);

        System.out.println("Contador de arboles: " + arbreBinari.count);;

        System.gc();


    public static void recorridoDerecha(arbreBinari){


    }
    
    public static void recorridoIzquierda(arbreBinari){

        
    }  


    System.out.println("Recorrido del arbol entero con la rama derecha: " );
    recorridoDerecha;


    System.out.println("Recorrido del arbol entero con la rama izquierda: " );
    recorridoIzquierda;
    }
}