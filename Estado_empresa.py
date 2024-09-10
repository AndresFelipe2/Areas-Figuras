estado_empresa = input("""
Digite el estado actual de la empresa:
    1.Es muy rentable
    2.Se sostiene 
    3.En quiebra""")

if estado_empresa == 1:
    print("Felicitaciones a la empresa")

elif estado_empresa == 2:
    print("Trabajar mas")

elif estado_empresa == 3:
    print("Deben despedir al gerente")