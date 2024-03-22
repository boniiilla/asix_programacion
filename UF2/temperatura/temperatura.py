class temperatura:
    def __init__(self):
        self.valor = 0
        self.unidad = 'Celsius'
    
    def escribir(self):
        print(self.valor, self.unidad)
    
    def pasar_a_farenheid(self):
        self.valor = (self.valor * (9/5) + 32)
        self.unidad = 'Farenheid'
    
    def pasar_a_celsius(self):
        self.valor = (self.valor - 32) * (5/9)
        self.unidad = 'Celsius'

ayer = temperatura()
ayer.valor = 14

hoy = temperatura()
hoy.valor = 8

ayer.escribir()
hoy.pasar_a_farenheid()
ayer.escribir()
hoy.escribir()