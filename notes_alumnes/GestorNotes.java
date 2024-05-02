package notes_alumnes;

import java.util.Scanner;

class GestorNotes {

    public void registrarNotes(String nomAlumne, double[] notes){
        Scanner input = new Scanner(System.in);

        System.out.println("Introduce el numero de notas para registrar: ");
        int num_notes = input.nextInt();

        notes = new double[num_notes];

        System.out.println("Introduce las notas del alumno: ");
        for (int i = 0; i < num_notes; i++) {
            System.out.println("Nota" + i + 1 + ":");
            notes[i] = input.nextDouble();
        }
        
    }

    public double[] obtenirNotes(String nomAlumne) {
        return notes;
    }
}