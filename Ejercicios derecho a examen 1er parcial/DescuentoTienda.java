import java.util.Scanner;

public class DescuentoTienda {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double descuento = 0.15;

        System.out.print("Ingresa el total de la compra: ");
        double totalcompra = sc.nextDouble();

        double montodescuento = totalcompra * descuento;
        double total = totalcompra - montodescuento;

        System.out.println("El total a pagar con un 15% de descuento es: $" + total);
}
}