matriu = [[1, 2, 3], [3, 8], [1, 8, 7]]

print("Matriu inicial")
for fila in matriu:
    for element in fila:
        print(element, end=" ")
    print()

#TODO
mida_matriu = len(matriu)
for array in range(0,mida_matriu):
    aux_array = matriu[array]
    aux_len_array = len(aux_array)
    for valor in range(0,aux_len_array):
        aux_array [valor] += 1
    matriu[array] = aux_array


print("Matriu final:")
for fila in matriu:
    for element in fila:
        print(element, end=" ")
    print()