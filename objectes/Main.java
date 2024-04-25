package objectes;


class Main {
    public static void main(String[] args) {
        Estudiant estudiante = new objectes.Estudiant("Carlos", 18, 1);

        estudiante.setNom("Izan");
        estudiante.setEdat(20);
        
        System.out.println("Nombre: " +estudiante.getNom());
        System.out.println("Edad: " + estudiante.getEdat());

        Cercle medidas = new objectes.Cercle(10.00);

        System.out.println("Area del circulo: " + medidas.getArea());
    }
}
