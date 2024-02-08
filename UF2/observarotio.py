temperatures = []
meses = {
    "enero" : 31,
    "febrer" : 28,
    "març" : 31,
    "abril" : 30,
    "maig" : 31,
    "juny" : 30,
    "juliol" : 31,
    "agost" : 31,
    "septembre" : 30,
    "octubre" : 31,
    "novembre" : 30,
    "decembre" : 31,
}
opcion = ""

def mesos_registres(temperatures, meses):
    mes_registre = "enero"
    dies_registres = len(temperatures)
    for mes in meses:
        if meses[mes] < dies_registres:
            dies_registres -= meses[mes]
            mes_registre = mes
    return mes_registre, dies_registres


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
    return mitjana

def diferencia_maxima(temperatures):
    grau_max = 0
    grau_min = 0
    for grado in temperatures:
        if grado > grau_max:
            grau_max = grado
        if grado < grau_min or grau_min == 0:
            grau_min = grado
    diferencia = grau_max - grau_min
    return diferencia



while opcion != "FI":
    opcion = input('''\nBenvingut al registre de temperatures 
--------------------------------------
[RT] Registrar temperatures setmanals. 
[MJ] Consultar temperatura mitjana. 
[DF] Consultar diferència màxima. 
[FI] Sortir.
Opció: ''')
    mes_registre, dies_registres = mesos_registres(temperatures, meses)
    if opcion == "RT":
        temperatures_setmanals(temperatures)
    elif opcion == "MJ":
        mitjana = temperatura_mitjana(temperatures)
        print(f"Fins avui {dies_registres + 1} de {mes_registre} la mitjana ha estat de {mitjana} graus. ")
    elif opcion == "DF":
        diferencia = diferencia_maxima(temperatures)
        print(f"Fins avui {dies_registres + 1} de {mes_registre} la diferència màxima ha estat de {mitjana} graus. ")
    elif opcion == "FI":
        print("Opcion Incorrecta")