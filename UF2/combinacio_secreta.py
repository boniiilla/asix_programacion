def palabra_secreta_aleatoria():
    abecedario = ["a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"]
    palabra_secreta = ""
    seed = int(input("Introduce un numero cualquiera para crear la palabra secreta: "))

    for i in range(5):
        seed = (seed * 997) % 1000
        random = (seed * 503) % 1000 / 1000
        letra = int(random * (len(abecedario)))
        palabra_secreta += abecedario[letra]
    
    return palabra_secreta

def intentos_usuario(palabra_secreta):
    intento_usuario = ""
    while intento_usuario != "OOOOO":
        aux_intento_usuario = ["-","-","-","-","-"]
        intento_usuario = ""
        palabra_usuario = input(f"Escriu {len(palabra_secreta)} lletres minúscules: ")
        if len(palabra_usuario) == 5:
            for letra in range(5):
                if palabra_usuario[letra] == palabra_secreta[letra]:
                    aux_intento_usuario[letra] = "O"
                for letra_usuario in range(5):
                    if palabra_secreta[letra] == palabra_usuario[letra_usuario] and letra != letra_usuario:
                        aux_intento_usuario[letra] = "X"
            for valor in aux_intento_usuario:
                intento_usuario += valor
            if intento_usuario != "OOOOO" :
                print(f"La resposta es [{intento_usuario}]. Continua intentant-ho!")
            else:
                print(f"La resposta es [{intento_usuario}]. Has encertat!")
        else:
            print("Mida de paraula no valida.")

def endevina_combinacio():
    palabra_secreta = palabra_secreta_aleatoria()
    intentos_usuario(palabra_secreta)

endevina_combinacio()