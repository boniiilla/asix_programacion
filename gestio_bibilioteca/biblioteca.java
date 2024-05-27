package gestio_bibilioteca;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class biblioteca {
    public static Connection getConnection() {
        String url = "jdbc:mysql://192.168.133.3:3306/biblio";
        String user = "root";
        String password = "@MVM2016";
        try {
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        biblioteca.getConnection();
    }   
}
