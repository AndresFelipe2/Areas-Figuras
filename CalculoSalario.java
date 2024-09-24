import java.util.Scanner;

public class CalculoSalario {
    public static void main(String[] args) {
        double salario = 2000000;
        double desc_icbf = 0.05;
        double desc_sena = 0.04;
        double desc_gov = 0.05;
        String ocupacion;
        String nom;
        String entidad;
        double compensacion = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ocupacion del empleado: ");
        ocupacion = scanner.nextLine();

        System.out.print("Nombre completo del empleado: ");
        nom = scanner.nextLine();

        System.out.print("Entidad registrada: ");
        entidad = scanner.nextLine();

        if (entidad.equals("Confama")) {
            compensacion = 0.04;
        } else if (entidad.equals("Cofenalco")) {
            compensacion = 0.02;
        } else {
            compensacion = 0.01;
        }

        double comp_total = salario * compensacion;
        double desc_comp_total = 0.01;
        String ciclo = "2024-2";

        double desc_total = desc_icbf + desc_sena + desc_gov + desc_comp_total;
        double desc_salario = (salario * desc_total) / 2;
        double salario_final = salario - desc_salario;

        System.out.println("RESUMEN SALARIO SAMSUNG S.A");
        System.out.println("Empleado: " + nom);
        System.out.println("Cargo: " + ocupacion);
        System.out.println(ciclo);
        System.out.println("Salario bruto: " + salario);
        System.out.println("Desc salario: " + desc_salario);
        System.out.println("Salario final: " + salario_final);
        
        scanner.close();
    }
}
