package introducao;

import java.util.Scanner; 

public class Teste2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		String nome;
		int anoNascimento;
		
		
		
		
		
		System.out.println("digite o nome: ");
		nome = leia.nextLine();
		
		System.out.println("ano de nascimento: ");
		anoNascimento = leia.nextInt();
		int idade = 2021 - anoNascimento;
		
		System.out.printf("seu nome é %s e sua idade é %d anos",nome,idade);

	}

}
