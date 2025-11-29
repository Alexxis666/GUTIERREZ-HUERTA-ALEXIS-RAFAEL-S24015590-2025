import java.util.Scanner;
public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] academia = new int[3][4]; 

        System.out.println("Registro de 12 estudiantes.");
        for (int i = 1; i <= 12; i++) {
            System.out.println("Estudiante " + i + ":");
            System.out.println("Nivel (0=Básico, 1=Medio, 2=Perfeccionamiento): ");
            int nivel = sc.nextInt();
            System.out.println("Idioma (0=Inglés, 1=Francés, 2=Alemán, 3=Ruso): ");
            int idioma = sc.nextInt();

            if (nivel >= 0 && nivel < 3 && idioma >= 0 && idioma < 4) {
                academia[nivel][idioma]++;
            }
        }

        System.out.println("--- Matriz de Alumnos ---");
        System.out.println("\tIng\tFran\tAle\tRuso");
        String[] niveles = {"Básico", "Medio ", "Perfec"};
        for (int i = 0; i < 3; i++) {
            System.out.print(niveles[i] + "\t");
            for (int j = 0; j < 4; j++) {
                System.out.print(academia[i][j] + "\t");
            }
            System.out.println();
        }
    }
}