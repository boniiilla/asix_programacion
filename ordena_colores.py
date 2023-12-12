array = ["indigo", "groc", "verd", "vermell", "cian", "blau", "taronja"]

'''
indigo = 435
groc = 580
verd = 510
vermell = 675
blau = 440
cian = 489
taronja = 606
'''

longitud_onda = {"indigo" : 435, "groc" : 580, "verd" : 510, "vermell" : 675, "blau" : 440, "cian" : 489, "taronja" : 606}
len_array = len(array)

for color1 in range(0,len_array):
    for color2 in range(color1,len_array): 
        if longitud_onda[array[color1]] > longitud_onda[array[color2]]:
            array[color1], array[color2] = array[color2], array[color1]

print(array)