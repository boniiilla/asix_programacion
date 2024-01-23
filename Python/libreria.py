libros = []

accion = 0
while accion.upper() != 'S':
    accion = input("INTRODUCE LA OPCION: 'M' Mostrar Libreria | 'A' Añadir Libro | 'E' Eliminar Libro | 'S' Salir :  ")
    if accion.upper() == 'M':
        print(libros)
    else:
        if accion.upper() == 'A':
            libro_nuevo = input("Libro que desea añadir: ")
            libros.append(libro_nuevo)
        else:
            if accion.upper() == 'E':
                libro_eliminado = input("Libro que desea eliminar: ")
                libros.remove(libro_eliminado)
            else:
            print("OPCION ERRONEA")