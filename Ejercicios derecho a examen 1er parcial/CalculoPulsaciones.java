import java.util.Scanner;

public class CalculoPulsaciones {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa tu edad: ");
        int edad = sc.nextInt();

        double pulsaciones = (220 - edad) / 10.0;

        System.out.println("Debes tener " + pulsaciones + " pulsaciones por cada 10 segundos de ejercicio.");
}
}