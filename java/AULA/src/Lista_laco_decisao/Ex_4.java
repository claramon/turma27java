package Lista_laco_decisao;

import java.util.Scanner;

public class Ex_4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int numero;
		
		/*Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este n�mero � 
		 * par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for �mpar exiba o 
		 * n�mero elevado ao quadrado. */
		
		System.out.println("digite um numero: ");
		numero = leia.nextInt();
		
		if(numero>0) {
			if(numero%2==0) {
				System.out.println("seu numero � par");
				System.out.println("a ra�z quadrada desse numero �: "+(Math.sqrt(numero)));
			}else {
				System.out.println("seu numero � impar");
				System.out.println("seu numero elevado ao quadrado �: "+(Math.sqrt(numero)));
			}		
		}else {
			System.out.println("n�o � poss�vel utilizar esse numero");
		}
		
	}

}
