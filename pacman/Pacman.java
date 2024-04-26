package pacman;

class Pacman {
    public void move(int newposX, int newposY){
        String[] opciones = {
            "W - Arriba",
            "A - Derecha",
            "S - Abajo",
            "D - Izquierda"
        };
        
        for (String opcion :opciones) {
            Pantalla.escribir(opcion);
        };

        String opcion = Teclado.leer(null);

        if (opcion == "w") {
            newposY++;
        } else if (opcion == "a") {
            newposX--;
        } else if (opcion == "s") {
            newposY--;
        } else if (opcion == "d") {
            newposX++;
        };
    }
}
