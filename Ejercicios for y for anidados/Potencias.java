import java.util.Scanner;

public class Potencias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el número base: ");
        double base = sc.nextDouble();

        System.out.print("Ingresa el exponente: ");
        int exponente = sc.nextInt();

        double resultado = 1;
        int contador = exponente < 0 ? -exponente : exponente;

        for (int i = 0; i < contador; i++) {
            resultado *= base;
        }

        if (exponente < 0) {
            resultado = 1 / resultado;
        }

        System.out.println(base + " elevado a la potencia " + exponente + " es: " + resultado);

        sc.close();
    }
}