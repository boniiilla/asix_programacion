libros = []

accion = 0
while accion != 'S':
    accion = input("INTRODUCE LA SIGUIENTE ACCION: 'M' Mostrar Libreria | 'A' Añadir Libro | 'E' Eliminar Libro | 'S' Salir :  ")
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