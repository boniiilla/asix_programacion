import solucio

tot_ok = True

if solucio.mitjana != 10.026666666666667:
    print(f"mitjana es {solucio.mitjana} i hauria de ser 10.026666666666667")
    tot_ok = False
if solucio.desviacio_estandard != 1.0478337442340533:
    print(f"desviacio_estandard es {solucio.desviacio_estandard} i ha de ser 1.0478337442340533")
    tot_ok = False
if solucio.puntuacio_maxima != 20:
    print(f"puntuacio_maxima es {solucio.puntuacio_maxima} i hauria de ser 20.")
    tot_ok = False
if solucio.puntuacio_minima != 1:
    print(f"puntuacio_minima es {solucio.puntuacio_minima} i hauria de ser 1.")
    tot_ok = False
if solucio.categories["Categoria A"] != [1]:
    print(f"Categoria A es {solucio.categories['Categoria A']} i hauria de ser [1].")
    tot_ok = False
if solucio.categories["Categoria B"] != [2, 5]:
    print(f"Categoria B es {solucio.categories['Categoria B']} i hauria de ser [2, 5].")
    tot_ok = False
if solucio.categories["Categoria C"] != [3, 4]:
    print(f"Categoria C es {solucio.categories['Categoria C']} i hauria de ser [3, 4].")
    tot_ok = False
if solucio.categories["Categoria D"] != [2]:
    print(f"Categoria D es {solucio.categories['Categoria D']} i hauria de ser [2].")
    tot_ok = False
if solucio.categories["Categoria E"] != [1, 2, 4]:
    print(f"Categoria E es {solucio.categories['Categoria E']} i hauria de ser [1, 2, 4].")
    tot_ok = False
if solucio.patrons_temporals_avancats != [[(0, 2), (3, 5), (8, 10), (9, 11), (10, 12), (12, 14)], [(0, 2), (1, 3), (2, 4), (5, 7), (6, 8), (10, 12), (11, 13), (12, 14)], [(0, 2), (3, 5), (4, 6), (6, 8), (8, 10), (11, 13)], [(0, 2), (2, 4), (3, 5), (4, 6), (5, 7), (9, 11), (11, 13), (12, 14)], [(1, 3), (2, 4), (4, 6), (5, 7), (6, 8), (7, 9), (8, 10), (12, 14)]]:
    print(f"patrons_temporals_avancats es {solucio.patrons_temporals_avancats} i hauria de ser [[(0, 2), (3, 5), (8, 10), (9, 11), (10, 12), (12, 14)], [(0, 2), (1, 3), (2, 4), (5, 7), (6, 8), (10, 12), (11, 13), (12, 14)], [(0, 2), (3, 5), (4, 6), (6, 8), (8, 10), (11, 13)], [(0, 2), (2, 4), (3, 5), (4, 6), (5, 7), (9, 11), (11, 13), (12, 14)], [(1, 3), (2, 4), (4, 6), (5, 7), (6, 8), (7, 9), (8, 10), (12, 14)]]")
    tot_ok = False
if solucio.patro_crecent != False:
    print(f"El patro no es creixent")
    tot_ok = False
if solucio.patro_decreixent != False:
    print(f"El patro no es decreixent")
    tot_ok = False
print("\n================================\n")
if tot_ok:
    print("Resultats correctes")
else:
    print("Has de revisar resultats")