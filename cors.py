# Crear la lista de cartas
cartas = ["4C", "QS", "AS", "AH", "8H", "5C", "2C", "7C", "JS", "6D", "KD", "6S", "10D", "KH", "JC", "2D", "4S", "JD", "3C", "10H", "5H", "KS", "8S", "3H", "7H", "10C", "6C", "QD", "4D", "AD", "7D", "JH", "9H", "QH", "2S", "3S", "5S", "9S", "AC", "3D", "KC", "4H", "8D", "9C", "10S", "7S", "8C", "2H", "9D", "5D", "6H", "QC"]

# Repartimos 13 cartas a cada jugador
# Tenemos 4 jugadores

jugadores = [[], [], [], []] # jugadores[0] -> jugador1, jugadores[1] -> jugador2.....

i = 0

# Repartimos las 13 cartas, como?
# Mientras i (sera nuestro contador) sea menor que 13 hacer
# Y dentro de este mientras que necesitamos hacer?
# Mientras j (sera nuestro segundo contador) sea menor que 4 hacer

while i < 13:
    j = 0 # Tenemos que reiniciar en cada vuelta, sino no volveriamos a entrar nunca
    while j < 4:
        # Asignamos una carta, tenemos dos formas de hacerlo, la facil y la dificil
        jugadores[j].append(cartas.pop())
        j = j + 1 # j += 1
    i = i + 1 # i += 1

index = 1

'''
for jugador in jugadores:
    print(f"Jugador: {index} ",','.join(jugador))
    print("Cartas repartidas a este jugadro:", len(jugador))
    index = index + 1
'''

# Que toca hacer ahora?

'''
print(jugadores[0][8][-1]) # Sacamos el PALO de la carta
print(jugadores[0][8][0:-1]) # Sacamos el Numero de la carta
'''

cartas_tiradas = [[], [], [], []] # Cada jugador tirara su propia carta y las compararemos (cartas_tiradas[0] -> carta de jugador[0] = jugador1)

aux_palo_alto = [[], [], [], []]
aux_numero_alto = [[], [], [], []]

i = 0
while i < 13:
    j = 0
    cartas_tiradas = [[], [], [], []]
    while j < 4:
        cartas_tiradas[j].append(jugadores[j].pop())
        j = j + 1
    
    print(cartas_tiradas)
    i = i + 1
