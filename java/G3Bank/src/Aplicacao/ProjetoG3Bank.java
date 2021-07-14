package Aplicacao;

import java.util.Scanner;

import Entidades.Banner;
import Entidades.ContaCorrente;
import Entidades.ContaEmpresa;
import Entidades.ContaEspecial;
import Entidades.ContaEstudante;
import Entidades.ContaPoupanca;

public class ProjetoG3Bank {

//PROJETO BANCO - PRODUZIDO NO PRIMEIRO MÓDULO
//POR: 
// CLARA MONTANHEZ, GUSTAVO AUGUSTO, JAQUELINE CANTARINO, JEFFERSON , WESLEY LUAN;
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		String menu[] = { "Conta Poupança", "Conta Corrente", "Conta Especial", "Conta Empresa", "Conta Estudante",
				"Sair" };
		int opcao;
		char continuar;
		char voltaMenu;
		double saldoPoup = 0; // Criamos essa var para testar outro metodo de armazenar saldo.
		int numero = 0;

		numero = (int) (Math.random() * 99999); // sorteia número aleatorio para o numero de conta.
		// instanciando as contas de acordo com as subclasses
		ContaPoupanca poupanca = new ContaPoupanca(numero, saldoPoup, 14);
		ContaCorrente corrente = new ContaCorrente(numero, 0, 3);
		ContaEspecial especial = new ContaEspecial(numero, 0, 1000);
		ContaEmpresa empresa = new ContaEmpresa(numero, 0.00, 10000.00);
		ContaEstudante estudante = new ContaEstudante(numero, 0.00, 5000.00);
		Banner banner = new Banner();
		// fim das instancias de conta.

		banner.banner(); // chama banner, arte do banco.

		// nome e slogan.
		System.out.println("G3 Bank");
		System.out.println("Seu dinheiro em desenvolvimento!\n");

