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
        print("LIBRERIA:")
        for libro in libros:
            print(libro)
        print("\nPRESTADOS:")
        for prestado in libros_prestados:
            print(prestado)
    elif accion == 'A':
        libro_nuevo = input("Libro que desea añadir: ")
        libros.append(libro_nuevo)
    elif accion == 'E':
        libro_eliminado = input("Libro que desea eliminar: ")
        libros.remove(libro_eliminado)
    elif accion == 'P':
        libro_prestado = input("Libro que desea coger como prestamo: ")
        for i in range(len(libros)):
            print(libros[i])
            if libros[i] == libro_prestado:
                libros_prestados.append(libros.pop(i))
