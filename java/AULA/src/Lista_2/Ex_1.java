package Lista_2;

import java.util.Scanner;

public class Ex_1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		double peso,multa,excesso,pesoPermitido;
		pesoPermitido=50;
		
		System.out.println("Quantos quilos de tomate hoje João? ");
		peso = leia.nextDouble();
		
		if(pesoPermitido < peso) {
			excesso = peso-pesoPermitido;
			multa = excesso*4;
			System.out.println("Houve excesso de "+excesso+" kgs com multa de "+multa+" reais");
		}else {
			System.out.println("Você não paga multa hoje. Multa=0. Excesso=0");
		}

	}

}
