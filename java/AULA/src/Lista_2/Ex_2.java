package Lista_2;

import java.util.Scanner;

public class Ex_2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		double n1,n2,n3,n4,q1,q2,q3,q4;
		
		System.out.println("escreva seu primeiro numero: ");
		n1 = leia.nextDouble();
		System.out.println("escreva seu segundo numero: ");
		n2 = leia.nextDouble();
		System.out.println("escreva seu terceiro numero: ");
		n3 = leia.nextDouble();
		System.out.println("escreva seu quarto numero: ");
		n4 = leia.nextDouble();
		
		q1 = Math.pow(n1,2);
		q2 = Math.pow(n2,2);
		q3 = Math.pow(n3,2);
		q4 = Math.pow(n4,2);
		
		if(q3 >= 1000) {
			System.out.println("seu numero �: "+q3);
		}else {
			System.out.println("o quadrado do seu primeiro numero �: "+q1);
			System.out.println("o quadrado do seu segundo numero �: "+q2);
			System.out.println("o quadrado do seu terceiro numero �: "+q3);
			System.out.println("o quadrado do seu quarto numero �: "+q4);
		}
			
		}	
		
	}


