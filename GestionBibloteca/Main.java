package GestionBibloteca;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        Connection conn = GestionBibloteca.getConnection();
        if (conn != null) {
            System.out.println("Conexión establecida con éxito");
        } else {
            System.out.println("Error al establecer la conexión");
        }
    }
}
