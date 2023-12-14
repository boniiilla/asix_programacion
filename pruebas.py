x = [1,2,4,7]

print("COPIA X a Y")
y = x.copy()
y[1] = 6
for i in range(len(x)):
    print(x[i])

print("AÑADIR VALORES DE X a Y")
y = []
for value in x:
    y.append(value)
y[1] = 6
for i in range(len(x)):
    print(x[i])

print("ACCEDER A X DES DE Y")
y = x
y[1] = 6
for i in range(len(x)):
    print(x[i])