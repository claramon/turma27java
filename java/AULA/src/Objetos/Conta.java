package Objetos;

public class Conta {
	private int numero;
	private double saldo;
	private double limite;
	
	//construtor-só abre conta se colocar um numero da conta-se tem (), é construtor
	public Conta(int numero) {
		this.numero=numero;
	}
	
	public Conta(int numero, double saldo) {
		this.saldo=saldo;
		this.numero=numero;
	}

	public Conta(int numero, double saldo, double limite) {
		super();
		this.numero = numero;
		this.saldo = saldo;
		this.limite = limite;
	}
	

	//getters and setters-encapsulamento
	//GET - pega
	public int getNumero() {
		return numero;
	}
	
	//SET- altera-"método"	- se eu comentar o setNumero, nao consegue mais mudar o numero da conta no programa principal
	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	//METODOS PROPRIOS
	public void imprimeExtrato() {
		System.out.println("conta "+numero+" saldo atual: R$ "+saldo);
	}
	
	public void sacar(double valorSaque) {//so existe esse double aqui, e vai receber o valor que o usuario vai digitar
		if(valorSaque<=0) {
			System.out.println("valor informado inválido");
		}
		else if(valorSaque>saldo) {
			System.out.println("saldo insuficiente");
		}else {
			saldo=saldo-valorSaque;
		}
		
	}
	
	public void depositar(double valorDeposito) {
		if(valorDeposito<=0) {
			System.out.println("valor informado inválido");
		}
		saldo=saldo+valorDeposito;
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
