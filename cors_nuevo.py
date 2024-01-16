# Crear la lista de cartas
cartas = ["4C", "QS", "AS", "AH", "8H", "5C", "2C", "7C", "JS", "6D", "KD", "6S", "10D", "KH", "JC", "2D", "4S", "JD", "3C", "10H", "5H", "KS", "8S", "3H", "7H", "10C", "6C", "QD", "4D", "AD", "7D", "JH", "9H", "QH", "2S", "3S", "5S", "9S", "AC", "3D", "KC", "4H", "8D", "9C", "10S", "7S", "8C", "2H", "9D", "5D", "6H", "QC"]

# Repartimos 13 cartas a cada jugador
# Tenemos 4 jugadores

jugadores = [[], [], [], []] # jugadores[0] -> jugador1, jugadores[1] -> jugador2.....

seed = int(input("Introduce un numero cualquiera: "))

for j in range (13):
    for i in range(4):
        seed = (seed * 997) % 1000
        random = (seed * 503) % 1000 / 1000
        carta = int(random * (len(cartas)))
        jugadores[i].append(cartas.pop(carta))
        
print(jugadores)