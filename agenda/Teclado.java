package agenda;

import java.util.Scanner;

class Teclado {
    public static String leer(String texto) {
        Scanner input = new Scanner(System.in);
        Pantalla.escribir(texto);

        String result = input.nextLine();

        return result;
    }
}
