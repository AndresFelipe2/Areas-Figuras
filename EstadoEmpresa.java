import java.util.Scanner;

public class EstadoEmpresa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite el estado actual de la empresa:");
        System.out.println("1. Es muy rentable");
        System.out.println("2. Se sostiene");
        System.out.println("3. En quiebra");
        
        int estadoEmpresa = scanner.nextInt();

        switch (estadoEmpresa) {
            case 1:
                System.out.println("Felicitaciones a la empresa");
                break;
            case 2:
                System.out.println("Trabajar más");
                break;
            case 3:
                System.out.println("Deben despedir al gerente");
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }

        scanner.close();
    }
}

