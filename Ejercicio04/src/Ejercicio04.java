import java.util.Scanner;
public class Ejercicio04 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String frase;
		int opc;
		
		
		System.out.println("Mete una frase");
		frase = teclado.nextLine();
		
		
		System.out.println("Elige una opcion");
		opc = teclado.nextInt();
		
		switch(opc){
		
		case 1:
			System.out.println(frase.toUpperCase());
			
			break;
			
		case 2:
			
			System.out.println(frase.toLowerCase());
			break;
			
			
		default:
			System.out.println("Opcion incorrecta");
			break;
		
		
		}
		
		
		
		

	}

}
