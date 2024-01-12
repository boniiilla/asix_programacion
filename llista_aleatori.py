# PRE: Definim dues llistes, una de 10 nombres i un altre de entre 5 i 8.

lista_10_nombres = []
lista_8_nombres = []

seed = int(input("Introduce un numero cualquiera: "))

for i in range(10):
    seed = (seed * 997) % 1000
    random = (seed * 503) % 1000 / 1000
    numero = int((random*100) // 10)
    lista_10_nombres.append(numero)

seed = int(input("Vuelve a introducir un numero cualquiera: "))

for i in range(1):
    seed = (seed * 997) % 1000
    random = (seed * 503) % 400 / 100
    numero_aleatorio = int((random // 1) + 5)
    
for i in range(numero_aleatorio):
    seed = (seed * 997) % 1000
    random = (seed * 503) % 1000 / 1000
    numero = int((random*100) // 10)
    lista_8_nombres.append(numero)




#print(lista_10_nombres)