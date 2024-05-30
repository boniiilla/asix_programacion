package pr_database.model;

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

    public int getId(){
        return id;
    }

    public String toString(){
        return "ID: " + id + " Name: " + this.titol;
    }
}
