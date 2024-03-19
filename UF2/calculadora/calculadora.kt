fun escoger_opcion() {
    println("Ingresa el numero que quieres hacer [1: Sumar | 2: Restar | 3: Multiplicar | 4: Dividir] : ")
    val opcion = readLine()
}

fun primer_numero() {
    println("Ingresa un primer numero: ")
    val numero_uno = readLine()
}

fun segundo_numero() {
    println("Ingresa un segundo numero: ")
    val numero_dos = readLine()
}

fun calculadora() {
    val Int opcion = escoger_opcion()
    val Int numero_uno = primer_numero()
    val Int numero_dos = segundo_numero()
    if (opcion == 1) {
        val Int suma = numero_uno + numero_dos
        println("$suma")
    } else if (opcion == 2) {
        val Int resta = numero_uno - numero_dos
        println("$resta")
    } else if (opcion == 3) {
        val Int multiplicacion = numero_uno * numero_dos
        println("$multiplicacion")
    } else if (opcion == 4) {
        val Int division = numero_uno / numero_dos
        println("division")
    } else {
        println("Opcion incorrecta")
    }
}

