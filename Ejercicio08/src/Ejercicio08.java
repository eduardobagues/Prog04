import java.util.Scanner;
public class Ejercicio08 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String frase, codificada = "";
		
		int num, num_ascii;
		
		
		
		System.out.println("Mete una frase");
		frase = teclado.nextLine();
		
		frase = frase.toUpperCase();
		
		System.out.println("Introduce un numero");
		num = teclado.nextInt();

		for(int cont = 0; cont<frase.length(); cont++)
			codificada += (char)(frase.charAt(cont) + num);
		System.out.println("la frase codificada es "+codificada);
		
		System.out.println("La frase decodificada es ");
		for(int cont = 0; cont<frase.length(); cont++)
			System.out.print(frase.charAt(cont));
		
	
			
		}

		
	
		
		
	}

