import java.util.Scanner;

public class CostoLlamada {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingresa la duración de la llamada en minutos: ");
        int minutos = sc.nextInt();
        
        double costototal;
        
        if (minutos <= 3) {
            costototal = 10.00;
        } else {
            costototal = 10.00;
            int minutosadicionales = minutos - 3;
            costototal += minutosadicionales * 1.00;
        }
        
        System.out.println("El costo total de la llamada es: $" + costototal);
}
}