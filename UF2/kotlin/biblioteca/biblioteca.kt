class Libro {
    
}

class Socio {
    
}

class Prestamo {

}

class Main {
    val libro1: Libro = Libro("LOTR", "J.R.R. Tolkien", 2)
    val libro2: Libro = Libro("1984", "J.R.R. Tolkien", 2)

    val socio1: Socio = Socio("Izan", "Lozano", 101)
    val socio2: Socio = Socio("Carlos", "Bonilla", 202)

    val prestamo1 : Prestamo = Prestamo(libro1, socio1, "2024-03-15")
    val prestamo1 : Prestamo = Prestamo(libro2, socio2, "2024-03-15")

    prestamo1.registrarPrestamo()
    libro1.informacion()
    socio1.informacion()
    prestamo1.devolverPrestamo()
    libro1.informacion()
}

fun main() {
    Main()
}