from libro import Libro
from socio import Socio

class Main:
    libro1: Libro = Libro("LOTR", "J.R.R. Tolkien", 2)
    libro2: Libro = Libro("1984", "J.R.R. Tolkien", 2)
    
    socio1: Socio = Socio("Izan", "Lozano", 101)
    socio2: Socio = Socio("Carlos", "Bonilla", 202)

    socio1.solicitarPrestamo(libro1, "2024-03-15")
    libro1.informacion()
    socio1.informacion()
    socio1.devolverPrestamo(libro1)
    libro1.informacion()
