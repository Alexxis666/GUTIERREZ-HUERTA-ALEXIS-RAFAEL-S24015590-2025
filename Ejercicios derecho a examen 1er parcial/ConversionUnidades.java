import java.util.Scanner;

public class ConversionUnidades {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa la cantidad en metros: ");
        double metros = sc.nextDouble();

        double pulgadas = metros * 39.37;
        double pies = metros * 3.281;

        System.out.println(metros + " metros equivale a:");
        System.out.println(pies + " pies");
        System.out.println(pulgadas + " pulgadas");
}
}