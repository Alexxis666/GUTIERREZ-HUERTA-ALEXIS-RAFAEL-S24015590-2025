public class Ejercicio2 {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("Números pares entre 1 y 20:");
        while (i <= 20) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}