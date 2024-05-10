package GestioAventura;

class Personatges {
    private String nom;
    private int nivell;
    private int puntsMana;
    private int puntsVida;
    private String arma;
    private String armadura;

    public Personatges(String nom, int nivell, int puntsVida, int puntsMana, String arma, String armadura){
        this.nom = nom;
        this.nivell = nivell;
        this.puntsVida = puntsVida;
        this.puntsMana = puntsMana;
        this.arma = arma;
        this.armadura = armadura;
    }

    public String getNom(){
        return this.nom;
    }

    public String getPersonatge() {
        return "Nom:" + this.nom +
        "Nivell: " + this.nivell +
        "Punts de vida: " + this.puntsVida +
        "Punts de mana: " + this.puntsMana +
        "Arma: " + this.arma + 
        "Armadura: " + this.armadura;
    }
}

class Main {
    public static void main(String[] args) {
        
    }
}
