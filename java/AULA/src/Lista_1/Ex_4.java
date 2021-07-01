package Lista_1;

import java.util.Scanner;

public class Ex_4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int a,b,c,d,r,s;
		
		System.out.println("digite um valor para a: ");
		a = leia.nextInt();
		System.out.println("digite um valor para b: ");
		b = leia.nextInt();
		System.out.println("digite um valor para c: ");
		c = leia.nextInt();
		
		r = (a*b)*(a*b);
		s = (b*c)*(b*c);
		d = (r+s)/2;
		
		System.out.println("o resultado é "+d);
		
		
		
	}

}
