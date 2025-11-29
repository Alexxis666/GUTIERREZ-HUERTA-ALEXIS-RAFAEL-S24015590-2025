import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] calificaciones = new double[6];
        double suma = 0;

        for (int i = 0; i < calificaciones.length; i++) {
            System.out.print("Ingresa calificación " + (i + 1) + ": ");
            calificaciones[i] = sc.nextDouble();
            suma += calificaciones[i];
        }

        System.out.println("--- Resultados ---");
        for (double c : calificaciones) {
            System.out.println("Calificación: " + c);
        }
        System.out.println("Promedio general: " + (suma / 6));
    }
}