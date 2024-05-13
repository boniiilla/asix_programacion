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
        books.put((T) "Novela", new ArrayList<Book>());
        books.put((T) "Ciencia-Ficcio", new ArrayList<Book>());
    }

    public void addBooks(String title, T genere){
        Book libro = new Book(title);
        books.get(genere).add(libro);
    }
    public void deleteBook(String title, T genere){
        books.get(genere).remove(title);
    }

    public void searchBook(String title){}

    public void printAllBooks(){
        for (Book llibre: books.get((T)"Ciencia-Ficcio")) {
            System.out.println(llibre);
        }
        for (Book llibre: books.get((T)"Novela")) {
            System.out.println(llibre);
        }
        for (Book llibre: books.get((T)"Poesia")) {
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
        biblioteca.addBooks("Harry Potter", (T)"Ciencia-Ficcio");
        System.out.println("Totes els llibres: ");
        biblioteca.printAllBooks();
        System.out.println("Eliminar llibre");
        biblioteca.deleteBook("Harry Potter", (T)"Ciencia-Ficcio");
        System.out.println("Totes els llibres: ");
        biblioteca.printAllBooks();


    }
}