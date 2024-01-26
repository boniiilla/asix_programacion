#Introduim una entrada de dades
puntuacions = [[13, 19, 17, 11, 5, 14, 14, 1, 1, 16, 5, 16, 14, 7, 17], [10, 16, 1, 18, 17, 17, 14, 20, 10, 7, 7, 8, 2, 10, 9], [10, 18, 11, 4, 2, 7, 6, 2, 4, 15, 11, 9, 6, 12, 17], [11, 10, 11, 13, 10, 16, 5, 7, 9, 11, 18, 5, 1, 4, 1], [2, 12, 16, 5, 12, 18, 7, 11, 7, 18, 7, 6, 6, 18, 5]]
mitjana = 0
categories = {
    "Categories A" : [],
    "Categories B" : [],
    "Categories C" : [],
    "Categories D" : [],
    "Categories E" : [] } # [[Categoria A],[Categoria B],[Categoria C],[Categoria D],[Categoria E]]
patrons_temporals_avancats = [[[],[]],[[],[]],[[],[]],[[],[]],[[],[]]] #patrons_temporals_avançats > jugador > pics_max, pics_min
desviacio_estandard = 0
puntuacio_maxima = 0
puntuacio_minima = 0

if puntuacions != [[],[],[],[],[]]:
    #Programa per a trobar la MITJANA
    tirades = 0
    for jugador in puntuacions:
        for tirada in jugador:
            mitjana = mitjana + tirada
        tirades = tirades + len(jugador)
    mitjana = mitjana / tirades
    print(f"\nMITJANA DE TOTES LES PUNTUACIONS: {mitjana}")

    #Mitjana de Cada Jugador:
    mitjanes_jugadors = []
    for jugador in range(len(puntuacions)):
        suma = 0
        for tirada in puntuacions[jugador]:
            suma = tirada + suma
        mitjana_jugador = (suma / len(puntuacions[jugador]))
        mitjanes_jugadors.append(mitjana_jugador)

    #Programa per a trobar la DE(Desviacio Mitjana):
    suma_desviacioe = 0
    for jugador in mitjanes_jugadors:
        suma_desviacioe = suma_desviacioe + ((jugador - mitjana)**2)
    if mitjana != 0:
        desviacio_estandard = (suma_desviacioe/len(mitjanes_jugadors))**0.5
    else:
        desviacio_estandard = 0
    print(f"\nDESVIACIO ESTANDAR: {desviacio_estandard}")

    '''
    Comprovacio que guarda la mitjana de cada jugador:
    print("MITJANES JUGADORS:\n")
    for mitjanes in range(len(mitjanes_jugadors)):
        print(f"JUGADOR {mitjanes + 1}: {mitjanes_jugadors[mitjanes]}")
    '''

    print("\nMITJANES JUGADORS:")
    for mitjanes in range(len(mitjanes_jugadors)):
        print(f"JUGADOR {mitjanes + 1}: {mitjanes_jugadors[mitjanes]}")

    #Fem les variables per trobar les clases A, B i C
    suma_mitjana_desviacioe = mitjana + desviacio_estandard
    resta_mitjana_desviacioe = mitjana - desviacio_estandard
    for mitja in range(len(mitjanes_jugadors)):
        if mitjanes_jugadors[mitja] > suma_mitjana_desviacioe:
            categories["Categories A"].append(f"Jugador{mitja + 1}")
        elif mitjanes_jugadors[mitja] < suma_mitjana_desviacioe and mitjanes_jugadors[mitja] > resta_mitjana_desviacioe:
            categories["Categories B"].append(f"Jugador{mitja + 1}")
        elif mitjanes_jugadors[mitja] < resta_mitjana_desviacioe:
            categories["Categories C"].append(f"Jugador{mitja + 1}")

    #Treiem la màxima puntuacío (Categoria D) y la minima (Categoria E):
    puntuacio_maxima = 0
    puntuacio_minima = 0
    aux_categories_3 = ""
    aux_categories_4 = ""
    for jugadors in range(len(puntuacions)):
        for tirada in puntuacions[jugadors]:
            if tirada > puntuacio_maxima:
                aux_categories_3 = f"Jugador{jugadors + 1}"
                puntuacio_maxima = tirada
                categories["Categories D"] = f"Jugador{jugadors + 1}"
            elif tirada == puntuacio_maxima:
                if f"Jugador{jugadors + 1}" != aux_categories_3:
                    categories["Categories D"] = categories["Categories D"]+", "+f"Jugador{jugadors + 1}"
                    aux_categories_3 = f"Jugador{jugadors + 1}"
            if tirada < puntuacio_minima or puntuacio_minima == 0:
                aux_categories_4 = f"Jugador{jugadors + 1}"
                puntuacio_minima = tirada
                categories["Categories E"] = f"Jugador{jugadors + 1}"
            elif tirada == puntuacio_minima:
                if f"Jugador{jugadors + 1}" != aux_categories_4:
                    categories["Categories E"] = categories["Categories E"]+", "+f"Jugador{jugadors + 1}"
                    aux_categories_4 = f"Jugador{jugadors + 1}"
            

    print(f"""\nCATEGORIES:
    A: {categories["Categories A"]}
    B: {categories["Categories B"]}
    C: {categories["Categories C"]}
    D: {categories["Categories D"]}
    E: {categories["Categories E"]}
    """)       

    #Programa per els patrons temporals avançats:

    for jugador in range(len(puntuacions)):
        for tirada in range(len(puntuacions[jugador])):
            
            if tirada < (len(puntuacions[jugador]) - 2):
                posicio_x1 = tirada + 1
                posicio_x2 = tirada + 2
            else:
                posicio_x1 = tirada
                posicio_x2 = tirada

            if len(puntuacions[jugador]) > 2:
                if puntuacions[jugador][tirada] < puntuacions[jugador][posicio_x1] and puntuacions[jugador][posicio_x1] > puntuacions[jugador][posicio_x2]:
                    patrons_temporals_avancats[jugador][0].append(f"{tirada}, {posicio_x2}")
            
            if len(puntuacions[jugador]) > 2:
                if puntuacions[jugador][tirada] > puntuacions[jugador][posicio_x1] and puntuacions[jugador][posicio_x1] < puntuacions[jugador][posicio_x2]:
                    patrons_temporals_avancats[jugador][1].append(f"{tirada}, {posicio_x2}")


    for jugador in range(len(patrons_temporals_avancats)):
        print(f"""\nPATRO JUGADOR {jugador + 1}
    Pics de pujada: {patrons_temporals_avancats[jugador][0]}
    Pics de baixada: {patrons_temporals_avancats[jugador][1]} """)

    #Programes per patrons evidents:
    print("\nPATRONS EVIDENTS: ")
    for jugadors in range(len(puntuacions)):
        decreix = 0
        creix = 0
        posicio_x1 = 0
        for tirada in range(len(puntuacions[jugadors])):
            if tirada < (len(puntuacions[jugadors]) - 1):
                posicio_x1 = tirada + 1
            else:
                posicio_x1 = tirada
            if puntuacions[jugadors][tirada] > puntuacions[jugadors][posicio_x1]:
                decreix += 1
            elif puntuacions[jugadors][tirada] < puntuacions[jugadors][posicio_x1]:
                creix += 1
        total = creix + decreix
        if creix != 0 and ((creix/total)*100) >= 70:
            print(f"Jugador{jugadors + 1}: Patro evident de creixement")
        elif decreix != 0 and ((decreix/total)*100) >= 70:
            print(f"Jugador{jugadors + 1}: Patro evident de decreixement")
        else:
            print(f"Jugador{jugadors + 1}: No hi ha patró evident")
else:
    print("NO HAY TIRADAS")