temperatures = []
opcion = ""

def temperatures_setmanals(temperatures):
    print("Escriu les temperatures d'aquesta setmana: ")
    temperatura = input()
    temperatura = temperatura.replace(",", ".")
    temperatura = temperatura.split(" ")
    for grados in temperatura:
        temperatures.append(float(grados))


def temperatura_mitjana(temperatures):
    mitjana = 0
    for grados in temperatures:
        mitjana += grados
    mitjana = mitjana / (len(temperatures) + 1)
    

def diferencia_maxima(temperatures):
    grau_max = 0
    grau_min = 0
    for grado in temperatures:
        if grado > grau_max:
            grau_max = grado
        if grado < grau_min or grau_min == 0:
            grau_min = grado
    diferencia = grau_max - grau_min
    print(diferencia)


while opcion != "FI":
    opcion = input('''\nBenvingut al registre de temperatures 
--------------------------------------
[RT] Registrar temperatures setmanals. 
[MJ] Consultar temperatura mitjana. 
[DF] Consultar diferència màxima. 
[FI] Sortir.
Opció: ''')
    if opcion == "RT":
        temperatures_setmanals(temperatures)
        print(temperatures)
    if opcion == "MJ":
        temperatura_mitjana(temperatures)
    if opcion == "DF":
        diferencia_maxima(temperatures)