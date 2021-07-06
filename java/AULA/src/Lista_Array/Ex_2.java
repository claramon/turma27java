package Lista_Array;

import java.util.Scanner;

/*
 * Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa que gere um vetor 
 * com os lan�amentos, escreva esse vetor. A seguir determine e imprima a m�dia aritm�tica dos 
 * lan�amentos, contabilize e apresente tamb�m quantas foram as ocorr�ncias da maior pontua��o.
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
		System.out.println("maior ocorr�ncia: "+maiorOcorrencia);
	}
	
}
