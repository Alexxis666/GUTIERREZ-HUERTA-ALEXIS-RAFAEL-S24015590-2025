public class Ejercicio8 {
    public static void main(String[] args) {
        double ahorroAcumulado = 0;
        double depositoMensual = 500;
        double tasaInteres = 0.09;

        for (int mes = 1; mes <= 12; mes++) { 
            ahorroAcumulado += depositoMensual;
            ahorroAcumulado += (ahorroAcumulado * tasaInteres);
            System.out.printf("Mes %d: Ahorro acumulado: $%.2f%n", mes, ahorroAcumulado);
        }
        System.out.printf("Total final ahorrado: $%.2f%n", ahorroAcumulado);
    }
}