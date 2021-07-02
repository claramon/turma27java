package Lista_laco_decisao;

import java.util.Scanner;

public class Ex_4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int numero;
		
		/*Faça um programa em que permita a entrada de um número qualquer e exiba se este número é 
		 * par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for ímpar exiba o 
		 * número elevado ao quadrado. */
		
		System.out.println("digite um numero: ");
		numero = leia.nextInt();
		
		if(numero>0) {
			if(numero%2==0) {
				System.out.println("seu numero é par");
				System.out.println("a raíz quadrada desse numero é: "+(Math.sqrt(numero)));
			}else {
				System.out.println("seu numero é impar");
				System.out.println("seu numero elevado ao quadrado é: "+(Math.sqrt(numero)));
			}		
		}else {
			System.out.println("não é possível utilizar esse numero");
		}
		
	}

}
