import os

'''
1. Eliminar carpeta
2.1. Eliminar el contenido
2.2. Eliminar la carpeta
3.1.1. Pedir al usuario la ruta de la carpeta
3.1.2. Comprobar la existencia de la carpeta
3.1.3. Ver si hay subcarpetas
4.3.3.1. Eliminar el contenido de la subcarpeta
'''

class Eliminar:
    def inicio(self):
        carpeta = self.obtener_carpeta()