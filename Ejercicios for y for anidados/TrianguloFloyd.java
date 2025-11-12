import java.util.Scanner;

public class TrianguloFloyd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa la altura del triángulo de Floyd: ");
        int n = sc.nextInt();

        int numero = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(numero + " ");
                numero++;
            }
            System.out.println();
        }

        sc.close();
    }
}