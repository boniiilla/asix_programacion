class Llibre {
    var libros: MutableMap<String, String>
    var libro: String
    var autor: String

    constructor() {
        this.libros = mutableMapOf(
            "Harry Potter 1" to "J.K. Rowling"
        )
        this.libro = ""
        this.autor = ""
    }

    fun anadir_libro() {
        println("Introduce el libro que quieres añadir:")
        this.libro = readLine()!!.toString()
        println("Introduce el autor del libro:")
        this.autor = readLine()!!.toString()
        
        this.libros.put(this.libro, this.autor)
    }
}

class Soci {

}

class Prestec {

}

class Main {

    constructor() {
        var llibre: Llibre = Llibre()
        llibre.anadir_libro()
        println("Estos son los libros que hay ${llibre.libros}")
    }
}

fun main() {
    Main()
}