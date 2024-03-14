class Movimiento {
    var x: Int = 0
    var y: Int = 0

    contructor(x: Int, y: Int) {
        this.x = 0
        this.y = 0
    }

    fun moure_dreta(x: Int) {
        var x += 1
    }

    fun moure_esquerra(x: Int) {
        var x -= 1
    }

    fun moure_amunt(y: Int) {
        var y += 1
    }

    fun moure_avall(y: Int) {
        var y -= 1
    }

}

fun main() {
    val coordenadas = Movimiento()
    
}