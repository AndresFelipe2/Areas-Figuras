cantidad_notas = int(input("Ingrese la cantidad de notas: "))

suma_notas = 0.0

for i in range(cantidad_notas):
    nota = float(input(f"Ingrese la nota {i + 1}: "))
    suma_notas += nota

promedio = suma_notas / cantidad_notas

print(f"El promedio es: {promedio:.2f}")

if promedio >= 3.0:
    print("Aprobado")
    if promedio > 4.7:
        print("Felicitaciones, ha obtenido una excelente nota")
else:
    print("Reprobado")