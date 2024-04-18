package calculadora;

import java.util.Scanner;

class Teclado {
    public static String leer(String texto) {
        Scanner input = new Scanner(System.in);
        Pantalla.Escribir(texto);

        String result = input.nextLine();

        return result;
    }
}
