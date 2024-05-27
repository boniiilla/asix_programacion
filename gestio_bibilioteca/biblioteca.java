package gestio_bibilioteca;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class biblioteca {
    public static Connection getConnection() {
        String url = "x";
        String user = "root";
        String password = "@MVM2016";
        try {
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}