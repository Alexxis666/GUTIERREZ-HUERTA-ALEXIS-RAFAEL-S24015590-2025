import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10]; 

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingresa número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("Números en orden inverso:");
        for (int i = 9; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
    }
}