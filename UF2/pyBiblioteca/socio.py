from libro import Libro
from prestamo import Prestamo


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