package gestor_tasques;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        GestorTasques gtasques = new GestorTasques();

        System.out.println("Introdueix la tasca: ");
        String tasca = sc.next();
        System.out.println("Introdueix la prioritat: ");
        String prioritat = sc.next();
        String estat = "Pendent";

        gtasques.afegirTasca(tasca, prioritat, estat);
    }
}
