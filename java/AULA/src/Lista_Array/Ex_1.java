package Lista_Array;

import java.util.Scanner;

public class Ex_1 {

	/*
	 * Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma atividade e o 
	 * escreva em seguida. Encontre após a maior pontuação e a apresente.
	 */
	
	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int notas[]= new int[5];
		int maiorNumero=0;
		
		
		
		System.out.println("cadastro de notas");
		
		for(int x=0;x<notas.length;x++) {
			System.out.println("informe a nota do alune "+(x+1)+": ");
			notas [x]= leia.nextInt();
		}	
		
		for(int x=0;x<notas.length;x++) {
			System.out.println("nota alune "+(x+1)+": "+notas[x]);
		}
		
		for(int x=0;x<notas.length;x++) {
			if(notas[x]>maiorNumero) {
				maiorNumero = notas[x];
			}
		}
		System.out.println("a maior nota digitada foi: "+maiorNumero);
	}	

}
