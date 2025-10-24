import java.util.Scanner;

public class NuevoSalario {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double incremento = 0.25;

        System.out.print("Ingresa el salario anterior del obrero: ");
        double salarioanterior = sc.nextDouble();

        double aumento = salarioanterior * incremento;
        double nuevosalario = salarioanterior + aumento;

        System.out.println("El nuevo salario con un 25% de incremento es: $" + nuevosalario);
}
}