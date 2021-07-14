package aplicacao;

import java.util.Scanner;

import entidades.Conta;
import entidades.ContaCorrente;
import entidades.ContaEmpresa;
import entidades.ContaEstudante;
import entidades.ContaPoupanca;

public class ProjetoG3Bank {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Conta menu = new Conta();
		
		//Arrumar um meio de fazer o voltar menu funcionar rsrs
		//conta especial

		int opcao;
		char continuar;
		char voltaMenu;
		int numero;

		numero = (int) (Math.random() * 10001);

		menu.menu();

		System.out.println("\nEscolha a opção desejada:");
		opcao = leia.nextInt();

		if(opcao<=0 || opcao>6) {
			System.out.println("Opção inválida.");
			System.out.println("Deseja voltar ao Menu? S-Sim ou N-Não");
			voltaMenu = leia.next().toUpperCase().charAt(0);
			if (voltaMenu == 'S') {
				System.out.println(new String(new char[50]).replace("\0", "\r\n"));
				menu.menu();
			} else if (voltaMenu == 'N') {
				System.out.println(new String(new char[50]).replace("\0", "\r\n"));
				menu.sair();
			}
			
		}
		//CONTA POUPANÇA
		else if (opcao == 1) {
			ContaPoupanca poupanca = new ContaPoupanca(numero, 0.00, 14);
			poupanca.inicial();
			poupanca.inicioPoupanca();

			for (int x = 0; x <= 10; x++) {
				System.out.println("Movimento " + (x + 1));
				System.out.println("Qual operação você deseja efetuar? C-Crédito ou D-Débito");
				char op = leia.next().toUpperCase().charAt(0);
				System.out.println("Qual valor da operação?");
				double valorOperacao = leia.nextDouble();

				poupanca.opcoes(op, valorOperacao);

				System.out.println("Saldo Atual: " + poupanca.getSaldo());

				System.out.println("Deseja continuar? S-Sim ou N-Não");
				continuar = leia.next().toUpperCase().charAt(0);
				if (continuar == 'N') {
					break;
				}
			}

			System.out.println("Qual é o dia de hoje?");
			int dia = leia.nextInt();
			poupanca.calculoAniversario(dia);
			System.out.println("Saldo Atual: " + poupanca.getSaldo());

			System.out.println("Deseja voltar ao Menu? S-Sim ou N-Não");
			voltaMenu = leia.next().toUpperCase().charAt(0);
			if (voltaMenu == 'S') {
				System.out.println(new String(new char[50]).replace("\0", "\r\n"));
				menu.menu();
			} else if (voltaMenu == 'N') {
				System.out.println(new String(new char[50]).replace("\0", "\r\n"));
				poupanca.sair();
			}

		}
		//CONTA CORRENTE
		else if (opcao == 2) {
			ContaCorrente corrente = new ContaCorrente(numero, 0.00, 3);
			corrente.inicial();
			corrente.inicioCorrente();

			for (int x = 0; x <= 10; x++) {
				System.out.println("Movimento " + (x + 1));
				System.out.println("Qual operação você deseja efetuar? C-Crédito ou D-Débito");
				char op = leia.next().toUpperCase().charAt(0);
				System.out.println("Qual valor da operação?");
				double valorOperacao = leia.nextDouble();

				corrente.opcoes(op, valorOperacao);

				System.out.println("Saldo Atual: " + corrente.getSaldo());

				System.out.println("Deseja continuar? S-Sim ou N-Não");
				continuar = leia.next().toUpperCase().charAt(0);
				if (continuar == 'N') {
					break;
				}
			}

			System.out.println("Deseja um talão de cheque? S-Sim ou N-Não ");
			char cheque = leia.next().toUpperCase().charAt(0);

			System.out.println("Deseja voltar ao Menu? S-Sim ou N-Não");
			voltaMenu = leia.next().toUpperCase().charAt(0);
			if (voltaMenu == 'S') {
				System.out.println(new String(new char[50]).replace("\0", "\r\n"));
				menu.menu();
			} else if (voltaMenu == 'N') {
				System.out.println(new String(new char[50]).replace("\0", "\r\n"));
				corrente.sair();
			}

		}

