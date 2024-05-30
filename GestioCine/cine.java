package GestioCine;
import java.sql.*;


class GestioCine {
    public static Connection getConnection() {
        String url = "jdbc:mysql://192.168.56.101:3306/cine";
        String user = "root";
        String password = "P@ssw0rd3";
        
        try {
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}