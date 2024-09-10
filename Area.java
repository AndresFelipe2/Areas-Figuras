import java.util.Scanner;

public class CalculadoraDeAreas {
    // Método para calcular el área del triángulo
    public static double calcularAreaTriangulo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la base del triángulo: ");
        double base = scanner.nextDouble();
        System.out.print("Ingresa la altura del triángulo: ");
        double altura = scanner.nextDouble();
        return (base * altura) / 2;
    }

    // Método para calcular el área del cuadrado
    public static double calcularAreaCuadrado() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un lado del cuadrado: ");
        double lado = scanner.nextDouble();
        System.out.print("Ingresa otro lado del cuadrado: ");
        double lado2 = scanner.nextDouble();
        return lado * lado2;
    }

    // Método para calcular el área del rectángulo
    public static double calcularAreaRectangulo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el largo del rectángulo: ");
        double largo = scanner.nextDouble();
        System.out.print("Ingresa el ancho del rectángulo: ");
        double ancho = scanner.nextDouble();
        return largo * ancho;
    }

    // Método para calcular el área del pentágono
    public static double calcularAreaPentagono() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la longitud del lado del pentágono: ");
        double lado = scanner.nextDouble();
        System.out.print("Ingresa la apotema del pentágono: ");
        double apotema = scanner.nextDouble();
        return (5 * lado * apotema) / 2;
    }

    // Método para calcular el área del círculo
    public static double calcularAreaCirculo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el radio del círculo: ");
        double radio = scanner.nextDouble();
        return Math.PI * radio * radio;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora de Áreas");
        System.out.println("1. Triángulo");
        System.out.println("2. Rectángulo");
        System.out.println("3. Pentágono");
        System.out.println("4. Cuadrado");
        System.out.println("5. Círculo");

        System.out.print("Elige la figura (1, 2, 3, 4, 5): ");
        String opcion = scanner.nextLine();

        double area = 0.0;

        switch (opcion) {
            case "1":
                area = calcularAreaTriangulo();
                System.out.printf("El área del triángulo es: %.2f%n", area);
                break;
            case "2":
                area = calcularAreaRectangulo();
                System.out.printf("El área del rectángulo es: %.2f%n", area);
                break;
            case "3":
                area = calcularAreaPentagono();
                System.out.printf("El área del pentágono es: %.2f%n", area);
                break;
            case "4":
                area = calcularAreaCuadrado();
                System.out.printf("El área del cuadrado es: %.2f%n", area);
                break;
            case "5":
                area = calcularAreaCirculo();
                System.out.printf("El área del círculo es: %.2f%n", area);
                break;
            default:
                System.out.println("Opción no válida. Por favor, elige 1, 2, 3, 4 o 5.");
                break;
        }

        scanner.close();
    }
}
