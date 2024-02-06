temperatures = []
meses = {
    1 : "gener",
    2 : "febrer",
    3 : "març",
    4 : "abril",
    5 : "maig",
    6 : "juny",
    7 : "juliol",
    8 : "agost",
    9 : "septembre",
    10 : "octubre",
    11 : "novembre",
    12 : "decembre",
}
opcion = ""

def mesos_registres(temperatures, meses):
    mes = 1
    print(meses[mes]) 

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
    print(mitjana)
    

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
        mesos_registres(temperatures,meses)
    elif opcion == "MJ":
        temperatura_mitjana(temperatures)
    elif opcion == "DF":
        diferencia_maxima(temperatures)
    elif opcion == "FI":
        print("Opcion Incorrecta")