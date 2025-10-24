import java.util.Scanner;

public class SalarioEmpleado {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pagoporhora = 0;

        System.out.print("Ingresa la categoria del empleado (1-4): ");
        int categoria = sc.nextInt();

        System.out.print("Ingresa el numero de horas trabajadas en el mes: ");
        int horastrabajadas = sc.nextInt();

        switch (categoria) {
        case 1:
                pagoporhora = 20000;
                break;
        case 2:
                pagoporhora = 15000;
                break;
        case 3:
                pagoporhora = 10000;
                break;
        case 4:
                pagoporhora = 7500;
                break;
        default:
                System.out.println("Categoría no valida.");
		return;
        }

        double salariomensual = pagoporhora * horastrabajadas;
        double salariofinal = salariomensual;

        System.out.println("Salario mensual (sin descuentos): $" + salariomensual);

        if (salariomensual < 1000000) {
        double subsidio = salariomensual * 0.15;
        salariofinal += subsidio;
        System.out.println("Subsidio (15%): $" + subsidio);
        }

        double descuentosalud = salariofinal * 0.072;
        salariofinal -= descuentosalud;
        System.out.println("Descuento de salud (7.2%): -$" + descuentosalud);
      
	System.out.println("El pago total para el empleado es: $" + salariofinal);
}
}