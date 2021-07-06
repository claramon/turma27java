package Lista_laco_decisao;

import java.util.Scanner;

public class Ex_1 {
	
	//Faça um programa que receba três inteiros e diga qual deles é o maior.

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int x=0;
		int y=0;
		int z=0;
		int maiorNumero=0;
		
		System.out.println("digite seu primeiro numero inteiro: ");
		x = leia.nextInt();
		System.out.println("digite seu segundo numero inteiro: ");
		y = leia.nextInt();
		System.out.println("digite seu terceiro numero inteiro: ");
		z = leia.nextInt();
		
		if(x>y) {
			maiorNumero=x;
		}else if(y>z) {
			maiorNumero=y;
		}else {
			maiorNumero=z;
		}
		
		System.out.printf("o maior numero digitado foi: %d",maiorNumero);
	}
}
