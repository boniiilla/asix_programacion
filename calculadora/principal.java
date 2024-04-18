package calculadora;

class Principal {
    public static void main(String[] args) {
        String[] opciones = {
            "1 - Sumar",
            "2 - Restar",
            "3 - Multiplicar",
            "4 - Dividir",
            "5 - Ecuacion de segundo grado"
        };

        for (String opcion :opciones) {
            Pantalla.escribir(opcion);
        };

        String opcion = Teclado.leer(opciones);
    }
}
