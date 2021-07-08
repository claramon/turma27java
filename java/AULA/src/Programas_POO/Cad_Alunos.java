package Programas_POO;

import java.util.Scanner;

import Objetos.Pessoas;
import Objetos.Front_Loco;

public class Cad_Alunos {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		Pessoas alune1 = new Pessoas();
		Front_Loco desenho = new Front_Loco();
		
		System.out.println("digite seu nome: ");
		alune1.nome=leia.next();
		System.out.println("digite o ano de nascimento: ");
		alune1.anoNascimento=leia.nextInt();
		
		if((alune1.calcularIdade(2021))<=16) {
			System.out.println("oi, aluno/a/e, vc tem "+alune1.calcularIdade(2021)+" anos de idade e é do ensino fundamental");
		}else if((alune1.calcularIdade(2021)>16) && (alune1.calcularIdade(2021)<=21)) {
			System.out.println("oi, aluno/a/e, vc tem "+alune1.calcularIdade(2021)+" anos de idade e é do ensino médio");
		}else if((alune1.calcularIdade(2021))>21) {
			System.out.println("oi, aluno/a/e, vc tem "+alune1.calcularIdade(2021)+" anos de idade e é do ensino superior");
		}
		desenho.linha(50);
	}

}
