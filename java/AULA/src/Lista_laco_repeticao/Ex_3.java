package Lista_laco_repeticao;

import java.util.Scanner;

public class Ex_3 {

	//Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. 
	//Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int idade=0;
		int Acontador=0;
		int Bcontador=0;
		
		System.out.println("informe a idade: ");
		idade = leia.nextInt();
		
		
		
		while(idade!=(-99)) {
					
				
			if(idade>0 && idade<21) {
				Acontador++;	
			}
			else if(idade>50) {
				Bcontador++;
			} 
			else {
				System.out.println("grupo nao previsto");
				}	
		
			idade = leia.nextInt();
		}
		
		System.out.printf("\n %d ",Acontador,"\n");
		System.out.printf("\n %d ",Bcontador,"\n");
	}
	
}
