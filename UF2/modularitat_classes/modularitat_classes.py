class movimiento:
    def __init__(self):
        self.coordenada = (0, 0)
        self.x, self.y = self.coordenada
    
    def moure_dreta(self):
        self.coordenada = (self.x + 1, self.y)

    def moure_esquerra(self):
        self.coordenada = (self.x - 1, self.y)

    def moure_amunt(self):
        self.coordenada = (self.x, self.y + 1)

    def moure_avall(self):
        self.coordenada = (self.x, self.y - 1)

ejecucion = movimiento()

ejecucion.moure_dreta()
print(f"Nova coordenada després de moure a la dreta: {ejecucion.coordenada}")

ejecucion.moure_amunt()
print(f"Nova coordenada després de moure amunt: {ejecucion.coordenada}")