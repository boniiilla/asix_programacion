package pr_database.model;

import java.util.HashMap;

public class GestioLlibres {
    private HashMap<Integer, Book> biblio;

    public GestioLlibres(){
        biblio = new HashMap<Integer, Book>();
    }

    public void addBooks(String title){
        Book libro = new Book(title);
        biblio.put(libro.getId(), libro);
    }
    public void deleteBook(int bookId){
        biblio.remove(bookId);
    }

    public void printAllBooks(){
        biblio.forEach((key, book) -> {
            System.out.println(book);
        });
    }
}
