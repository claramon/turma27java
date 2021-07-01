package Lista_1;

import java.util.Scanner;

public class Ex_2 {
	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int idade, m, a, d;
		
		System.out.println("quantos dias? ");
		idade = leia.nextInt();
		
		
		a = (idade/365);
		m = (idade%365)/30;
		d = (idade%365)%30;
		System.out.println("sua idades em dias: "+d+", meses: "+m+", e anos: "+a);
		
	}
}
