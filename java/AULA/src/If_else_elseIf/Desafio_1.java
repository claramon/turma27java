package If_else_elseIf;

import java.util.Scanner;

public class Desafio_1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int numero;
		
		System.out.println("digite um valor: ");
		numero = leia.nextInt();
		
		//numero que seja positivo, falar se � par ou �mpar, e que zero � neutro
		
		if(numero==0) {//tem que fazer o zero neutro primeiro, pq sen�o vai considerar zero como par
			System.out.println("seu numero � neutro");
		}else if(numero>0) {
			if(numero%2==1) {
				System.out.println("seu numero � impar");
			}else {
				System.out.println("seu numero � par");
			}
			
		}else {
			System.out.println("seu numero � negativo, n�o pode");
		}
			
			
			
	}
		
}


