import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aprobados = 0;
        int reprobados = 0;
        double suma = 0;

        for (int i = 1; i <= 5; i++) { 
            System.out.print("Calificación alumno " + i + " (1-10): ");
            double calif = sc.nextDouble();
            suma += calif;
            if (calif >= 6) aprobados++;
            else reprobados++;
        }
        System.out.println("Aprobados: " + aprobados);
        System.out.println("Reprobados: " + reprobados);
        System.out.println("Promedio: " + (suma / 5));
    }
}