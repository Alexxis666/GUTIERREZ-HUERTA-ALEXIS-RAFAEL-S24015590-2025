import java.util.Scanner;

public class ConversionTemperatura {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa la temperatura en grados centigrados: ");
        double centigrados = sc.nextDouble();

        double fahrenheit = (centigrados * 9/5) + 32;
        double kelvin = centigrados + 273.15;

        System.out.println(centigrados + " grados centigrados equivale a:");
        System.out.println(fahrenheit + " grados Fahrenheit");
        System.out.println(kelvin + " grados Kelvin");
}
}