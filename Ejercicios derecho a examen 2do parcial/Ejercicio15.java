import java.util.Scanner;
public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] paises = new String[4];
        double[][] temperaturas = new double[4][3];
        double[] promedios = new double[4];

        for (int i = 0; i < 4; i++) {
            System.out.print("Nombre del país " + (i+1) + ": ");
            paises[i] = sc.next();
            double suma = 0;
            for (int j = 0; j < 3; j++) {
                System.out.print("Temp mes " + (j+1) + ": ");
                temperaturas[i][j] = scanner.nextDouble();
                suma += temperaturas[i][j];
            }
            promedios[i] = suma / 3; 
        }

        System.out.println("--- Reporte ---");
        int idxMayor = 0;
        for (int i = 0; i < 4; i++) {
            System.out.printf("País: %s - Promedio: %.2f%n", paises[i], promedios[i]); 
            if (promedios[i] > promedios[idxMayor]) {
                idxMayor = i;
            }
        }
        System.out.println("País con temp media más alta: " + paises[idxMayor]);
    }
}