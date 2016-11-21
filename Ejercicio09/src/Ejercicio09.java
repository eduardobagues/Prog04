import java.util.Scanner;
public class Ejercicio09 {

	public static void main(String[] args) {


		Scanner teclado = new Scanner(System.in);

		int codigo, cero, cont_ceros=0, cod_ok=0, hombre1=0, mujer1=0, hombre2=0, mujer2=0,fecha=0;
		String frase,año, sexo, curso ;

		//año(1-4)  H/M (5) 1/2 (6)  XY (7-8)




		do{

			cont_ceros = 0;

			do{// fecha valida 190-1995
				do{ // codigo de 8 caracteres

					System.out.println("Mete un codigo de 8 caracteres");
					frase = teclado.nextLine();

				}while(frase.length()>8);


				for(int j = 0; j<frase.length();j++){
					fecha = fecha + frase.codePointAt(j);
				}

			}while(fecha < 49575748 && fecha > 49575753);


			// contamos 0000000
			for(int i=0; i<frase.length();i++){

				cero = frase.codePointAt(i);
				if(cero == 48){cont_ceros++;}

			}

			// si no es 00000 entra
			if(cont_ceros != 8){


				sexo = frase.substring(4,5);
				curso = frase.substring(5,6);
				
				
				
				if( curso.codePointAt(0) == 49){
					
					
					if(sexo.codePointAt(0) == 72){hombre1++; cod_ok++;}
					if(sexo.codePointAt(0) == 77){mujer1++; cod_ok++;}

				}

				if(curso.codePointAt(0) == 50){

					if(sexo.codePointAt(0) == 72){hombre2++; cod_ok++;}
					if(sexo.codePointAt(0) == 77){mujer2++; cod_ok++;}

				}
				

			}
			
			

		}while(cont_ceros != 8);

		
		System.out.println("En 1º hay "+hombre1+" hombres y "+mujer1+" mujeres");
		System.out.println("En 2º hay "+hombre2+" hombres y "+mujer2+" mujeres");
		System.out.println((cod_ok-1)+" codigos correctos");
		System.out.println("fin");
	}

}
