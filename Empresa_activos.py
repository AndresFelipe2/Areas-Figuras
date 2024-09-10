# Lee los valores de entrada del usuario
valor_activos = int(input("Digite el valor de los activos: "))
valor_pasivos = int(input("Digite el valor de los pasivos: "))
patrimonio = int(input("Digite el patrimonio neto de la empresa: "))

# Calcula las sumas necesarias para las comparaciones
valor_activos_mas_patrimonio = valor_activos + patrimonio
valor_activos_mas_pasivos = valor_activos + valor_pasivos

# Evalúa el estado financiero de la empresa según las reglas dadas
if valor_pasivos > valor_activos_mas_patrimonio:
    print("La empresa está en quiebra")

elif valor_pasivos > valor_activos and valor_pasivos < patrimonio:
    print("La empresa necesita una reestructuración de sus deudas")

elif valor_activos > valor_pasivos:
    print("La empresa puede repartir el 30% de sus activos")

# Esta condición debe ser evaluada después de las anteriores
# para garantizar que no haya conflicto con otras condiciones
elif patrimonio > valor_activos_mas_pasivos:
    print("Trabajar, trabajar, trabajar")

else:
    print("Error")
