package notes_alumnes;

class CalculadoraEstadistiques {
    public double calcularMitjana(double[] notes){
        double mitjana;
        double suma_notes = 0;

        for (double num : notes){
            suma_notes = num + suma_notes;
        }

        int size_notes = notes.length;

        mitjana = suma_notes / size_notes;

        return mitjana;
    }
}
