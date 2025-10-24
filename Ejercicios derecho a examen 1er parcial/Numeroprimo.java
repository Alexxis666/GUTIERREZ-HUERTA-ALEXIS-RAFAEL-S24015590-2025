import java.util.Scanner;
public class NumeroPrimo {
public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un numero:");
        int numero = sc.nextInt();

        if (numero <= 1) {
        System.out.println("No es primo");
        } else {
        int i = 2;
        int divisor = 0;

        while (i < numero) {
        if (numero % i == 0) {
        divisor = 1; 
        break;                 }
	i++;
        }

        if (divisor == 0) {
        System.out.println("Es primo");
        } else {
        System.out.println("No es primo");
        }
        }
}
}