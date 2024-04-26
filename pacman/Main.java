package pacman;

public class Main {
    public static void main(String[] args) {
        Pacman pacman = new pacman.Pacman(0, 0, 0, 3);
        
        System.out.println(pacman.getnewPosX());
        System.out.println(pacman.getLifes());
    }

}
