package Lista_laco_decisao;

import java.util.Scanner;

public class Ex_2 {

	// Faça um programa que entre com três números e coloque em ordem crescente.

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int v1=0;
		int v2=0;
		int v3=0;
		int organiza=0;
		
		System.out.println("digite seu primeiro numero inteiro: ");
		v1 = leia.nextInt();
		System.out.println("digite seu segundo numero inteiro: ");
		v2 = leia.nextInt();
		System.out.println("digite seu terceiro numero inteiro: ");
		v3 = leia.nextInt();
		
		if(v1>v2) {
			organiza=v1;
			v1=v2;
			v2=organiza;
		}
		if(v3<v2) {
			if(v3<v1) {
			organiza=v1;
			v1=v3;
			v3=v2;
			v2=organiza;				
			}	else {
			organiza=v2;
			v2=v3;
			v3=organiza;					
			}
		}
		System.out.printf("%d, %d, %d",v1,v2,v3);
		
		
		
		
	}

}
