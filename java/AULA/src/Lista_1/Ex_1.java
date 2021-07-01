package Lista_1;

import java.util.Scanner;

public class Ex_1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int d, m, a, dt;
		
		System.out.println("quantos dias? ");
		d = leia.nextInt();
		System.out.println("quantos meses? ");
		m = leia.nextInt();
		System.out.println("quantos anos? ");
		a = leia.nextInt();
		
		dt = (a*365)+(m*12)+a;
		System.out.println("total em dias: "+dt);
		

	}

}
