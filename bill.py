salario = 2000000
desc_icbf = 0.05
desc_sena = 0.04
desc_gov = 0.05
ocupacion = input("Ocupacion del empleado: ")
nom = input("Nombre completo del empleado: ")
entidad = input("Entidad registrada: ")
compensacion = 0

if entidad == "Confama":
    compensacion = 0.04

elif entidad == "Cofenalco":
    compensacion = 0.02

else:
    compensacion = 0.01

comp_total = salario * compensacion

desc_comp_total = 0.01

Ciclo = ("2024-2")

desc_total = desc_icbf + desc_sena + desc_gov + desc_comp_total



desc_salario = (salario * desc_total) / 2
salario_final = salario - desc_salario 


print("RESUMEN SALARIO SAMSUNG S.A")
print(f"Empleado: {nom}")
print(f"Cargo: {ocupacion}")
print(Ciclo)
print(f"Salario bruto: {salario}")
print(f"Desc salario: {desc_salario}")
print(f"Salario final: {salario_final}")

