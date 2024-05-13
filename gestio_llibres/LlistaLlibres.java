package gestio_llibres;

import java.util.HashMap;
import java.util.ArrayList;


class LlistaLlibres<T> {
    private HashMap<Integer, Book> biblio;
    private HashMap<T, ArrayList<Book>> books;

    public LlistaLlibres(){
        biblio = new HashMap<Integer, Book>();
        books = new HashMap<T, ArrayList<Book>>();
        books.put((T) "Poesia", new ArrayList<Book>());
        books.put((T) "Novela", new ArrayList<Book>());
        books.put((T) "Ciencia-Ficcio", new ArrayList<Book>());
    }

    public void addBooks(String title, T genere){
        Book libro = new Book(title);
        books.get(genere).add(libro);
        biblio.put(libro.getId(), libro);
    }
    public void deleteBook(int bookId){
        biblio.remove(bookId);
    }

    public void searchBook(String title){
        
    }

    public void printAllBooks(){
        biblio.forEach((key, book) -> {
            System.out.println(book);
        });
    }
}

class Book {
    private static int numInstances = 0;
    private String titol;
    private int id;

    public Book(String titol) {
        this.titol = titol;
        id = ++numInstances;
    }

    public String getTitol(){
        return this.titol;
    }

    public int getId(){
        return id;
    }

    public String toString(){
        return "ID: " + id + " Name: " + this.titol;
    }
}

class Main {
    public static <T> void main(String[] args) {
        LlistaLlibres<T> biblioteca = new LlistaLlibres<T>();

        System.out.println("Add book");
        biblioteca.addBooks("Harry Potter", (T)"Ciencia-Ficcio");
        System.out.println("Totes els llibres: ");
        biblioteca.printAllBooks();
        System.out.println("Eliminar llibre");
        biblioteca.deleteBook(1);
        System.out.println("Totes els llibres: ");
        biblioteca.printAllBooks();
    }
}