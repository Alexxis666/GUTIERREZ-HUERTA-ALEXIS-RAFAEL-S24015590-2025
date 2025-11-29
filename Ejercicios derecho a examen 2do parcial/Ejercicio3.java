import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;
        double adeudo = 1000.00;

        while (continuar) {
            System.out.println("\n--- CAJERO CFE ---");
            System.out.println("1. Consulta");
            System.out.println("2. Pago del mes");
            System.out.println("3. Pago de adeudo");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                case 2:
                case 3:
                    System.out.println("Su adeudo actual es de: $" + adeudo);
                    break;
                case 4:
                    System.out.println("Gracias por usar el servicio. Adios.");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }

            if (opcion != 4) {
                System.out.print("¿Desea realizar otra operación? (1=Sí, 2=No): ");
                int resp = sc.nextInt();
                if (resp != 1) {
                    continuar = false;
                    System.out.println("Despedida: Gracias por su visita.");
                }
            }
        }
    }
}