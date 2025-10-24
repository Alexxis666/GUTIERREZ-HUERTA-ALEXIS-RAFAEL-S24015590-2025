import java.util.Scanner;

public class PromedioCalif {
	public static void main(String[] args) {
      	Scanner sc = new Scanner(System.in);
	System.out.print("Ingresa la calificacion de la materia 1: ");
        double calif1 = sc.nextDouble();

        System.out.print("Ingresa la calificacion de la materia 2: ");
        double calif2 = sc.nextDouble();

        System.out.print("Ingresa la calificacion de la materia 3: ");
        double calif3 = sc.nextDouble();

        double promedio = (calif1 + calif2 + calif3) / 3;

        System.out.println("El promedio general de las tres materias es: " + promedio);
    }
}