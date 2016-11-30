import java.util.Scanner;
public class Ejercicio08 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
	
		
		String frase, cod="", dec="";
		int num;
		
		System.out.println("Frase");
		frase = teclado.nextLine();
		frase = frase.toUpperCase();
		
		System.out.println("Numero desplazamiento");
		num = teclado.nextInt();
		
		System.out.println("\nOriginal: "+frase);
		
		
		for(int cont = 0; cont<frase.length(); cont++ ){
			
			
			if((frase.charAt(cont)+num) > 90){
				
				cod +=  (char)((frase.charAt(cont)+num)-26);
				
			}
			
			else{ cod += (char)(frase.charAt(cont)+num);}
			
			
		}
		
		System.out.println("\nCodificada: "+cod);
		
		for(int cont1 = 0; cont1<cod.length(); cont1++ ){
			
			
			if((cod.charAt(cont1)-num) < 65){
				
				dec += (char)((cod.charAt(cont1)-num)+26);
				
			}
			
			else{dec += (char)(cod.charAt(cont1)-num);}
			
			
		}
		
		System.out.println("\nDecodif: "+dec);
		
			
		}
	
	}

