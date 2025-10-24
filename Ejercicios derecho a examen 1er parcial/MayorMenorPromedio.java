import java.util.Scanner;
public class MayorMenorPromedio {
public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el primer numero: ");
        double num1 = sc.nextDouble();
        System.out.print("Ingresa el segundo numero: ");
        double num2 = sc.nextDouble();
        System.out.print("Ingresa el tercer numero: ");
        double num3 = sc.nextDouble();

        if (num1 == num2 && num2 == num3) {
        System.out.println("Los tres numeros son iguales.");
        } else {
	double mayor = num1; 
        if (num2 > mayor) {
        mayor = num2; 
        }
        if (num3 > mayor) {
        mayor = num3; 
        }
        double menor = num1; 
        if (num2 < menor) {
        menor = num2;             
        }
        if (num3 < menor) {
        menor = num3; 
        }
        double promedio = (num1 + num2 + num3) / 3;

        System.out.println("El numero mayor es: " + mayor);
        System.out.println("El numero menor es: " + menor);
        System.out.println("El promedio es: " + promedio);
}
}
}