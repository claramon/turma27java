package Programas_POO;

import java.util.Scanner;

import Objetos.Pessoas;

public class Cad_BancaJornal {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		Pessoas cliente1 = new Pessoas();
		int idadeTeste=0;
		
		System.out.println("digite seu nome: ");
		cliente1.nome = leia.next();
		System.out.println("digite o ano de nascimento: ");
		cliente1.anoNascimento = leia.nextInt();
		
		if((cliente1.calcularIdade(2021))>=18) {
			System.out.println("vc pode comprar tudo!");
		}else {
			System.out.println("proibido, conteúdo para maiores de 18 anos");
		}
		
	}
}
