package Programas_POO;

import java.util.Scanner;
import Objetos.Conta;

public class Bancool {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		Conta cliente1=new Conta(1);//precisa colocar um numero inteiro para fazer a conta, qualquer numero
		Conta clienteVIP=new Conta(2, 55.55);//numero conta+valor do saldo
		Conta clienteEspecial=new Conta(3, 2100.98, 1000);//numero conta+saldo+limite
		
		
		cliente1.setNumero(99);//mudei o numero da conta do cliente 1, mas pq eu permiti no set no objeto
		System.out.println("numero da conta: "+cliente1.getNumero()+" e essa conta é: "+cliente1.contaVeiaOuNova(cliente1.getNumero()));
		
		clienteVIP.imprimeExtrato();//conta 2 55.55 reais
		
		cliente1.imprimeExtrato();//saldo zero, mudei o numero da conta para 888
		cliente1.depositar(-1);
		cliente1.imprimeExtrato();
		
		clienteVIP.sacar(60.00);
		clienteVIP.imprimeExtrato();
		
		

	}

}
