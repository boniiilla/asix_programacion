#PRE : Vamos a tener uan cadena de texto no vacia
SEPARADORES = ('.',',',';',':','"')
texto = input("Introduce un texto sobre el que trabajar: ")

'''
1. Calcular frecuencia de palabras.
1.1. Para caluclar las palabras hay que separar el texto en palabras.
1.1.1. Para separar las palabras usamos los espacios en blanco.
1.1.1.1. Las palabras aisladas pueden tener signos de puntuacion.
'''
for caracter in SEPARADORES:
    texto = texto.replace(caracter, '')

palabras = texto.split()

palabras_sin_repetir = set(palabras)

total_palabras = 0
for palabras in palabras_sin_repetir:
    total_palabras += palabras.count(palabras)

print(len(palabras), len(palabras_sin_repetir))

'''
POST : Calcular y mostrar la lngitud media de las palabras,
mostrar listado de palabras ordenadads de forma descendente por frecuencia.
'''

