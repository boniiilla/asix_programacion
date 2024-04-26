package pacman;

class Blinky {
    private int newposX; 
    private int newposY;

    public Blinky(int newposX, int newposY) {
        this.newposX = newposX;
        this.newposY = newposY;
    }

    public int getnewPosX(){
        return this.newposX;
    }
    public int getnewPosY(){
        return this.newposY;
    }
}
