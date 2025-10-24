import java.util.Scanner;

public class PresupuestoHospital {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingresa el monto del presupuesto anual del hospital: ");
        double presupuestototal = sc.nextDouble();

        double montoginecologia = presupuestototal * 0.40;
        double montotraumatologia = presupuestototal * 0.30;
        double montopediatria = presupuestototal * 0.30;
        
        System.out.println("Distribucion del presupuesto:");
        System.out.println("Ginecologia (40%): $" + montoginecologia);
        System.out.println("Traumatologia (30%): $" + montotraumatologia);
        System.out.println("Pediatria (30%): $" + montopediatria);
    }
}