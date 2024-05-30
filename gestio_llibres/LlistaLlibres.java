package gestio_llibres;

import java.util.HashMap;



class LlistaLlibres {
    private HashMap<Integer, Book> biblio;

    public LlistaLlibres(){
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
    public static  void main(String[] args) {
        LlistaLlibres biblioteca = new LlistaLlibres();

        System.out.println("Add book");
        biblioteca.addBooks("Harry Potter");
        System.out.println("Totes els llibres: ");
        biblioteca.printAllBooks();
        System.out.println("Eliminar llibre");
        biblioteca.deleteBook(1);
        System.out.println("Totes els llibres: ");
        biblioteca.printAllBooks();
    }
}