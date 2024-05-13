package gestio_llibres;

import java.util.HashMap;
import java.util.ArrayList;

class Novela {
    private String title;
    public Novela(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }
}

class CienciaFiccio {
    private String title;
    public CienciaFiccio(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }
}

class Poesia {
    private String title;
    public Poesia(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }
}

class LlistaLlibres<T> {
    private HashMap<T, ArrayList<Book>> books;

    public LlistaLlibres(){
        books = new HashMap<T, ArrayList<Book>>();
        books.put((T) "Poesia", new ArrayList<Book>());
        books.put((T)"Novela", new ArrayList<Book>());
        books.put((T)"Ciencia-Ficcio", new ArrayList<Book>());
    }

    public void addBooks(T genere, String title){
        Book libro = new Book(title);
        books.get(genere).add(libro);
    }

    public void deleteBook(){}

    public void searchBook(String title){}

    public void printAllBooks(T genere){
        System.out.println("\nLlibres de genere: " + genere);
        for (Book llibre: books.get(genere)) {
            System.out.println(llibre);
        }
    }
}

class Book {
    private String titol;

    public Book(String titol) {
        this.titol = titol;
    }

    public String getTitol(){
        return this.titol;
    }

    public String toString(){
        return this.titol;
    }
}

class Main {
    public static <T> void main(String[] args) {
        LlistaLlibres<T> biblioteca = new LlistaLlibres<T>();

        System.out.println("Add book");
        biblioteca.addBooks((T)"Ciencia-Ficcio", "Harry Potter");
        System.out.println("Totes els llibres: ");
        biblioteca.printAllBooks((T)"Ciencia-Ficcio");
        biblioteca.printAllBooks((T)"Novela");
        biblioteca.printAllBooks((T)"Poesia");

    }
}