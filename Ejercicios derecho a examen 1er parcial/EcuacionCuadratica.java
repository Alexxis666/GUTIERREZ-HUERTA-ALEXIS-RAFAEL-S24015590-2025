import java.util.Scanner;

public class EcuacionCuadratica {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Para la ecuacion Ax^2 + Bx + C = 0, ingresa los coeficientes:");
        System.out.print("Valor de A: ");
        double a = sc.nextDouble();
        System.out.print("Valor de B: ");
        double b = sc.nextDouble();
        System.out.print("Valor de C: ");
        double c = sc.nextDouble();

        if (a == 0) {
        System.out.println("Error: El coeficiente 'A' no puede ser cero. No es una ecuacion cuadratica.");
        return;}

        double discriminante = (b * b) - (4 * a * c);

        if (discriminante >= 0) {
        double raiz = Math.sqrt(discriminante);
        double x1 = (-b + raiz) / (2 * a);
        double x2 = (-b - raiz) / (2 * a);
        System.out.println("Las raíces reales son:");
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
        } else {
        System.out.println("Error: La ecuacoin tiene raices imaginarias (el discriminante es negativo).");
        }
}
}
