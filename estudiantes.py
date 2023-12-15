#PRE: Añadimos una lista de usuarios con la siguiente inforación: Nom, Cognom, Edat, Nota1, Nota2, Nota3 (Notas con valor entre 0-10)
estudiantes = [("Carlos", "Bonilla", 18, 7, 6, 10), ("Ruben", "Rodriguez", 20, 6, 5, 9), ("Izan", "Lozano", 18, 1, 5, 8)]
estudiantes_condicion1 = []
estudiantes_condicion2 = []
"""
#CODIGO PARA AÑADIR ESTUDIANTES AUTOMATICAMENTE:

nombre_estudiants = int(input("Introdueix el nombre de estudiants a afegir: "))

estudiants_afegits = 0

while estudiants_afegits < nombre_estudiants:
    estudiante = [] #Limpiar los datos del estudiante
    notas_estudiante = 3
    #Asignamos la informacion en variables del estudiante
    nom = str(input("Nom: "))
    cognom = str(input("Cognom: "))
    edat = int(input("Edat: "))

    #Añadimos a la lista estudiante
    estudiante.append(nom)
    estudiante.append(cognom)
    estudiante.append(edat)
    
    for nota in range(1,notas_estudiante+1):
        nota_estudiante = int(input(f"Introduce la nota{nota} del estudiante: "))
        estudiante.append(nota_estudiante)

    estudiantes.append(tuple(estudiante)) #Añadimos la lista en forma de TUPLA a los estudantes

    estudiants_afegits += 1
"""

for estudiante in range(len(estudiantes)):
    nota_media = (estudiantes[estudiante][3]*0.3) + (estudiantes[estudiante][4]*0.4) + (estudiantes[estudiante][5]*0.3)
    if nota_media > 7:
        estudiantes_condicion1.append(estudiantes[estudiante])
    print(nota_media)
    
    for nota in range(3,6):
        if estudiantes[estudiante][nota] > 8:
            estudiantes_condicion2.append(estudiantes[estudiante])
            break


print(estudiantes_condicion1)
print(estudiantes_condicion2)
print(estudiantes)

