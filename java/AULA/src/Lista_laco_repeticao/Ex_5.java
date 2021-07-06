package Lista_laco_repeticao;

import java.util.Scanner;

public class Ex_5 {

	public static void main(String[] args) {
		/*
		 * Crie um programa que leia um número do teclado até que encontre um número igual a zero. 
		 * No final, mostre a soma dos números digitados.(DO...WHILE)
		 */
		Scanner leia = new Scanner(System.in);
		
		int numero;
		int soma=0;
		
		
		do {
			System.out.println("digite um numero: ");
			numero = leia.nextInt();
			soma += numero;
						
		} while(numero!=0);
		
		System.out.printf("soma dos numeros digitados: %d",soma);
	}

}
