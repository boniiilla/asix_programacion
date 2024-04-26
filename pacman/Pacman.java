package pacman;

class Pacman {
    private int newposX; 
    private int newposY;
    private int puntuacio;
    private int lifes;

    public Pacman(int newposX, int newposY, int puntuacio, int lifes) {
        this.newposX = newposX;
        this.newposY = newposY;
        this.puntuacio = puntuacio;
        this.lifes = lifes;
    }
    /** Getters **/
    public int getnewPosX(){
        return this.newposX;
    }
    public int getnewPosY(){
        return this.newposY;
    }
    public int getpuntutacio(){
        return this.puntuacio;
    }
    public int getLifes(){
        return this.lifes;
    }

    public void move(){
        String[] opciones = {
            "W - Arriba",
            "A - Derecha",
            "S - Abajo",
            "D - Izquierda"
        };

        for (String opcion :opciones) {
            Pantalla.escribir(opcion);
        };

        String opcion = Teclado.leer("");

        if (opcion == "w") {
            newposY++;
        } else if (opcion == "a") {
            newposX--;
        } else if (opcion == "s") {
            newposY--;
        } else if (opcion == "d") {
            newposX++;
        };
    }
}
