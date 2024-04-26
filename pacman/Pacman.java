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

    
}
