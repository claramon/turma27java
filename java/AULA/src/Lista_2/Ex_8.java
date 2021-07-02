package Lista_2;

import java.util.Scanner;

public class Ex_8 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int n;
		
		System.out.println("escreva um numero inteiro: ");
		n = leia.nextInt();
		
		if(n>100) {
			System.out.println("seu valor é: "+n);
		}else {
			System.out.println("seu valor é zero");
		}
	}

}
