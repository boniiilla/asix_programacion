package gestio_llibres;

import java.util.HashMap;

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
    private HashMap<T, String[]> books;

    public LlistaLlibres(){
        books = new HashMap<T, String[]>();
    }

    public void addBooks(T genere, String title){
        
    }

    public void deleteBook(){}

    public void searchBook(String title){}

    public void printAllBooks(){}
}

class Main {
    public static void main(String[] args) {
        
    }
}