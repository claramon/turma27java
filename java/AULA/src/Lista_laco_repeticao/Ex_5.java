package Lista_laco_repeticao;

import java.util.Scanner;

public class Ex_5 {

	public static void main(String[] args) {
		/*
		 * Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero. 
		 * No final, mostre a soma dos n�meros digitados.(DO...WHILE)
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
