import java.util.Scanner;

public class CalculoInversion {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double interes = 0.02;

        System.out.print("Ingresa el capital a invertir: ");
        double capital = sc.nextDouble();

        double ganancia = capital * interes;

        System.out.println("La ganancia despues de un mes sera de: $" + ganancia);
}
}