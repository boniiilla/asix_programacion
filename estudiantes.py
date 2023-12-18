#PRE: Añadimos una lista de usuarios con la siguiente inforación: Nom, Cognom, Edat, Nota1, Nota2, Nota3 (Notas con valor entre 0-10)
estudiantes = []
estudiantes_condicion1 = []
estudiantes_condicion2 = []

#CODIGO PARA AÑADIR ESTUDIANTES AUTOMATICAMENTE:

nombre_estudiants = int(input("Introdueix el nombre de estudiants a afegir: "))
#notas_total = int(input("Introduce el numero de notas que tienes por estudiante: "))
estudiants_afegits = 0

while estudiants_afegits < nombre_estudiants:
    estudiante = [] #Limpiar los datos del estudiante
    #Asignamos la informacion en variables del estudiante
    print("Añade el alumno: ")
    nom = str(input("Nom: "))
    cognom = str(input("Cognom: "))
    edat = int(input("Edat: "))

    #Añadimos a la lista estudiante
    estudiante.append(nom)
    estudiante.append(cognom)
    estudiante.append(edat)
    
    for nota in range(1,3+1):
        nota_estudiante = int(input(f"Introduce la nota{nota} del estudiante: "))
        estudiante.append(nota_estudiante)

    estudiantes.append(tuple(estudiante)) #Añadimos la lista en forma de TUPLA a los estudantes

    estudiants_afegits += 1

# Hacemos las dos condiciones
for alumno in range(len(estudiantes)):
    nota_media = (estudiantes[alumno][3]*0.3) + (estudiantes[alumno][4]*0.4) + (estudiantes[alumno][5]*0.3)
    if nota_media > 7:
        estudiantes_condicion1.append(estudiantes[alumno])
    estudante_añadido = False
    for nota in range(3,6):
        if estudiantes[alumno][nota] > 8 and estudante_añadido == False:
            estudiantes_condicion2.append(estudiantes[alumno])
            estudante_añadido = True
            #break # Dale una vuelta a ver como poder hacerlo sin break

# Mostramos los estudiantes con nota media mayor que 7
print("\nESTUDIANTES CON NOTA MEDIA > 7")
for alumno in range(len(estudiantes_condicion1)):
    print(f"\n\tNom: {estudiantes_condicion1[alumno][0]} | Cognom: {estudiantes_condicion1[alumno][1]} | Edat: {estudiantes_condicion1[alumno][2]} | Notas: {estudiantes_condicion1[alumno][3]},{estudiantes_condicion1[alumno][4]},{estudiantes_condicion1[alumno][5]}")

# Mostramos los estudiantes con una nota mayor que 8
print("\nESTUDIANTES CON UNA NOTA > 8")
for alumno in range(len(estudiantes_condicion2)):
    print(f"\n\tNom: {estudiantes_condicion2[alumno][0]} | Cognom: {estudiantes_condicion2[alumno][1]} | Edat: {estudiantes_condicion2[alumno][2]} | Notas: {estudiantes_condicion2[alumno][3]},{estudiantes_condicion2[alumno][4]},{estudiantes_condicion2[alumno][5]}")

#POST: Mostramos las dos condiciones que nos pide el enunciado.
