import java.util.Scanner;

public class PromedioNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cantidadNotas = 0;
        double sumaNotas = 0.0;
        
        // Validación de la cantidad de notas
        while (true) {
            System.out.print("Ingrese la cantidad de notas: ");
            try {
                cantidadNotas = Integer.parseInt(scanner.nextLine());
                if (cantidadNotas <= 0) {
                    throw new NumberFormatException("La cantidad de notas debe ser mayor que cero.");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Error: " + e.getMessage() + ". Por favor, ingrese un número entero válido.");
            }
        }
        
        // Entrada y suma de las notas
        for (int i = 1; i <= cantidadNotas; i++) {
            while (true) {
                System.out.print("Ingrese la nota " + i + ": ");
                try {
                    double nota = Double.parseDouble(scanner.nextLine());
                    if (nota < 0 || nota > 5) {
                        throw new NumberFormatException("La nota debe estar entre 0 y 5.");
                    }
                    sumaNotas += nota;
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Error: " + e.getMessage() + ". Por favor, ingrese una nota válida.");
                }
            }
        }
        
        // Cálculo del promedio
        double promedio = sumaNotas / cantidadNotas;
        System.out.printf("El promedio es: %.2f%n", promedio);
        
        // Evaluación del promedio
        if (promedio >= 3.0) {
            System.out.println("Aprobado");
            if (promedio > 4.7) {
                System.out.println("Felicitaciones, ha obtenido una excelente nota");
            }
        } else {
            System.out.println("Reprobado");
        }
        
        scanner.close();
    }
}
