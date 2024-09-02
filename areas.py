import math
def calcular_area_triangulo():
    base = float(input("Ingresa la base del triangulo: "))
    altura = float(input("Ingresa la altura del triangulo: "))
    area = (base * altura) / 2
    return area

def calcular_area_cuadrado():
    lado = float(input('Ingresa un lado del cuadrado: '))
    lado2 = float(input("Ingresa otro lado del cuadrado: "))
    area = lado * lado2
    return area

def calcular_area_rectangulo():
    largo = float(input("Ingresa el largo del rectangulo: "))
    ancho = float(input("Ingresa el ancho del rectangulo: "))
    area = largo * ancho
    return area

def calcular_area_pentagono():
    lado = float(input("Ingresa la longitud del lado del pentagono: "))
    apotema = float(input("Ingresa la apotema del pentagono: "))
    area = (5 * lado * apotema) / 2
    return area

def calcular_area_circulo():
    radio = float(input("Ingresa el radio del circulo: "))
    area = math.pi * radio * radio
    return area


def main():
    print("Calculadora de Áreas")
    print("1. Triángulo")
    print("2. Rectángulo")
    print("3. Pentágono")
    print("4. Cuadrado")
    print("5. Circulo")
    
    opcion = input("Elige la figura (1, 2, 3, 4, 5): ")
    
    if opcion == "1":
        area = calcular_area_triangulo()
        print(f"El area del triangulo es: {area}")
    elif opcion == "2":
        area = calcular_area_rectangulo()
        print(f"El area del rectangulo es: {area}")
    elif opcion == "3":
        area = calcular_area_pentagono()
        print(f"El area del pentagono es: {area}")
    elif opcion == "4":
        area = calcular_area_cuadrado()
        print(f'El area del cuadrado es: {area}')
    elif opcion == "5":
        print(f'El area del circulo es: {area}')
    else:
        print("Opcion no valida. Por favor, elige 1, 2, 3, 4 o 5.")

if __name__ == "__main__":
    main()
