package notes_alumnes;

class Main {
    public static void main(String[] args) {
        GestorNotes gestornotes = new GestorNotes();
        CalculadoraEstadistiques calcular = new CalculadoraEstadistiques();
        
        String nombre = "Carlos Bonilla";
        double[] notes = {8.50, 7.00, 9.67};

        gestornotes.registrarNotes(nombre, notes);

        System.out.println(gestornotes.obtenirNotes(nombre));


    }
}
