class Libro (titulo: String, autor: String, cantidad: Int) {
    var titulo: String
    var autor: String
    var cantidad: Int

    constructor() {
        this.titulo = titulo
        this.autor = autor
        this.cantidad = cantidad
    }

    fun informacion() {
        println("Titulo: $this.titulo, Autor: $this.autor, Cantidad: $this.cantidad")
    }
}

class Socio (nombre: String, apellido: String, id: Int) {
    var nombre: String
    var apellido: String
    var id: Int

    constructor() {
        this.nombre = titulo
        this.apellido = autor
        this.id = cantidad
    }

    fun informacion() {
        println("Nombre: $this.nombre, Apellido: $this.apellido, ID: $this.id")
    }
}

class Prestamo {

}

class Main {
    val libro1: Libro = Libro("LOTR", "J.R.R. Tolkien", 2)
    val libro2: Libro = Libro("1984", "J.R.R. Tolkien", 2)

    val socio1: Socio = Socio("Izan", "Lozano", 101)
    val socio2: Socio = Socio("Carlos", "Bonilla", 202)

    // val prestamo1 : Prestamo = Prestamo(libro1, socio1, "2024-03-15")
    // val prestamo2 : Prestamo = Prestamo(libro2, socio2, "2024-03-15")

    // prestamo1.registrarPrestamo()
    libro1.informacion()
    socio1.informacion()
    // prestamo1.devolverPrestamo()
    libro1.informacion()
}

fun main() {
    Main()
}