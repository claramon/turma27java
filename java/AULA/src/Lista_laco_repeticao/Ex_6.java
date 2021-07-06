package Lista_laco_repeticao;

import java.util.Scanner;

public class Ex_6 {

	public static void main(String[] args) {
		/*
		 * Escrever um programa que receba vários números inteiros no teclado. E no final imprimir a 
		 * média dos números múltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)
		 */
		Scanner leia = new Scanner(System.in);

		int numero=0;
		int soma=0;
		int contador=-1;
		int media=0;
		
		do {
			
			System.out.println("digite um numero: ");
			numero = leia.nextInt();
			
			if(numero%3==0) {
				soma += numero;
				contador++;
			}
			
		} while(numero!=0);
		
		media = soma / contador;
		System.out.printf("a media dos numeros digitados multiplos de 3 é: %d",media);
		
	}

}
