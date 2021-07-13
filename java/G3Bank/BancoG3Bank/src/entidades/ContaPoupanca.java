package entidades;

public class ContaPoupanca extends Conta {
	private int aniversario; /*14*/

	public ContaPoupanca(int numero, double saldo, int aniversario) {
		super(numero, saldo);
		this.aniversario = aniversario;
	}

	public int getAniversario() {
		return aniversario;
	}

	public void inicioPoupanca(){
		System.out.println("Bem vinde sua Conta Poupan�a!");
		System.out.println("Fa�a um cr�dito para iniciar sua conta!");
		System.out.println("Saldo Atual: "+saldo);
	}
	
	public double calculoAniversario(int dataAtual) {
		aniversario = 14;
		if(aniversario==dataAtual) {
			saldo = saldo * 1.05;
			System.out.println("Hoje � o anivers�rio da sua conta, receba o reajuste de 0.05%");
		} else if(aniversario!=dataAtual) {
			System.out.println("Hoje n�o � o anivers�rio da sua conta, o valor ser� atualizado todo dia 14.");
		}
		return saldo;
	}

}
