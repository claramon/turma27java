package Lista_Array;

import java.util.Scanner;

/*
 * Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa que gere um vetor 
 * com os lançamentos, escreva esse vetor. A seguir determine e imprima a média aritmética dos 
 * lançamentos, contabilize e apresente também quantas foram as ocorrências da maior pontuação.
 */

public class Ex_2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);

		int dado []= new int[10];
		int soma=0;
		double media=0.00;
		int x=0;
		int maiorPontuacao=0;
		int maiorOcorrencia=0;
		
		
			for(x=0;x<10;x++) {
				System.out.println("qual o valor da rodada: ");
				dado [x]= leia.nextInt();
				soma += dado[x];
				media = (soma / 10);
				
				if(dado[x]>maiorPontuacao) {
					maiorPontuacao = dado[x];
			}
		}

			for(x=0;x<10;x++) {
					if(maiorPontuacao==dado[x]) {
						maiorOcorrencia++;
				}
			}
			
		System.out.println("soma: "+soma);
		System.out.println("media: "+media);
		System.out.println("maior ocorrência: "+maiorOcorrencia);
	}
	
}
