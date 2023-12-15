#PRE: Añadim una llista de usuaris amb la següent informació: Nom, Cognom, Edat, Nota1, Nota2, Nota3
estudiants = []

nombre_estudiants = int(input("Introdueix el nombre de estudiants a afegir:"))
estudiants_afegits = 0
estudiante = []
while estudiants_afegits < nombre_estudiants:
    nom = str(input("Nom: "))
    cognom = str(input("Cognom: "))
    edat = int(input("Edat: "))
    nota1 = int(input("Nota 1: "))
    nota2 = int(input("Nota 2: "))
    nota3 = int(input("Nota 3: "))