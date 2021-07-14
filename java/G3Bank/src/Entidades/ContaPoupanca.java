package Entidades;

public class ContaPoupanca extends Conta {
	private int aniversario; /*14*/
	private double saldoPoup;

	public ContaPoupanca(int numero, double saldoPoup, int aniversario) {
		super();
		this.saldoPoup=saldoPoup;
		this.aniversario = aniversario;
	}

	public int getAniversario() {
		return aniversario;
	}
	
	public double getSaldoPoup() {
		return saldoPoup;
	}

	public void inicioPoupanca(){
		System.out.println("Bem vinde sua Conta Poupan�a!");
		System.out.println("Fa�a um cr�dito para iniciar sua conta!");
		System.out.println("Saldo Atual: "+saldoPoup);
	}
	
	public double calculoAniversario(int dataAtual) {
		aniversario = 14;
		if(aniversario==dataAtual) {
			saldoPoup = saldoPoup * 1.05; // (saldoPoup * 0.05 ) + saldoPoup
			System.out.println("Hoje � o anivers�rio da sua conta, receba o reajuste de 0.05%");
		} else if(aniversario!=dataAtual) {
			System.out.println("Hoje n�o � o anivers�rio da sua conta, o valor ser� atualizado todo dia 14.");
		}
		return saldoPoup;
	}
	
	@Override
	public void opcoes(char opcao, double valorOperacao){
		if (opcao == 'C' ) {
			if(valorOperacao <= 0) {
				System.out.println("Valor invalido.");
			} else if (valorOperacao > 0) {
			this.saldoPoup = this.saldoPoup + valorOperacao;
			}	
			
		} else if (opcao == 'D') {
			if(valorOperacao <= 0 ) {
				System.out.println("Valor invalido!\n");
			}
			
			else if (valorOperacao>saldoPoup) {
				System.out.println("Saldo insulficiente\n");
			} else {
				this.saldoPoup = this.saldoPoup - valorOperacao;
				System.out.println("Debito realizado!\n");
			}
		}
	}

}