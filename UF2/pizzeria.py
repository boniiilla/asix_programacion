#PRE: EL cliente hace una comanda de una pizza con los ingredientes que tenemos en stock

comandas_pizzeria = []

pizzas = {
    "Barbacoa" : {"Ingredientes" : ["Salsa BBQ", "Jamon York", "Mozzarella", "Carne Picada"],
                  "Precio" : 12},
    "Margarita" : {"Ingredientes" : ["Mozzarella", "Tomate"],
                   "Precio": 9},
    "Carbonara" : {"Ingredientes": ["Mozzarella", "Nata", "Bacon", "Cebolla", "Champiñones"],
                   "Precio": 10.5},
    "Hawaiana" : {"Ingredientes": ["Mozzarella", "Tomate", "Jamon York", "Piña"],
                   "Precio": 10},
    "Pepperoni" : {"Ingredientes": ["Mozzarella", "Tomate", "Pepperoni", "Bacon", "Carne Picada"],
                   "Precio": 11},
}

def añadir_comandas(comanda_pizzeria):
    print(f"Buenas, le dejo por aqui la carta de pizzas: \n")
    for pizza in pizzas:
        print(f"{pizza}: {pizzas[pizza]}€")



añadir_comandas(comandas_pizzeria)