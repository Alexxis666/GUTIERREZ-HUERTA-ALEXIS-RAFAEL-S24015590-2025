import java.util.Scanner;

public class CalculoEdad {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa tu año de nacimiento: ");
        int AnioNacimiento = sc.nextInt();

        System.out.print("Ingresa el año actual: ");
        int AnioActual = sc.nextInt();

        int edad = AnioActual - AnioNacimiento;

        System.out.println("Tu edad es: " + edad + " años.");
}
}