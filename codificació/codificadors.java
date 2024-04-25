package codificació;

class ClasseA {
    private String nom;
    private String autor;
    private int duradaSegons;
    public String getNom(){
        return this.nom;
    }
    public String getAutor(){
        return this.autor;
    }
    public int getDuradaSegons(){
        return this.duradaSegons;
    }
    public void setNom(String n){
        this.nom = n;
    }
    public void setAutor(String a){
        this.autor = a;
    }
    public void setduradaSegons(int d){
        this.duradaSegons = d;
    }
}
