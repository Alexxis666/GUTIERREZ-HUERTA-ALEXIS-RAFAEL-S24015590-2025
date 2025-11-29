import java.util.Scanner;
public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] empleados = new String[4];
        double[][] sueldos = new double[4][3]; 
        double[] totalPorEmpleado = new double[4]; 
        double granTotal = 0;

        for (int i = 0; i < 4; i++) {
            System.out.print("Nombre empleado " + (i+1) + ": ");
            empleados[i] = sc.next();
            for (int j = 0; j < 3; j++) {
                System.out.print("Sueldo mes " + (j+1) + ": ");
                sueldos[i][j] = sc.nextDouble();
                totalPorEmpleado[i] += sueldos[i][j];
            }
            granTotal += totalPorEmpleado[i];
        }

        System.out.println("Total pagado a todos: $" + granTotal);
        
        int idxMejor = 0;
        for(int i=1; i<4; i++){
            if(totalPorEmpleado[i] > totalPorEmpleado[idxMejor]){
                idxMejor = i;
            }
        }
        System.out.println("Empleado con mayor ingreso: " + empleados[idxMejor]);
    }
}