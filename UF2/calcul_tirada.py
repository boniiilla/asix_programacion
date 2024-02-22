def entrada_teclat():
    numero = int(input())
    return numero

def numero_posibilitats(numero):
    posibilidades = 0
    for dado1 in range(1, 7):
        for dado2 in range(1, 7):
            if dado1 + dado2 <= numero:
                posibilidades += 1
    return posibilidades

def calcul_probabilitats(posibilidades):
    probabilitat = int(posibilidades * 100 / 36)
    probabilitat = float(probabilitat)
    return probabilitat

def print_codigo():
    print("Escriu el valor a calcular [2 - 12]")
    numero = entrada_teclat()
    while numero > 12:
        print("El valor no és entre 2 i 12.")
        numero = entrada_teclat()
    posibilidades = numero_posibilitats(numero)
    probabilitat = calcul_probabilitats(posibilidades)
    print(f"La probabilitat es {probabilitat}%")

print_codigo()