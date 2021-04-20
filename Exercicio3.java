/*3)	Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva
 *  a idade dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias.
 *  
 * */

package exerc_resp_alg_mar2007;

	import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		int anos, meses, dias; float resu;
		
		try (Scanner scn = new Scanner(System.in)) {
			
			System.out.print("\n - Informe sua idade em anos : ");
			anos = scn.nextInt();
			System.out.print("\n - Informe sua idade em meses : ");
			meses = scn.nextInt();
			System.out.print("\n - Informe sua idade em dias : ");
			dias = scn.nextInt();
		
			resu = (anos * 365) + (meses * 30) + dias;
		
			System.out.format("\n - A idade informada contÃ©m %.0f Dias.",resu);
}
	}
		}