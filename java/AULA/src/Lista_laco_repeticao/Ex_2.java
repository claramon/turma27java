package Lista_laco_repeticao;

import java.util.Scanner;

public class Ex_2 {

	/*
	 * Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
	 */
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero=0;
		int contadorPar=0;
		int contadorImpar=0;
		
		
		for(int x=0;x<10;x++) {
			System.out.println("digite um numero: ");
			numero = leia.nextInt();
			
			if(numero%2==0) {
				contadorPar++;
			} else {
				contadorImpar++;
				
			}
			
		}
		System.out.printf("quantidade numeros pares: %d \n",contadorPar);
		System.out.printf("quantidade de numeros impares: %d \n",contadorImpar);
	}

}
