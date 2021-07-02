package Lista_2;

import java.util.Scanner;

public class Ex_7 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		double b,al,a;
		
		System.out.println("qual o valor da base? ");
		b = leia.nextDouble();
		System.out.println("qual o valor da altura? ");
		al = leia.nextDouble();
		
		if(al>0 && b>0) {
			a = (b*al)/2;
			System.out.println("a area do triangulo é: "+a);
		}else {
			System.out.println("não é possivel calcular a área do triangulo com numero negativo");
		}
	}

}
