import os

ruta = input("Introduce la ruta del fichero o directorio: ")
fd = open(ruta, 'w')

os.rename(ruta, 'document')