		for (int y = 0; y < 10000; y++) { // super for, controla todo o código, reserva os valores dentros dos
											// atributos.

			for (int x = 0; x < 6; x++) { // for do MENU roda as 6 opção.
				System.out.println((x + 1) + "-" + menu[x] + "\n");
			}

			System.out.println("\nEscolha a opção desejada:");
			opcao = leia.nextInt();

			if (opcao <= 0 || opcao > 6) { // opção fora do que existe no menu.
				System.out.println("Opção inválida.");
				System.out.println("Deseja voltar ao Menu? S-Sim ou N-Não");
				voltaMenu = leia.next().toUpperCase().charAt(0);
				if (voltaMenu == 'S') {
					System.out.println(new String(new char[50]).replace("\0", "\r\n"));
					main(args);
				} else if (voltaMenu == 'N') {
					System.out.println(new String(new char[50]).replace("\0", "\r\n"));
					System.out.println("Volte Sempre!");
					System.out.println("Banco G3");
					System.out.println("Seu dinheiro em desenvolvimento!\n");
					break;
				}

			}
			// CONTA POUPANÇA - CLARA.
			else if (opcao == 1) {
				int interacao = 1;

				poupanca.inicial();
				poupanca.inicioPoupanca();

				for (int x = 0; x <= 9; x++) {
					System.out.println("Movimento " + (x + 1));
					System.out.println("Qual operação você deseja efetuar? C-Crédito ou D-Débito");
					char op = leia.next().toUpperCase().charAt(0);
					System.out.println("Qual valor da operação?");
					double valorOperacao = leia.nextDouble();

					poupanca.opcoes(op, valorOperacao);

					System.out.println("Saldo Atual: " + poupanca.getSaldoPoup());

					interacao++;
					System.out.println("\nDeseja continuar? S-Sim ou N-Não");
					continuar = leia.next().toUpperCase().charAt(0);
					if (continuar == 'N') {

						System.out.println("\nQual é o dia de hoje?");
						int dia = leia.nextInt();
						poupanca.calculoAniversario(dia);
						System.out.println("Saldo Atual: " + poupanca.getSaldoPoup());

						System.out.println("\nDeseja voltar ao Menu? S-Sim ou N-Não");
						voltaMenu = leia.next().toUpperCase().charAt(0);
						if (voltaMenu == 'S') {
							System.out.println(new String(new char[50]).replace("\0", "\r\n"));
							break;
						} else if (voltaMenu == 'N') {
							System.out.println(new String(new char[50]).replace("\0", "\r\n"));
							poupanca.sair();
						}
						break;
					}

					if (interacao > 10) {
						System.out.println("Limite de interação atingido!\n");
						System.out.println("\nQual é o dia de hoje?");
						int dia = leia.nextInt();
						poupanca.calculoAniversario(dia);
						System.out.println("Saldo Atual: " + poupanca.getSaldoPoup() + "\n\n");
						break;
					}
				}
			}

			// CONTA CORRENTE - JEFFERSON
			else if (opcao == 2) {
				int interacao = 1;

				corrente.inicial();
				corrente.inicioCorrente();

				for (int x = 0; x <= 9; x++) {
					System.out.println("Movimento " + (x + 1));
					System.out.println("Qual operação você deseja efetuar? C-Crédito ou D-Débito");
					char op = leia.next().toUpperCase().charAt(0);
					System.out.println("Qual valor da operação?");
					double valorOperacao = leia.nextDouble();

					corrente.opcoes(op, valorOperacao);

					System.out.println("Saldo Atual: " + corrente.getSaldo());
					if (corrente.getTalao() > 0) {
						System.out.println("Talões: " + corrente.getTalao());
						System.out.println("\nDeseja um talão de cheque? S-Sim ou N-Não ");
						char cheque = leia.next().toUpperCase().charAt(0);
						if (cheque == 'S') {
							System.out.printf(
									"Você ainda tem %d talões disponiveis, qual quantidade você deseja solicitar? ",
									corrente.getTalao());
							int qtaCheque = leia.nextInt();
							corrente.pedirTalao(qtaCheque);
						} else if (cheque != 'N') {
							System.out.println("Opção inválida!");
							System.out.println("\nDeseja continuar? S-Sim ou N-Não");
							continuar = leia.next().toUpperCase().charAt(0);
							if (continuar == 'S') {
								System.out.printf(
										"Você ainda tem %d talões disponiveis, qual quantidade você deseja solicitar? ",
										corrente.getTalao());
								int qtaCheque = leia.nextInt();
								corrente.pedirTalao(qtaCheque);
							}
						}
					}

					interacao++;
					System.out.println("\nDeseja continuar? S-Sim ou N-Não");
					continuar = leia.next().toUpperCase().charAt(0);
					if (continuar == 'N') {
						System.out.println("Saldo Atual: " + corrente.getSaldo());
						System.out.println("Talões: " + corrente.getTalao() + "\n\n");

						System.out.println("\nDeseja voltar ao Menu? S-Sim ou N-Não");
						voltaMenu = leia.next().toUpperCase().charAt(0);
						if (voltaMenu == 'S') {
							System.out.println(new String(new char[50]).replace("\0", "\r\n"));
							break;
						} else if (voltaMenu == 'N') {
							System.out.println(new String(new char[50]).replace("\0", "\r\n"));
							corrente.sair();
						}
						// }
						if (interacao > 10) {
							System.out.println("Limite de interação atingido!\n");
							System.out.println("Saldo Atual: " + corrente.getSaldo());
							System.out.println("Talões: " + corrente.getTalao() + "\n\n");
							break;
						}
					}
				}
			}
			//// CONTA ESPECIAL - JAQUE
			else if (opcao == 3) {
				int interacao = 1;

				especial.inicial();
				especial.inicioLimite();

				for (int x = 0; x <= 9; x++) {
					System.out.println("Movimento " + (x + 1));
					System.out.println("Qual operação você deseja efetuar? C-Crédito ou D-Débito");
					char op = leia.next().toUpperCase().charAt(0);
					System.out.println("Qual valor da operação?");
					double valorOperacao = leia.nextDouble();

					especial.opcoes(op, valorOperacao);

					System.out.println("Saldo Atual: " + especial.getSaldo());
					System.out.println("Saldo de Limite Atual: " + especial.getLimite());

					interacao++;
					System.out.println("Deseja continuar? S-Sim ou N-Não");
					continuar = leia.next().toUpperCase().charAt(0);
					if (continuar == 'N') {
						System.out.println("Saldo Atual: " + especial.getSaldo());
						System.out.println("Saldo Limite: " + especial.getLimite() + "\n\n");
						System.out.println("\nDeseja voltar ao Menu? S-Sim ou N-Não");
						voltaMenu = leia.next().toUpperCase().charAt(0);
						if (voltaMenu == 'S') {
							System.out.println(new String(new char[50]).replace("\0", "\r\n"));
							break;
						} else if (voltaMenu == 'N') {
							System.out.println(new String(new char[50]).replace("\0", "\r\n"));
							especial.sair();
						}
					}

					if (interacao > 10) {
						System.out.println("Limite de interação atingido!\n");
						System.out.println("Saldo Atual: " + especial.getSaldo());
						System.out.println("Saldo Limite: " + especial.getLimite() + "\n\n");
						break;
					}
				}
			}

			// CONTA EMPRESA - W. LUAN
			else if (opcao == 4) {
				int interacao = 1;

				empresa.inicial();
				empresa.inicioEmpresa();

				for (int x = 0; x <= 9; x++) {
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
							System.out.println("Limite de Empréstimo Atual: " + empresa.getEmprestimo());
						}
					}
					System.out.println("\nQual operação você deseja efetuar? C-Crédito ou D-Débito");
					char op = leia.next().toUpperCase().charAt(0);
					System.out.println("Qual valor da operação?");
					double valorOperacao = leia.nextDouble();

					empresa.opcoes(op, valorOperacao);

					System.out.println("Saldo Atual: " + empresa.getSaldo());
					System.out.println("Limite de Empréstimo Atual: " + empresa.getEmprestimo());

					interacao++;
					System.out.println("\nDeseja continuar? S-Sim ou N-Não");
					continuar = leia.next().toUpperCase().charAt(0);
					if (continuar == 'N') {
						System.out.println("Saldo Atual: " + empresa.getSaldo());
						System.out.println("Limite Emprestimo: " + empresa.getEmprestimo() + "\n\n");

						System.out.println("\nDeseja voltar ao Menu? S-Sim ou N-Não");
						voltaMenu = leia.next().toUpperCase().charAt(0);
						if (voltaMenu == 'S') {
							System.out.println(new String(new char[50]).replace("\0", "\r\n"));
							break;
						} else if (voltaMenu == 'N') {
							System.out.println(new String(new char[50]).replace("\0", "\r\n"));
							empresa.sair();
						}

					}
					if (interacao > 10) {
						System.out.println("Limite de interação atingido!\n");
						System.out.println("Saldo Atual: " + empresa.getSaldo());
						System.out.println("Limite Emprestimo: " + empresa.getEmprestimo() + "\n\n");
						break;
					}
				}
			}
			// CONTA ESTUDANTE - GUSTAVO
			else if (opcao == 5) {
				int interacao = 1;
				estudante.inicial();
				estudante.inicioEstudante();

				for (int x = 0; x <= 9; x++) {
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
							System.out.println("Limite de Empréstimo Atual: " + estudante.getEmprestimo());
						}
					}
					System.out.println("\nQual operação você deseja efetuar? C-Crédito ou D-Débito");
					char op = leia.next().toUpperCase().charAt(0);
					System.out.println("Qual valor da operação?");
					double valorOperacao = leia.nextDouble();

					estudante.opcoes(op, valorOperacao);

					System.out.println("Saldo Atual: " + estudante.getSaldo());
					System.out.println("Limite de Empréstimo Atual: " + estudante.getEmprestimo());

					interacao++;
					System.out.println("\nDeseja continuar? S-Sim ou N-Não");
					continuar = leia.next().toUpperCase().charAt(0);
					if (continuar == 'N') {
						System.out.println("Saldo Atual: " + estudante.getSaldo());
						System.out.println("Limite de Emprestimo: " + estudante.getEmprestimo() + "\n\n");
						System.out.println("\nDeseja voltar ao Menu? S-Sim ou N-Não");
						voltaMenu = leia.next().toUpperCase().charAt(0);
						if (voltaMenu == 'S') {
							System.out.println(new String(new char[50]).replace("\0", "\r\n"));
							break;
						} else if (voltaMenu == 'N') {
							System.out.println(new String(new char[50]).replace("\0", "\r\n"));
							estudante.sair();
						}
					}
				}
				if (interacao > 10) {
					System.out.println("Limite de interação atingido!\n");
					System.out.println("Saldo Atual: " + estudante.getSaldo());
					System.out.println("Limite de Emprestimo: " + estudante.getEmprestimo() + "\n\n");
					break;
				}
			}

			else if (opcao == 6) { // CHAMA SAIR
				System.out.println(new String(new char[50]).replace("\0", "\r\n"));
				System.out.println("Volte Sempre!");
				System.out.println("Banco G3");
				System.out.println("Seu dinheiro em desenvolvimento!\n");
				break;
			}
		}
	}
}