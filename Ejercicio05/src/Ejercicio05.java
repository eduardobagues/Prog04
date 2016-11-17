import java.util.Scanner;
public class Ejercicio05 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String frase,frase_imp="", frase_pares="";
		int cont=0;
		boolean par=true;
		
		System.out.println("Mete una frase");
		frase = teclado.nextLine();
		
		if(frase.length() <= 80){
		
		
		while(cont < frase.length()){
			
			
			if(par){
				
				frase_pares = frase_pares + frase.charAt(cont);
				par = false;
			}
			else{frase_imp = frase_imp + frase.charAt(cont);
			par = true;}
			
			cont++;
		}
		
		
		System.out.println("Par "+frase_pares);
		System.out.println("Impar "+frase_imp);
		
		
	}
	else 	{System.out.println("Menos 80 caracteres");}

	}

}
