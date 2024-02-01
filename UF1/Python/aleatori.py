llista_preguntes = [
    "Cual es tu nombre? ",
    "Donde vives? ",
    "Que temperatura hace? ",
    "Que hora es? "
]
seed = int(input("Introduce un numero cualquiera: "))

for i in range(2):
    seed = (seed * 997) % 1000
    random = (seed * 503) % 1000 / 1000
    numero_pregunta = int(random * (len(llista_preguntes)))
    print(llista_preguntes[numero_pregunta])