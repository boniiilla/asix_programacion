#PRE: Añadim una llista de usuaris amb la següent informació: Nom, Cognom, Edat, Nota1, Nota2, Nota3
estudiantes = []

nombre_estudiants = int(input("Introdueix el nombre de estudiants a afegir:"))
estudiants_afegits = 0
estudiante = []
while estudiants_afegits < nombre_estudiants:
    nom = str(input("Nom: "))
    cognom = str(input("Cognom: "))
    edat = int(input("Edat: "))
    nota1 = int(input("Nota 1: "))
    nota2 = int(input("Nota 2: "))
    nota3 = int(input(f"Nota 3: "))
    estudiante.append(nom,cognom,edat,nota1,nota2,nota3)
    estudiantes.append(estudiante)
    estudiants_afegits += 1

print(estudiante)
print(estudiantes)