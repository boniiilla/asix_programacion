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

cartas_tiradas = [[], [], [], []] # Cada jugador tirara su propia carta y las compararemos (cartas_tiradas[0] -> carta de jugador[0] = jugador1)

'''
print(jugadores[0][8][-1]) # Sacamos el PALO de la carta
print(jugadores[0][8][0:-1]) # Sacamos el Numero de la carta
'''

# Cada uno de los jugadores tira una carta aleatoria:

for j in range (13):
    print(f"RONDA {j+1}")
    cartas_tiradas = [[], [], [], []]
    for i in range(4):
        seed = (seed * 997) % 1000
        random = (seed * 503) % 1000 / 1000
        carta = int(random * (len(jugadores[i])))
        cartas_tiradas[i].append(jugadores[i].pop(carta))
    
    carta_alta = []
    cartas_hearts = []

    for i in range(4):
        if cartas_tiradas[i][0][-1] == "H":
            cartas_hearts.append(cartas_tiradas[i][0])
    
    if len(cartas_hearts) > 0:
        for i in range(len(cartas_hearts)):
            if cartas_hearts[i][0:-1] == "A":
                cartas_hearts[i] = cartas_hearts[i].lower()
        #print(cartas_hearts)

        for i in range(len(cartas_hearts)):
            for j in range(i, len(cartas_hearts)):
                if cartas_hearts[i][0:-1] < cartas_hearts[j][0:-1]:
                    cartas_hearts[i], cartas_hearts[j] = cartas_hearts[j], cartas_hearts[i]
        carta_alta.append(cartas_hearts[0].upper())

    if len(cartas_hearts) == 0:
        for i in range(4):
            if cartas_tiradas[i][0][0:-1] == "A":
                cartas_tiradas[i][0] = cartas_tiradas[i][0].lower()
        for i in range(4):
            for j in range(i, 4):
                if cartas_tiradas[i][0][0:-1] < cartas_tiradas[j][0][0:-1]:
                    cartas_tiradas[i][0], cartas_tiradas[j][0] = cartas_tiradas[j][0], cartas_tiradas[i][0]
        
        carta_alta.append(cartas_tiradas[0][0].upper())
    
    #IMPRESION EN PANTALLA
    for i in range(4):
        if cartas_tiradas[i][0][0:-1] == "a":
            cartas_tiradas[i][0] = cartas_tiradas[i][0].upper()
        print(f"Jugador{i}:",cartas_tiradas[i][0])

    print("CARTA GANADORA:", carta_alta[0], "\n")
