package Programas_POO;

import java.util.Scanner;

import Objetos.Pessoas;

/*
 * Crie uma classe cliente e apresente os atributos e m�todos referentes esta classe, em seguida crie 
 * um objeto cliente, defina as instancias deste objeto e apresente as informa��es deste objeto no 
 * console.
 */

public class Ex_1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		Pessoas cliente1 = new Pessoas();
		int idadeTeste=0;
		int cadastro=0;
		
		System.out.println("cliente 1: ");
		System.out.println("digite o nome: ");
		cliente1.nome=leia.next();
		System.out.println("digite o sexo (M/F/O): ");
		cliente1.sexo=leia.next().charAt(0);
		System.out.println("digite o ano de nascimento: ");
		cliente1.anoNascimento=leia.nextInt();
		
		
		cadastro=cliente1.chaveCadastro();
		
		System.out.println("ol� "+cliente1.nome+"!! vc � do sexo "+cliente1.sexo+" e tem "+cliente1.calcularIdade()+" anos. Seu cadastro � n�"+cadastro);
	}

}
