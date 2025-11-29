import java.util.Scanner;
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] ventas = new double[7]; 
        String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        double total = 0;
        double maxVenta = 0;
        String diaMax = "";

        for (int i = 0; i < 7; i++) {
            System.out.print("Venta del " + dias[i] + ": ");
            ventas[i] = sc.nextDouble();
            total += ventas[i];
            if (ventas[i] > maxVenta) {
                maxVenta = ventas[i];
                diaMax = dias[i];
            }
        }

        System.out.println("Venta total de la semana: $" + total); 
        System.out.println("Día con mayor venta: " + diaMax + " ($" + maxVenta + ")");
    }
}