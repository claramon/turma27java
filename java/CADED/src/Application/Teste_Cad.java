package Application;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

import Entities.Funcionario;
import Entities.Terceiro;

public class Teste_Cad {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		List <Funcionario> list = new ArrayList<>();//interface lista do tipo funcionario (por enquanto, vazia)
		int numero;
		
		System.out.println("CADASTRO FUNCIONARIO");
		System.out.println("digite a quantidade de funcionários a serem cadastrados: ");
		numero = leia.nextInt();
		
		for(int x=1;x<=numero;x++) {//conta o numero de funcionarios
			System.out.println("Funcionario: "+x);
			
			System.out.println("Funcionario terceiro? ");
			char op = leia.next().toUpperCase().charAt(0);
			
			System.out.println("digite a matricula do funcionario (S/N): ");
			String matricula = leia.next();
			
			System.out.println("digite as horas trabalhadas: ");
			int horasTrabalhadas=leia.nextInt();
			
			System.out.println("digite o valor por hora trabalhada: ");
			double valorHora=leia.nextDouble();
			
			if(op=='S') {
				System.out.println("digite o valor do adicional: R$ ");
				double adicional = leia.nextDouble();
				list.add(new Terceiro(matricula, horasTrabalhadas, valorHora, adicional));//terceiro - tem adicional 
				//o programa entende pelo override que tem um filho de funcionario, sem precisar fazer if ou programar
				//no polimorfismo, ele abre espaço para as especificidades do filho
				
			}else if (op=='N'){
				list.add(new Funcionario(matricula,horasTrabalhadas,valorHora));//funcionario normal
			}//so cria objeto se digitar 's' ou 'n'... se for outra letra, nao gera objeto
			
		}
		System.out.println();
		System.out.println("FOLHA DE PAGAMENTO");
		for(Funcionario empregados: list) {//for each - tipo, apelido : , nome do vetor
			
			System.out.println("matricula colaborador: "+empregados.getMatricula()+" salario em reais: "+empregados.salario());
			
		}
		
	}

}
