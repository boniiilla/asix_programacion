array = [46, 50, 65, 97, 69, 33, 59, 71, 98, 47, 55, 82, 35,  9, 75, 39, 93,
       11, 61, 94, 40, 73, 23, 92, 49, 76, 19,  8, 99, 70,  1, 66, 29, 28,
       45, 22, 27, 34, 54, 56, 63, 62, 78, 96, 10, 91,  4, 36, 32, 85, 90,
       95, 12, 48, 43, 53, 44, 51, 20,  7, 60, 77,  5, 18, 41, 13, 21, 87,
       17, 25, 67, 16, 57,  0, 72, 81, 84, 79, 38, 74, 52, 15,  6, 42, 64,
       89, 86, 68, 88, 14,  3, 30, 58, 80, 31, 37, 83, 24,  2, 26]

size_array = len(array)
contador_posicion = 0
save_array_i = 0
'''
Queremos comparar la primera posicion las otras.
Si posicion 1 es mayor que posicion 2, cambiamos el valor de posicion 1 por 2 y viceversa.
Asi con todas las cadenas hasta llegar a la ultima.
'''

for i in range(0,size_array):
    for j in range(contador_posicion,size_array):
       if array[i] > array[j]:
           save_array_i = array[i]
           array[i] = array[j]
           array[j] = save_array_i
    contador_posicion += 1


print(array)