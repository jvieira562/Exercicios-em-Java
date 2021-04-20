/*8)	Escreva um algoritmo para ler uma temperatura em graus Fahrenheit, calcular 
* e escrever o valor correspondente em graus Celsius (baseado na fórmula abaixo):
*
*										C										 		
*									   --- =  F - 32										 	
*										5		9
*/

	package exerc_resp_alg_mar2007;
	
	import java.util.Scanner;

	public class Exercicio8 {
		
	static float fh, celsius, decisao; 

	public static void main(String[] args) {
		
	try (Scanner scn = new Scanner(System.in))	{
		
	do	{
		
		System.out.print("\n - Informe a temperatura em graus Fahrenheit: ");
			fh = scn.nextFloat();
	
			celsius = (fh-32) * 5 / 9;
		
		System.out.printf("\n	A temperatura informada foi %.2f °F que \nequivale a %.2f °C ", fh, celsius);
		System.out.println("\n\n=======================================================================================");
		System.out.println("\n\n - Se deseja continuar digite (1) para sim e (2) para não. ");
			decisao = scn.nextFloat(); 
		System.out.println("\n=======================================================================================");
		} 
	
	while (decisao ==1); 
	
	if (decisao ==2)		{ 
		
	for  (int i = 0; i<=50;i++) { System.out.println("");}
		
		System.out.println("\n - Obrigado por usar meu codigo!\n\n          - VIEIR42k\n");
	
		}	}	}	}
