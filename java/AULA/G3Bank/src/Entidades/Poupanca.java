package Entidades;

public class Poupanca extends Conta{
	private int aniversarioConta;

	public Poupanca(int numero, String cliente, int aniversarioConta) {
		super(numero, cliente);
		this.aniversarioConta=aniversarioConta;
	}

	
	public int getAniversarioConta() {
		return aniversarioConta;
	}

	public void setAniversarioConta(int aniversarioConta) {
		this.aniversarioConta = aniversarioConta;
	}
	
	

}
