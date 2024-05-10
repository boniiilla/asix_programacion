package GestioAventura;

class Personatge {
    private String nom;
    private int nivell;
    private int puntsMana;
    private int puntsVida;
    private String arma;
    private String armadura;

    public Personatge(String nom, int nivell, int puntsVida, int puntsMana, String arma, String armadura){
        this.nom = nom;
        this.nivell = nivell;
        this.puntsVida = puntsVida;
        this.puntsMana = puntsMana;
        this.arma = arma;
        this.armadura = armadura;
    }

    public void setArma(String a){
        this.arma = a;
    }

    public void setArmadura(String ad){
        this.armadura = ad;
    }

    public void newLevel(int puntsVida, int puntsMana) {
        this.nivell++;
        this.puntsVida = this.puntsVida + puntsVida;
        this.puntsMana = this.puntsMana + puntsMana;
    }

    public String getPersonatge() {
        return "Nom: " + this.nom +
        "\nNivell: " + this.nivell +
        "\nPunts de vida: " + this.puntsVida +
        "\nPunts de mana: " + this.puntsMana +
        "\nArma: " + this.arma + 
        "\nArmadura: " + this.armadura;
    }
}

class Main {
    public static void main(String[] args) {
        Personatge voldemort = new Personatge("Voldemort", 1, 1000, 150, "Varita mortal", "Capa");
        voldemort.newLevel(150, 50);
        System.out.println(voldemort.getPersonatge());

        System.out.println("---------------------------");

        Personatge harrypotter = new Personatge("Harry Potter", 1, 750, 100, "Varita Sagrada", "Uniforme Grifingdor");
        System.out.println(harrypotter.getPersonatge());
    }
}
