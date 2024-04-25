package objectes;

class Estudiant {
    private String nom;
    private int edat;
    private int curs;
    public Estudiant(String nom, int edat, int curs){
        this.nom = nom;
        this.edat = edat;
        this.curs = curs;
    }

    public String getNom(){
        return this.nom;
    }
    
    public int getEdat(){
        return this.edat;
    }

    public int getCurs(){
        return this.curs;
    }

    public void setNom(String n){
        this.nom = n;
    }

    public void setEdat(int e){
        this.edat = e;
    }
    
    public void setCurs(int c){
        this.curs = c;
    }
}
