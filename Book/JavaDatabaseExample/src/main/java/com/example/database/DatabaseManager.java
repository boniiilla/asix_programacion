package Book.JavaDatabaseExample.src.main.java.com.example.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Book.JavaDatabaseExample.src.main.java.com.example.database.model.Book;

public class DatabaseManager {
    private Connection connection;

    public void connect() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://192.168.133.3:3306/book", "root", "@MVM2016");
            System.out.println("Connexio establerta.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void disconnect() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("Connexio tancada");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Book getBook(int id) {
        String query = "SELECT * FROM llibre WHERE id = ?";

        try {
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return new Book(rs.getString("nom"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void addBooks(Book book) {
        String query = "INSERT INTO llibre (id, nom) VALUES (?, ?)";

        try {
            PreparedStatement stmt = connection.prepareStatement(query);

            stmt.setInt(1, book.getId());
            stmt.setString(2, book.getTitol());
            stmt.executeUpdate();
            System.out.println("Llibre afegit.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateBook(Book book) {
        String query = "UPDATE llibre SET nom = ? WHERE id = ?";

        try {
            PreparedStatement stmt = connection.prepareStatement(query);

            stmt.setString(1, book.getTitol());
            stmt.setInt(2, book.getId());
            stmt.executeUpdate();
            System.out.println("Llibre modificat.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteStudent(int id) {
        String query = "DELETE FROM llibre WHERE id = ?";

        try {
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setInt(1, id);
            stmt.executeUpdate();
            System.out.println("Llibre eliminat.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
