package Book.JavaDatabaseExample.src.main.java.com.example.database;

import Book.JavaDatabaseExample.src.main.java.com.example.database.model.Book;

public class Main {
    public static void main(String[] args) {
            DatabaseManager dbManager = new DatabaseManager();
            dbManager.connect();
    
            // Crear un nou estudiant
            Book book = new Book("Harry Potter");
            dbManager.addBooks(book);
    
            // Recuperar estudiant
            Book retrievedBook = dbManager.getBook(1);
            System.out.println(retrievedBook);
    
            // Actualiztzar estudiant
            book.setTitol("Harry and Potter");
            dbManager.updateBook(book);
    
            // Eliminar estudiant
            dbManager.deleteStudent(1);
    
            dbManager.disconnect();
    }
}
