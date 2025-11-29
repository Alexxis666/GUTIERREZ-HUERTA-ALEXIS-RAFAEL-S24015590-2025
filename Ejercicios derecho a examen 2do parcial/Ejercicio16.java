import java.util.Scanner;
public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] inventario = new String[3][3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Artículo " + (i+1));
            System.out.print("Nombre (Camisa/Zapato/Pantalón): ");
            inventario[i][0] = sc.next();
            System.out.print("Talla: ");
            inventario[i][1] = sc.next();
            System.out.print("Color: ");
            inventario[i][2] = sc.next();
        }
 
        System.out.println("\nArtículo\tTalla\tColor");
        for (int i = 0; i < 3; i++) {
            System.out.println(inventario[i][0] + "\t\t" + inventario[i][1] + "\t" + inventario[i][2]);
        }
    }
}