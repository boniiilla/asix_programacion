# PRE: Definim dues llistes, una de 10 nombres i un altre de entre 5 i 8.

lista_1 = []
lista_2 = []

seed = int(input("Introduce un numero cualquiera: "))

for i in range(1):
    seed = (seed * 997) % 1000
    random = (seed * 503) % 1000 / 1000
    numero_aleatorio = int((random * 100))
    print(numero_aleatorio)

print("LISTA 1:")
for i in range(numero_aleatorio):
    seed = (seed * 997) % 1000
    random = (seed * 503) % 1000 / 1000
    numero = int(random*10)
    lista_1.append(numero)
    print("\t",numero)

seed = int(input("Vuelve a introducir un numero cualquiera: "))

for i in range(1):
    seed = (seed * 997) % 1000
    random = (seed * 503) % 400 / 100
    numero_aleatorio = int((random // 1) + 5)

print("LISTA 2:")
for i in range(numero_aleatorio):
    seed = (seed * 997) % 1000
    random = (seed * 503) % 1000 / 1000
    numero = int(random*10)
    lista_2.append(numero)
    print("\t",numero)

lista_completa = lista_1 + lista_2

lista_sin_duplicados = []
suma = 0

for i in lista_completa:
    if i not in lista_sin_duplicados:
        lista_sin_duplicados.append(i)
        suma = suma + i
    
print("Suma de tots els nonbres:", suma)

# POST: Mostra les dues llistes i la suma final.



#print(lista_1)