		// else if(opcao == 3){
		//// CONTA ESPECIAL
		// }
		
		//CONTA EMPRESA
		else if (opcao == 4) {
			ContaEmpresa empresa = new ContaEmpresa(numero, 0.00, 10000.00);
			empresa.inicial();
			empresa.inicioEmpresa();

			for (int x = 0; x <= 10; x++) {
				System.out.println("Movimento " + (x + 1));
				if (empresa.getEmprestimo() > 0) {
					System.out.printf("Gostaria de um emprestimo? S-Sim ou N-Não");
					char emp = leia.next().toUpperCase().charAt(0);
					if (emp == 'S') {
						System.out.printf("Seu limite atual de emprestimo é: R$ %.2f. Qual valor deseja solicitar?",
								empresa.getEmprestimo());
						double valorEmprestimo = leia.nextDouble();
						empresa.emprestimo(valorEmprestimo);
						System.out.println("Saldo Atual: " + empresa.getSaldo());
					}
				}
					System.out.println("Qual operação você deseja efetuar? C-Crédito ou D-Débito");
					char op = leia.next().toUpperCase().charAt(0);
					System.out.println("Qual valor da operação?");
					double valorOperacao = leia.nextDouble();

					empresa.opcoes(op, valorOperacao);

					System.out.println("Saldo Atual: " + empresa.getSaldo());

					System.out.println("Deseja continuar? S-Sim ou N-Não");
					continuar = leia.next().toUpperCase().charAt(0);
					if (continuar == 'N') {
						break;
					}
				}
				
			System.out.println("Deseja voltar ao Menu? S-Sim ou N-Não");
			voltaMenu = leia.next().toUpperCase().charAt(0);
			if (voltaMenu == 'S') {
				System.out.println(new String(new char[50]).replace("\0", "\r\n"));
				menu.menu();
			} else if (voltaMenu == 'N') {
				System.out.println(new String(new char[50]).replace("\0", "\r\n"));
				empresa.sair();
			}

		}
		//CONTA ESTUDANTE
		else if (opcao == 5) {
			ContaEstudante estudante = new ContaEstudante(numero, 0.00, 5000.00);
			estudante.inicial();
			estudante.inicioEstudante();

			for (int x = 0; x <= 10; x++) {
				System.out.println("Movimento " + (x + 1));
				if (estudante.getEmprestimo() > 0) {
					System.out.printf("Gostaria de um emprestimo? S-Sim ou N-Não");
					char emp = leia.next().toUpperCase().charAt(0);
					if (emp == 'S') {
						System.out.printf("Seu limite atual de emprestimo é: R$ %.2f. Qual valor deseja solicitar?",
								estudante.getEmprestimo());
						double valorEmprestimo = leia.nextDouble();
						estudante.emprestimo(valorEmprestimo);
						System.out.println("Saldo Atual: " + estudante.getSaldo());
					}
				}
					System.out.println("Qual operação você deseja efetuar? C-Crédito ou D-Débito");
					char op = leia.next().toUpperCase().charAt(0);
					System.out.println("Qual valor da operação?");
					double valorOperacao = leia.nextDouble();

					estudante.opcoes(op, valorOperacao);

					System.out.println("Saldo Atual: " + estudante.getSaldo());

					System.out.println("Deseja continuar? S-Sim ou N-Não");
					continuar = leia.next().toUpperCase().charAt(0);
					if (continuar == 'N') {
						break;
					}
				}
				
			System.out.println("Deseja voltar ao Menu? S-Sim ou N-Não");
			voltaMenu = leia.next().toUpperCase().charAt(0);
			if (voltaMenu == 'S') {
				System.out.println(new String(new char[50]).replace("\0", "\r\n"));
				menu.menu();
			} else if (voltaMenu == 'N') {
				System.out.println(new String(new char[50]).replace("\0", "\r\n"));
				estudante.sair();
			}

		}
		
		else if (opcao == 6) {
			menu.sair();
		}

	}
}