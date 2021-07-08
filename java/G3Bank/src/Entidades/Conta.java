package Entidades;

public class Conta {

	//atributos
	private int numero;
	private String cliente;
	private double saldoConta;
	
	//construtor
	public Conta(int numero, String cliente) {
		super();
		this.numero = numero;
		this.cliente = cliente;
	}

	//getters setters-encapsulamento
	public int getNumero() {
		return numero;
	}
	/* NÃO QUER QUE POSSA MUDAR O NUMERO
	public void setNumero(int numero) {
		this.numero = numero;
	}*/

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public double getSaldoConta() {
		return saldoConta;
	}
	/*SO MEXE NO SALDO COM DEBITO E CREDITO
	public void setSaldoConta(double saldoConta) {
		this.saldoConta = saldoConta;
	}*/
	
	//METODOS
	public void credito(double valorCredito) {
		this.saldoConta=this.saldoConta+valorCredito;
	}
	
	public void debito(double valorDebito) {
		this.saldoConta=this.saldoConta-valorDebito;
	}
	
	
	
	public void imprimeExtrato() {
		System.out.println("conta "+numero+" saldo atual: R$ "+saldoConta);
	}
	
	public void sacar(double valorSaque) {//so existe esse double aqui, e vai receber o valor que o usuario vai digitar
		if(valorSaque<=0) {
			System.out.println("valor informado inválido");
		}
		else if(valorSaque>saldoConta) {
			System.out.println("saldo insuficiente");
		}else {
			saldoConta=saldoConta-valorSaque;
		}
		
	}
	
	public void depositar(double valorDeposito) {
		if(valorDeposito<=0) {
			System.out.println("valor informado inválido");
		}
		saldoConta=saldoConta+valorDeposito;
	}
	
	public String contaVeiaOuNova(int numero) {
		String resposta;
		if(numero>100) {
			resposta="nova";
		}else {
			resposta="velha";
		}return resposta;		
				
	}
	
	
}
