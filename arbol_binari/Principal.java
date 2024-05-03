package arbol_binari;

import java.util.Scanner;

public class Principal {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Elaborar el arbol
        ArbreBinari_Enters ab_enters = new ArbreBinari_Enters();
        obtenerArbol(ab_enters);
    }

    private static void obtenerArbol(ArbreBinari_Enters ab_enters) {
        System.out.println("Quina fondaria te el arbre?");
        int fondaria = sc.nextInt();
        System.out.println("Introdueix el numero pare:");
        int numero_pare = sc.nextInt();

        Integer[] fills = new Integer[1]; 
        for (int i = 1; i < fondaria; i++){
            for (int j = 0; j < Math.pow(2, i); j++){
                System.out.println("Introdueix els 2 fills per al pare: " + numero_pare);
                Integer fill = sc.nextInt();
            }
        }

    }
}
