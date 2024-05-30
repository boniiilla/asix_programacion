package Book.JavaDatabaseExample.src.main.java.com.example.database.model;

public class Book {
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

    public void setTitol(String n){
        this.titol = n;
    }

    public int getId(){
        return id;
    }

    public String toString(){
        return "ID: " + id + " Name: " + this.titol;
    }
}
