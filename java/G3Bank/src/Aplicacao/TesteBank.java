package Aplicacao;

import Entidades.Conta;
import Entidades.Poupanca;

public class TesteBank {

	public static void main(String[] args) {
		
		Conta cliente1=new Conta(34, "Ariel");
		System.out.println("cliente: "+cliente1.getCliente());
		System.out.println("saldo atual: "+cliente1.getSaldoConta());
		cliente1.credito(50);
		System.out.println("saldo atual: "+cliente1.getSaldoConta());
		cliente1.debito(100);
		System.out.println("saldo atual: "+cliente1.getSaldoConta());
		
		
		Poupanca cp1=new Poupanca(5, "marcos", 15);
		System.out.println("cliente: "+cp1.getCliente());
		System.out.println("saldo atual: "+cp1.getSaldoConta());
		cp1.credito(50);
		System.out.println("saldo atual: "+cp1.getSaldoConta());
		cp1.debito(100);
		System.out.println("saldo atual: "+cp1.getSaldoConta());
		System.out.println("dia de aniversario "+cp1.getAniversarioConta());
		
	}

}
