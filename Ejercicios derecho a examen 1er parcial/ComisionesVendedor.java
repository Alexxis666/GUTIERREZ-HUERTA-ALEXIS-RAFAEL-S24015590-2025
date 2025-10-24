import java.util.Scanner;

public class ComisionesVendedor {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double comisionTotal = 0;

        for (int i = 1; i <= 4; i++) {
        System.out.print("Ingresa el valor de la venta " + i + ": ");
        double valorVenta = sc.nextDouble();
        double comisionVenta = 0;

        if (valorVenta <= 10000000) {
        comisionVenta = valorVenta * 0.02;
        } else if (valorVenta > 10000000 && valorVenta < 15000000) {
        comisionVenta = valorVenta * 0.04;
        } else {
        comisionVenta = valorVenta * 0.10;
        }
        comisionTotal += comisionVenta;
        }

        System.out.println("El total de comisiones ganadas por las 4 ventas es: $" + comisionTotal);
}
}