import java.util.Scanner;
public class Ejercicio07 {

	public static void main(String[] args) {
Scanner teclado = new Scanner(System.in);
		
		String frase;
		int var, num=0, min=0, may=0;
	
		System.out.println("Mete una frase");
		frase = teclado.nextLine();
		
		for(int cont = 0; cont<frase.length();cont++){
			
			
			var = frase.codePointAt(cont);
			
			if(var>=48 && var<=57){num++;}
			if(var>=97 && var<=122){min++;}
			if(var>=65 && var<=90){may++;}
			
			
			
		}
		
		
		System.out.println("Hay "+num+" numeros, "+min+" minusculas y "+may+" mayusculas");
		
		
	}

}
