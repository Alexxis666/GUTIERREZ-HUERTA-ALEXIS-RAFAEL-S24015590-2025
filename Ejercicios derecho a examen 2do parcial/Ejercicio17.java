import java.util.Scanner;
public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cuántos atletas registrará?: ");
        int n = sc.nextInt();
        String[][] atletas = new String[n][4]; 

        for (int i = 0; i < n; i++) {
            System.out.println("Atleta " + (i+1));
            System.out.print("Nombre: ");
            atletas[i][0] = sc.next();
            System.out.print("Apellido: ");
            atletas[i][1] = sc.next();
            System.out.print("Especialidad: ");
            atletas[i][2] = sc.next();
            System.out.print("Tiempo (segundos): ");
            atletas[i][3] = sc.next();
        }

        int idxMejor = 0;
        double menorTiempo = Double.parseDouble(atletas[0][3]);

        System.out.println("\nTabla de Atletas");
        System.out.println("Nombre\tApellido\tEspec.\tTiempo");
        
        for (int i = 0; i < n; i++) {
            double tiempoActual = Double.parseDouble(atletas[i][3]);
            if (tiempoActual < menorTiempo) {
                menorTiempo = tiempoActual;
                idxMejor = i;
            }
            System.out.println(atletas[i][0] + "\t" + atletas[i][1] + "\t\t" + atletas[i][2] + "\t" + atletas[i][3]);
        }
        
        System.out.println("\nMejor tiempo: " + atletas[idxMejor][0] + " " + atletas[idxMejor][1] + " con " + menorTiempo + "s"); 
    }
}