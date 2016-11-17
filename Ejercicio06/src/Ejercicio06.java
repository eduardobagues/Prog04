import java.util.Scanner;
public class Ejercicio06 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String frase;
		int valor,voc=0, cons=0, num=0;
		
		System.out.println("Mete una frase");
		frase = teclado.nextLine();
		
		if(frase.length() <= 80){
			
			
			for(int cont = 0; cont<frase.length();cont++){
			
				valor = frase.codePointAt(cont);
				
				switch(valor){
				
				case 32: case 44: case 46:
					break;
			
				case 97: case 101: case 105: case 111: case 117:
				case 65: case 69: case 73: case 79: case 85:
					voc++;
					
					break;
					
				default:
					
					if(valor >= 49 && valor <=57){ num++;} else { cons++;}
					
					break;
				
			
				}
			
				
			}
			
			System.out.println("nº "+num);
			System.out.println("nº vocales "+voc);
			System.out.println("nº consonantes "+cons);
		
			
		}else{System.out.println("Error mas 80 carecteres");}
		
		
		
		
		
		
	}

}
