import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 1;

        while (contador <= 10) {
            System.out.print("Ingresa el nombre de la persona " + contador + ": ");
            String nombre = sc.nextLine();
            System.out.println("Nombre registrado: " + nombre);
            contador++;
        }
    }
}