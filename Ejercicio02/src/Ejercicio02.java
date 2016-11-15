import java.util.Scanner;
public class Ejercicio02 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
				
		String cad;
		int num,min=0,may=0;
		
		System.out.println("Pon una frase");
		
		cad = teclado.nextLine();
		
		for(int cont=0; cont<cad.length(); cont++){
		
		
		num = cad.codePointAt(cont);
		
	
		if(num>=97 && num<=122){min++;}
		if(num>=65 && num<=90){may++;}
		
		
		}
		
		System.out.println("Hay "+min+" minusculas y "+may+" mayusculas");
		
		
		
	}

}
