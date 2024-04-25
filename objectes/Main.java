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

        Tasques tasca1 = new objectes.Tasques("Tender la ropa", "Pendiente");
        Tasques tasca2 = new objectes.Tasques("Lavar los platos", "Realizado");

        Tasques[] tasques = {tasca1, tasca2};
        
        for (Tasques tasca: tasques) {
            System.out.println("Descripcion: " + tasca.getDescripcio());
            System.out.println("Estado: " + tasca.getEstat());
        }
    }
}
