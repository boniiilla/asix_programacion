package pacman;

class Inky {
    private int newposX; 
    private int newposY;

    public Inky(int newposX, int newposY) {
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
