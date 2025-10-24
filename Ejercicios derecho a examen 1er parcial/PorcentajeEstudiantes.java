import java.util.Scanner;

public class PorcentajeEstudiantes {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el numero de hombres: ");
        int hombres = sc.nextInt();

        System.out.print("Ingresa el numero de mujeres: ");
        int mujeres = sc.nextInt();

        int total = hombres + mujeres;
        double porcentajeh = (hombres * 100.0) / total;
        double porcentajem = (mujeres * 100.0) / total;
        System.out.println("Porcentaje de hombres: " + porcentajeh + "%");
        System.out.println("Porcentaje de mujeres: " + porcentajem + "%");
}
}