package objectes;


class Main {
    public static void main(String[] args) {
        Estudiant estudiante = new objectes.Estudiant("Carlos", 18, 1);
        estudiante.setNom("Izan");
        estudiante.setEdat(20);
        System.out.println(estudiante.getNom());
        System.out.println(estudiante.getEdat());

    }
}