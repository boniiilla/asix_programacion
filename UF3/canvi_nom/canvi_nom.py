import os

'''
1. Renombrar fichero
2.1. Obtener el nombre del fichero
2.2. Renombrar el fichero
3.1.1. Pedir al usuario la ruta
3.2.1. Comprobar el archivo
3.2.2. Separar la extension de la ruta
3.2.3. Renombrar el fichero
'''

class Renombrar:
    def inicio(self):
        fichero = self.obtener_nombre()
        self.renombrar_fichero(fichero)
    
    def obtener_nombre(self):
        fichero = input("Escribe el nombre de la ruta: ")
        return fichero
    
    def renombrar_fichero(self, fichero):
        existe = self.fichero_existe(fichero)
        if existe:
            nuevo_nombre = self.separar_extension(fichero)
            self.renombrar(fichero, nuevo_nombre)
        else:
            print(f"No existe el fichero {fichero}")
    def fichero_existe(self, fichero):
        existe = os.path.exists(fichero)
        return existe
    
    def separar_extension(self, fichero):
        pos = fichero.rfind('.')
        return fichero[:pos]
    
    def renombrar(self, fichero, nuevo_nombre):
        os.rename(fichero, nuevo_nombre)

app = Renombrar()
app.inicio()