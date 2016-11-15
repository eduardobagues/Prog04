import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in);
		
		String cad,a;
		
		System.out.println("Pon una frase");
		
		cad = teclado.nextLine();
		
		for(int cont=1; cont<=cad.length(); cont++){
			
			System.out.println(cad.substring(0, cont));
			
			
			
		}
		
		
	}

}