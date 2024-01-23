libros = ["Harry Potter y la Piedra Filosofal", "Harry Potter y la Camara de los Secretos", "Harry Potter y el Priosionero de Azkaban", "Los Pitufos", "Doraemon"]

accion = 'x'

while accion.upper() != 'S':
    accion = input("INTRODUCE LA OPCION: 'M' Mostrar Libreria | 'A' Añadir Libro | 'E' Eliminar Libro | 'S' Salir :  ")
    accion = accion.upper()
    if accion == 'M':
        print(libros)
    else:
        if accion == 'A':
            libro_nuevo = input("Libro que desea añadir: ")
            libros.append(libro_nuevo)
        else:
            if accion == 'E':
                libro_eliminado = input("Libro que desea eliminar: ")
                libros.remove(libro_eliminado)
            else:
                if accion != 'S':
                    print("OPCION ERRONEA")