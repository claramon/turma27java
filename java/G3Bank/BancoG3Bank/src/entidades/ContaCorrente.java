package entidades;

public class ContaCorrente extends Conta {
	private int talao;


	public ContaCorrente(int numero, double saldo, int talao) {
		super(numero, saldo);
		this.talao = talao;
	}
	
	public void inicioCorrente(){
		System.out.println("Bem vinde sua Conta Corrente!");
		System.out.println("Fa�a um cr�dito para iniciar sua conta!");
		System.out.println("Saldo Atual: "+saldo);
	}
	
	public int getTalao() {
		return talao;
	}

	public double pedirTalao(int pedido) {
		talao=3;
		if(pedido<=0) {
			System.out.println("Valor inv�lido!\n");
		} else if(pedido<=talao && saldo>30.00) {
			saldo = saldo - 30.00;
			talao--;
			System.out.printf("Seu pedido de tal�o foi conclu�do! Ainda restam %d tal�es",talao);
		} else if(pedido>talao) {
			System.out.println("Voc� j� solicitou todos os tal�es disponiveis esse m�s.");
		} else if(saldo<30.00) {
			System.out.println("Saldo insuficiente!");
		}
		return saldo;
	}
	
	

}
