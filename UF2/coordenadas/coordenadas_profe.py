class Coordenada:
    def __init__(self) -> None:
        # Coordenada inicial
        self.x: int = 0
        self.y: int = 0
    
    def moure_dreta(self) -> None:
        self.x += 1
    
    def moure_esquerra(self) -> None:
        self.x -= 1

    def moure_amunt(self) -> None:
        self.y += 1
    
    def moure_avall(self) -> None:
        self.y -= 1

class Main:
    # Programa principal
    coordenada: Coordenada