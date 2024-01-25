libros = ["Harry Potter y la Piedra Filosofal", "Harry Potter y la Camara de los Secretos", "Harry Potter y el Priosionero de Azkaban", "Los Pitufos", "Doraemon"]
libros_prestados = []
accion = 'x'

while accion.upper() != 'S':
    accion = input('''
OPCIONES:
    'M': Mostrar libreria y libros prestados
    'A': Añadir libro
    'E': Eliminar libro
    'P': Prestar libro
    'D': Devolver libro
    'S': Salir

INTRODUCE OPCION: ''')
    accion = accion.upper()
    if accion == 'M':
        print("\nLIBRERIA:")
        for libro in libros:
            print(libro)
        print("\nPRESTADOS:")
        for prestado in libros_prestados:
            print(prestado)
    elif accion == 'A':
        libro_nuevo = input("\nLibro que desea añadir: ")
        libros.append(libro_nuevo)
    elif accion == 'E':
        libro_eliminado = input("\nLibro que desea eliminar: ")
        libros.remove(libro_eliminado)
    elif accion == 'P':
        libro_prestado = input("\nLibro que desea coger como prestamo: ")
        prestado_bool = False
        i = 0
        while i < len(libros) and prestado_bool == False:
            if libros[i] == libro_prestado:
                libros_prestados.append(libros.pop(i))
                prestado_bool = True
            i += 1
            if i == (len(libros) - 1):
                print("\nEl libro no esta en la libreria.")
    elif accion == 'D':
        libro_devuelto = input("\nLibro que desea devolver: ")
        for prestado in range(len(libros_prestados)):
            if libros_prestados[prestado] == libro_devuelto:
                libros.append(libros_prestados.pop(prestado))
            else:
                print("\nLibro no encontrado en prestamos.")
    else:
        print("\nOpcion Erronea!")