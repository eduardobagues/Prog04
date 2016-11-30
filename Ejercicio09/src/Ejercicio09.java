import java.util.Scanner;
public class Ejercicio09 {

	public static void main(String[] args) {


		Scanner teclado = new Scanner(System.in);

		String frase="", fecha, sexo="", curso="";
		int cod_fecha=0, cod_ok=0, hombre_1=0, hombre_2=0, mujer_1=0, mujer_2=0;
		boolean val_fecha = true, cod_salida = false;


		do{
			do{

				do{

					System.out.println("Mete el código");
					frase = teclado.nextLine();

					if(frase.length()<8){System.out.println("Longitud incorrecta (8 caráct.)\n");}

				}while(frase.length()<8); // Frase de 8 carácteres

				if(frase.equals("00000000")){ cod_salida = true; val_fecha = true;}

				else{

					// Sacamos la fecha de la cadena
					fecha = frase.substring(0,4);

					// Vemos ASCII de la fecha
					for( int contf = 0; contf < fecha.length(); contf++ ){

						cod_fecha += fecha.codePointAt(contf);

					}

					// Filtramos fecha entre rango válido 1990 y 1995
					// La suma de los ascii de 1990 = 211 y 1995 = 216
					// Si está entre 211 y 216 es una fecha válida
					// Variamos el estado del booleano según valida o no valida para
					//  repetir el bucle.


					if( cod_fecha<211 || cod_fecha>216 ){

						System.out.println("Fecha incorrecta (1990-1995)\n");
						val_fecha = false; //fecha inválida
						cod_fecha = 0; //reseteamos la suma para la siguiente comprobación
					}

					else{ val_fecha = true; // fecha OK, no repite el bucle
					cod_fecha = 0;
					// Longitud OK
					// Fecha OK
					// Comprobamos H y M

					// Sacamos el 5º caráct. de la cadena (H/M)

					sexo = frase.substring(4,5);

					if(sexo.equals("H") || sexo.equals("M")){

						// sexo OK
						// Comprobamos curso (1 o 2)

						// Sacamos el 6º caráct. de la cadena (1 o 2)
						curso = frase.substring(5,6);

						if(curso.equals("1") || curso.equals("2")){

							// curso OK
							// Codigo completamente válido
							System.out.println("( OK )\n");
							cod_ok++;
							
							// Contabilizamos H y M en curso 1 o 2
							if(curso.equals("1") && sexo.equals("H")){ hombre_1++;}
							if(curso.equals("1") && sexo.equals("M")){ mujer_1++;}
							if(curso.equals("2") && sexo.equals("H")){ hombre_2++;}
							if(curso.equals("2") && sexo.equals("M")){ mujer_2++;}
							
							
						}
						else {
							System.out.println("Curso incorrecto (1 o 2)\n");
							val_fecha = false; // Ponemos a false para q se repita el bucle
						}

					}			
					else {
						System.out.println("Sexo incorrecto (H o M)\n");
						val_fecha = false; // Ponemos a false para q se repita el bucle
					}

					} 

				}

			}while(val_fecha == false); // Repite si fecha inválida

		}while(cod_salida == false);


		System.out.println("\n== INFORME ==");
		System.out.println(cod_ok+" codigos correctos");
		System.out.println("1º   "+hombre_1+" hombres y "+mujer_1+" mujeres");
		System.out.println("2º   "+hombre_2+" hombres y "+mujer_2+" mujeres");
		

		System.out.println("FIN");
		
		
	}

}
