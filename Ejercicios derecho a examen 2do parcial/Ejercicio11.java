import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[8]; 

        for (int i = 0; i < 8; i++) {
            System.out.print("Ingresa número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        System.out.print("Ingresa número a buscar: ");
        int buscar = sc.nextInt();
        boolean encontrado = false;

        for (int n : numeros) {
            if (n == buscar) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) System.out.println("El número existe en el arreglo.");
        else System.out.println("El número NO existe.");
    }
}