import java.util.Scanner;

public class EmpresaActivos {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite el valor de los activos: ");
        int valorActivos = scanner.nextInt();

        System.out.print("Digite el valor de los pasivos: ");
        int valorPasivos = scanner.nextInt();

        System.out.print("Digite el patrimonio neto de la empresa: ");
        int patrimonio = scanner.nextInt();

        int valorActivosMasPatrimonio = valorActivos + patrimonio;
        int valorActivosMasPasivos = valorActivos + valorPasivos;

        if (valorPasivos > valorActivosMasPatrimonio) {
            System.out.println("La empresa está en quiebra");
        } else if (valorPasivos > valorActivos && valorPasivos < patrimonio) {
            System.out.println("La empresa necesita una reestructuración de sus deudas");
        } else if (valorActivos > valorPasivos) {
            System.out.println("La empresa puede repartir el 30% de sus activos");
        } else if (patrimonio > valorActivosMasPasivos) {
            System.out.println("Trabajar, trabajar, trabajar");
        } else {
            System.out.println("Error");
        }

        
        scanner.close();
    }
}
