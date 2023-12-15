#PRE: Añadimos una lista de usuarios con la siguiente inforación: Nom, Cognom, Edat, Nota1, Nota2, Nota3 (Notas con valor entre 0-10)
estudiantes = [("Carlos", "Bonilla", 18, 7, 6, 10), ("Ruben", "Rodriguez", 20, 6, 5, 9), ("Izan", "Lozano", 18, 1, 5, 8)]

#CODIGO PARA AÑADIR ESTUDIANTES AUTOMATICAMENTE:

nombre_estudiants = int(input("Introdueix el nombre de estudiants a afegir: "))

estudiants_afegits = 0

while estudiants_afegits < nombre_estudiants:
    estudiante = [] #Limpiar los datos del estudiante
    notas_estudiante = int(input("Introdueix el nombre de notes del estudiant: ")) #Numero de notas del estudiante
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



print(estudiantes)

