/*4)	Escreva um algoritmo para ler o número total de eleitores de um município, o número de
 *  votos brancos, nulos e válidos. Calcular e escrever o percentual que cada um representa em
 *   relação ao total de eleitores.
 *   
 *   */

package exerc_resp_alg_mar2007;

import java.util.Scanner;

public class Exercicio4 {
	
	static String nome; 
	static int nulo, branco, valido, total;
	static float porcNulo, porcBranco, porcValido;
	static boolean G;
	
	public static void main(String[] args) {
				
			try (Scanner scn = new Scanner(System.in)) {
				
			do {
	
			System.out.print("\n - Informe o nome do município : "); nome = scn.next();
			System.out.print("\n - Informe a quantidade total de eleitores : "); total = scn.nextInt();
			System.out.print("\n - Informe a quantidade de votos brancos : "); branco = scn.nextInt();
			System.out.print("\n - Informe a quantidade de votos nulos : "); nulo = scn.nextInt();
			System.out.print("\n - Informe a quantidade de votos válidos : "); valido = scn.nextInt();
					
			if ( (branco + nulo + valido) == total ) { G = true;
							
			} else {for (int i = 0; i < 50; ++i) System.out.println ();System.out.println("\n - Os números informados são invalidos! \n");} 
			
			} while (G == false);	}
	
		porcNulo   = (nulo * 100) / total;
		porcValido = (valido * 100) / total;
		porcBranco = (branco * 100) / total;
		
		System.out.print("\n - O municipio de " + nome +" teve um total de " + total + " eleitores");
		System.out.print(" sendo " + porcValido + "% dos votos válidos");
		System.out.print(", " + porcNulo + "% dos votos nulos");
		System.out.print(", " + porcBranco + "% dos votos brancos.");
		}
			}