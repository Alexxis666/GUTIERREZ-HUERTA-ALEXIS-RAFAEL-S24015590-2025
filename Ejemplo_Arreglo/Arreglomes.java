import java.util.Scanner;
	public class Arreglomes{
	    public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		String mes[]= {"Enero ", " Febrero ", " Marzo ", " Abril ", " Mayo ", " Junio ", " Julio ", " Agosto ", " Septiembre ", " Octubre ", " Noviembre ", " Diciembre "};
		int dias[] = new int[12];
				
			for(int i=0; i<12; i++){
				System.out.println("El mes "+mes[i]+"Tiene: ");
				dias[i]=sc.nextInt();
			}
				System.out.println("Marzo tiene " +dias[2]+ " días" );
	}
}