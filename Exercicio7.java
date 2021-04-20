/* 7)	Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês,
 * mais uma comissão também fixa para cada carro vendido e mais 5% do valor das vendas por ele
 * efetuadas. Escrever um algoritmo que leia o número de carros por ele vendidos, o valor total de
 * suas vendas, o salário fixo e o valor que ele recebe por carro vendido.Calcule e escreva o salário
 * final do vendedor.
 * */

	package exerc_resp_alg_mar2007;
		
	import java.util.Scanner;
		
	public class Exercicio7 {
		
	static float salarioFixo, totalVendas, porcVendas, comissaoFixa, comissao, resu, resu2, salarioFinal;
	static String nome;
	static int carroVend;
	
	public static void main(String[] args) {
		
	try (Scanner scn = new Scanner (System.in))					{ 
		
		System.out.print("\n - Informe o nome do funcionario: ");
			nome = scn.nextLine();		
	
	do {
		
		System.out.print("\n - Informe o sálario fixo: ");
			salarioFixo = scn.nextFloat();
		
		System.out.print("\n - Informe a quantidade de carros vendidos: ");
			carroVend = scn.nextInt();
		
		System.out.print("\n - Informe a total de vendas: ");
			totalVendas = scn.nextFloat();
		
		System.out.print("\n - Informe a o valor da comissão fixa: ");
			comissaoFixa = scn.nextFloat();
		
			porcVendas = (float) (totalVendas * 0.05);
			comissao = carroVend * comissaoFixa;
		
			salarioFinal = salarioFixo + porcVendas + comissao;
		
		System.out.println("\n============================================================================================================================================");		
		System.out.print("\n - Métricas do funcionário: \n\n ==> "+nome+"\n");
		System.out.print("\n - Número de carros vendidos    	 : "+carroVend+"\n - Valor total de suas vendas	   	 : ");
		System.out.print(totalVendas+"R$\n");
		System.out.print(" - Salário fixo 			 : "+salarioFixo+"R$\n - Valor da comissão a cada carro vendido: "+comissaoFixa+"R$\n");
		System.out.print(" - Salário final do vendedor 		 : " + salarioFinal + "R$\n\n");
		System.out.println("============================================================================================================================================");		
		System.out.println("\n - Se deseja continuar digite (1) para sim e (2) para não. ");
			resu = scn.nextFloat(); 
		System.out.println("\n============================================================================================================================================");			
	
	if (resu == 2) {
		
	for (int i = 0; i<=50; i++) System.out.println(" ");

		System.out.println("\n - Obrigado por usar meu codigo!\n\n         - By VIEIR42k ");
	
	for (int i = 0; i<=3; i++) System.out.println(" ");
	
	}

	else 
		
		System.out.print("\n - Informe o nome do funcionario: ");
			nome = scn.next(); 		
	
	} 
	
	while (resu == 1);
	
			}	}	}	
