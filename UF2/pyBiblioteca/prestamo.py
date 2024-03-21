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