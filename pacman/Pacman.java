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
    public int getpuntuacio(){
        return this.puntuacio;
    }
    public int getLifes(){
        return this.lifes;
    }
    /*Altres metodes Pacman*/
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
        /*Cada vez que leamos alguno de los caracteres WASD sumaremos o restaremos posiciones */
        String opcion = Teclado.leer("");

        if (opcion == "w") {
            this.newposY++;
        } else if (opcion == "a") {
            this.newposX--;
        } else if (opcion == "s") {
            this.newposY--;
        } else if (opcion == "d") {
            this.newposX++;
        };
    }
    public void pickupBola(){

    }
    public void pickupBolaEspecial() {

    }
    public void pickupFruita() {

    }
    public void loseLife() {

    }
    public void detectColisionFantasma(Blinky blinky, Inky inky, Pinky pinky, Clyde clyde) {
        
    }

}
