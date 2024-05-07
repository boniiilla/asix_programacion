package gestor_tasques;

import java.util.HashMap;
import java.util.Scanner;

public class GestorTasques {
    private static Scanner sc = new Scanner(System.in);

    HashMap<String, HashMap<String, String>> tasques = new HashMap<String, HashMap<String, String>>();

    public void afegirTasca(String tasca, HashMap<String, String> prioritat_estat){
        System.out.println("Pioritat de la tasca: ");
        String prioritat = sc.next();
        prioritat_estat.put(prioritat, "Pendent");
    }
}
