import java.util.Scanner;
public class Ejercicio03 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String frase, palabra;
		
		System.out.println("Mete una frase");
		frase = teclado.nextLine();
		
		System.out.println("Mete una palabra");
		palabra = teclado.nextLine();
		
		
		if(frase.indexOf(palabra) >= 0){
			
			System.out.println("La palabra "+palabra+", empieza en la posicion "+frase.indexOf(palabra));
		}
		
		else {System.out.println("0 no se encuentra la palabra");}
		

	}

}
