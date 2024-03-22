package Biblioteca

class Libro(val titulo: String, val autor: String, var cantidad: Int) {

    fun prestar() {
        if (cantidad > 0) {
            cantidad--
            println("Libro prestado: $titulo, Autor: $autor")
        } else {
            println("No hay ejemplares disponibles de $titulo")
        }
    }

    fun devolver() {
        cantidad++
        println("Libro devuelto: $titulo, Autor: $autor")
    }

    fun informacion() {
        println("Título: $titulo, Autor: $autor, Ejemplares Disponibles: $cantidad")
    }
}