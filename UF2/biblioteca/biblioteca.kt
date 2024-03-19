class Libro (var titulo: String, var autor: String, var cantidad: Int) {
    fun informacion() {
        println("Titulo: ${this.titulo}, Autor: ${this.autor}, Cantidad: ${this.cantidad}")
    }

    fun prestar() {
        if (this.cantidad > 0) {
            this.cantidad--
            println("Libro prestado: ${this.titulo}, autor: ${this.autor}")
        } else {
            println("No hay ejemplares disponibles de ${this.libro}")
        }
    }

    fun devolver() {
        this.cantidad++
        println("Libro devuelto: ${this.titulo}, Autor: ${this.autor}")
    }
}

class Socio (var nombre: String, var apellido: String, var id: Int) {
    fun informacion() {
        println("Nombre: ${this.nombre}, Apellido: ${this.apellido}, ID: ${this.id}")
    }

    fun solicitarPrestamo(libro: Libro, fecha: String) {
        println("Prestamos solicitado por ${this.nombre} ${this.apellido}, numero de socio ${this.id}, fecha de prestamo ${this.fecha}")
        var prestamo = Prestamo(libro, this, fecha)
        prestamo.registrarPrestamo()
    }

    fun devolverPrestamo(libro: Libro) {
        println("Devolución de préstamo por ${this.nombre} ${this.apellido}, Número de Socio: ${this.id}")
        val prestamo = Prestamo(libro, this)
        prestamo.devolverPrestamo()
    }
}

class Prestamo (var libro: Libro, var socio: Socio, var fecha: String) {
    fun registrarPrestamo() {
        println("Prestamo registrado: Libro ${this.titulo}, por el socio ${socio.nombre}")
        libro.prestar()
    }

    fun devolverPrestamo() {
        println("Devolución de préstamo - Libro: ${libro.titulo}, Socio: ${socio.nombre} ${socio.apellido}")
        libro.devolver()
    }
}

class Main {
    val libro1: Libro = Libro("LOTR", "J.R.R. Tolkien", 2)
    val libro2: Libro = Libro("1984", "J.R.R. Tolkien", 2)

    val socio1: Socio = Socio("Izan", "Lozano", 101)
    val socio2: Socio = Socio("Carlos", "Bonilla", 202)

    // val prestamo1 : Prestamo = Prestamo(libro1, socio1, "2024-03-15")
    // val prestamo2 : Prestamo = Prestamo(libro2, socio2, "2024-03-15")

    socio1.solicitarPrestamo(libro1, "2024-03-15")
    libro1.informacion()
    socio1.informacion()
    socio1.devolverPrestamo(libro1, "2024-03-15")
    libro1.informacion()
}

fun main() {
    var x = Main()
    x.main()
} 