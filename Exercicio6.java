/*6)	O custo de um carro novo ao consumidor È a soma do custo de f·brica com a porcentagem do 
 * distribuidor e dos impostos (aplicados ao custo de f·brica). Supondo que o percentual do 
 * distribuidor seja de 28% e os impostos de 45%, escrever um algoritmo para ler o custo de f·brica 
 * de um carro, calcular e escrever o custo final ao consumidor.
 * */

package exerc_resp_alg_mar2007;
	
	import java.util.Scanner;
	
	public class Exercicio6		{
		
	static float custoConsumidor, custoFabrica, porcDistribuidor, impostos, resu;
	static int decisao;
	static char S1=1;
	public static void main(String[] args) {
		
	try ( Scanner scn = new Scanner (System.in)) { 
	
	do 	{
			
		System.out.print("\n - Informe o custo de fabrica: ");
		custoFabrica = scn.nextFloat();
		
		impostos = (float) (custoFabrica * 0.45);
		porcDistribuidor = (float) (0.28 * custoFabrica);
		resu = custoFabrica + (impostos + porcDistribuidor);
		
		System.out.print("\n - Somando todos os encargos, o carro passara\n a");
		System.out.printf(" custar %.2f R$ ao consumidor final.\n\n", resu);  
		
		System.out.print("\n\n - Se deseja continuar digite (1) para sim e\n (2) para n√£o: ");
		decisao = scn.nextInt();	
			
		System.out.println("\n==================================================================");	}

	while (decisao == 1 ); 
		
	if (decisao == 2)  for  (int i=1; i < 50; i++)  System.out.println();
	
		System.out.println("\n - Obrigado por usar meu codigo!\n\n	  - By VIEIR42k\n\n");
		//for  (int i=1; i < 30; i++)  System.out.println();
	}	}	}		
