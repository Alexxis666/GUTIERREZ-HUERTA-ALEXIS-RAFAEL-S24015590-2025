import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldo = 5000.00;
        boolean continuar = true;

        while (continuar) {
            System.out.println("Saldo disponible: $" + saldo);
            System.out.print("Ingrese monto a retirar: ");
            double retiro = sc.nextDouble(); 

            if (retiro > saldo) {
                System.out.println("Saldo insuficiente."); 
            } else {
                saldo -= retiro;
                System.out.println("Retiro exitoso. Nuevo saldo: $" + saldo); 
            }

            System.out.print("¿Desea realizar otro retiro? (1=Sí, 2=No): ");
            int resp = sc.nextInt();
            if (resp != 1) {
                continuar = false; 
            }
        }
    }
}