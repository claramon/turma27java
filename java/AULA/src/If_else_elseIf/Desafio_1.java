package If_else_elseIf;

import java.util.Scanner;

public class Desafio_1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int numero;
		
		System.out.println("digite um valor: ");
		numero = leia.nextInt();
		
		//numero que seja positivo, falar se é par ou ímpar, e que zero é neutro
		
		if(numero==0) {//tem que fazer o zero neutro primeiro, pq senão vai considerar zero como par
			System.out.println("seu numero é neutro");
		}else if(numero>0) {
			if(numero%2==1) {
				System.out.println("seu numero é impar");
			}else {
				System.out.println("seu numero é par");
			}
			
		}else {
			System.out.println("seu numero é negativo, não pode");
		}
			
			
			
	}
		
}


