/*4) Escreva um algoritmo para ler um valor (do teclado) e escrever (na tela) o seu antecessor.
 * 
 * */

package exerc_resp_alg_mar2007;

import java.util.Scanner;

public class Exercicio1 {
	
	static int valor;

	public static void main(String[] args) {
	
		try (Scanner scn = new Scanner(System.in)){
		
		System.out.print("\n - Informe o valor: ");
		valor = scn.nextInt();
		
				System.out.printf("\n - O valor informado foi " + valor +" e seu antecessor é ");
				System.out.print(valor -1+"."); 
	} 	

		}	
			}


