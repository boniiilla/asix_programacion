def posibles_resultados():
    resultados = []
    for dado1 in range(1,7):
        for dado2 in range(1,7):
            resultado = dado1 + dado2
            resultados.append(resultado)
    return resultados

def sumar_valores(resultados):
    resultados = posibles_resultados()
    valores_resultados = ["","","","","","","","","","","",""]
    for valor in range(2,13):
        for resultado in resultados:
            if resultado == valor:
                valores_resultados[valor - 2] += "*"
    return valores_resultados

def max_valor(valores_resulados):
    max_numero = 0
    for valor1 in range(len(valores_resulados)):
        for valor2 in range(valor1, len(valores_resulados)):
            if len(valores_resulados[valor1]) < len(valores_resulados[valor2]):
                max_numero = valor2 + 2
    return max_numero


def printear_valores():
    resultados = posibles_resultados()
    valores_resultados = sumar_valores(resultados)
    max_numero = max_valor(valores_resultados)
    for valor in range(2,13):
        print(f"{valor}: {valores_resultados[valor - 2]}")
    print(f"El maxim és: {max_numero}")

printear_valores()