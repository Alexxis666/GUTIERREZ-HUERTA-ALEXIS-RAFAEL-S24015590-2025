import java.util.Scanner;

public class CalificacionesLetras {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa la nota numerica (0.0 - 5.0): ");
        double nota = sc.nextDouble();

        String valoracion = "";

        if (nota >= 0.0 && nota <= 1.0) {
            valoracion = "P (Pesimo)";
        } else if (nota >= 1.1 && nota <= 2.0) {
            valoracion = "M (Mal)";
        } else if (nota >= 2.1 && nota <= 2.9) {
            valoracion = "R (Regular)";
        } else if (nota >= 3.0 && nota <= 4.0) {
            valoracion = "B (Bien)";
        } else if (nota >= 4.1 && nota <= 5.0) {
            valoracion = "E (Excelente)";
        } else {
            valoracion = "Nota fuera de rango";
        }

        System.out.println("La valoracion es: " + valoracion);
    }
}