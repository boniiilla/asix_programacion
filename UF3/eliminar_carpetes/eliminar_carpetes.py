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
        self.eliminar_carpeta(carpeta)

    def obtener_carpeta(self):
        carpeta = input("Introduce el nombre de la ruta: ")
        return carpeta
    
    def eliminar_carpeta(self, carpeta):
        existe = self.carpeta_existe(carpeta)
        #subcarpetas = self.subcarpetas_existe()
        if existe:
            #if subcarpetas:
            #    ...
            #else:
            self.eliminar(carpeta)
        else:
            print(f"No existe la carpeta {carpeta}")
    
    def carpeta_existe(self, carpeta):
        existe = os.path.exists(carpeta)
        return existe
    
    def eliminar(self, carpeta):
        os.remove(carpeta)

app = Eliminar()

app.inicio()
