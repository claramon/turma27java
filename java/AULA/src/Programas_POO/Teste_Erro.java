package Programas_POO;

import java.util.Scanner;

public class Teste_Erro {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int valor=0;
		String nome []=new String [3];
		
		try {
			System.out.println("digite a posição do vetor de 0 a 2 para cadastro do nome: ");
			valor=leia.nextInt();
			System.out.println("digite o nome da pessoa: ");
			nome[valor]=leia.next();
		}catch(java.lang.ArrayIndexOutOfBoundsException erro){
			System.out.println("vc digitou um tamanho errado ou posição incorreta da matriz");
		}catch (java.util.InputMismatchException erro) {
			System.out.println("digite um numero, por favor...");
		}
		
		
		
		System.out.println("posição escolhida "+valor+" nome registrado: "+nome[valor]);
		
		
	}

}
