import java.util.Scanner;

public class DescuentoSupermercado{
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingresa el total de la compra: ");
        double totalCompra = sc.nextDouble();
        
        System.out.print("Ingresa un numero para la promocion: ");
        int numeroElegido = sc.nextInt();
        
        double montoDescuento;
        
        System.out.println("El numero que elegiste es: " + numeroElegido);
        
        if (numeroElegido < 74) {
        montoDescuento = totalCompra * 0.15;
        System.out.println("Felicidades, Obtuviste un descuento del 15%.");
        } else {
        montoDescuento = totalCompra * 0.20;
        System.out.println("Felicidades, Obtuviste un descuento del 20%.");
        }
        
        System.out.println("El dinero que se te descuenta es: $" + montoDescuento);
}
}