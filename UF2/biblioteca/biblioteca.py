class Libro:
    def __init__(self, titulo, autor, cantidad) -> None:
        self.titulo: str = titulo
        self.autor: str = autor
        self.cantidad: int = cantidad
    
    def informacion(self):
        print(f"Titulo: {self.titulo}, Autor: {self.autor}, Cantidad: {self.cantidad}")
    
    def prestar(self):
        if (self.cantidad > 0):
            self.cantidad -= 1
            print(f"Libro prestado: {self.titulo}, autor: {self.autor}")
        else:
            print(f"No hay ejemplares disponibles de {self.libro}")
    
    def devolver(self):
        self.cantidad += 1
        print(f"Libro prestado: {self.titulo}, autor: {self.autor}")

class Socio:
    def __init__(self, nombre, apellido, id) -> None:
        self.nombre: str = nombre
        self.apellido: str = apellido
        self.id: int = id

    def informacion(self):
        print(f"Nombre: {self.nombre}, Apellido: {self.apellido}, ID: {self.id}")
    
    def solicitarPrestamo(self, libro, fecha):
        print(f"Prestamo solicitado por {self.nombre} {self.apellido}, Número de socio {self.id}")
        prestamo = Prestamo(libro, self)
        prestamo.registrarPrestamo(fecha)

    def devolverPrestamo(self, libro):
        print(f"Devolución de préstamo por {self.nombre} {self.apellido}, Número de Socio: {self.id}")
        prestamo = Prestamo(libro, self)
        prestamo.devolverPrestamo()


class Prestamo:
    def __init__(self, libro, socio) -> None:
        self.libro: Libro = libro
        self.socio: Socio = socio
    
    def registrarPrestamo(self, fecha):
        print(f"Prestamo registrado: Libro {self.libro.titulo}, por el socio {self.socio.nombre}, con fecha {fecha}")
        Libro.prestar(self.libro)

    def devolverPrestamo(self):
        print(f"Devolución de préstamo: Libro: {self.libro.titulo}, Socio: {self.socio.nombre} {self.socio.apellido}")
        Libro.devolver(self.libro)

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
