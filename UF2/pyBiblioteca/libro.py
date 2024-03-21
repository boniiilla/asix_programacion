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