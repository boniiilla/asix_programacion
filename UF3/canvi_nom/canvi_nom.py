import os

ruta = input("Introduce la ruta del fichero o directorio: ")
fd = open(ruta, '+r')

os.rename(ruta, 'document')