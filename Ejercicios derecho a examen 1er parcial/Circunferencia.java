import java.util.Scanner;

public class Circunferencia {
public static void main(String[] args) {
	double PI = 3.1416;

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el radio de la circunferencia: ");
        double radio = sc.nextDouble();

        double longitud = 2 * PI * radio;
        double area = PI * radio * radio;

        System.out.println("La longitud de la circunferencia es: " + longitud);
        System.out.println("El area del circulo es: " + area);
}
}