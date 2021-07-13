package entidades;

public class ContaEmpresa extends Conta {
	private double emprestimo;

	public ContaEmpresa(int numero, double saldo, double emprestimo) {
		super(numero, saldo);
		this.emprestimo = emprestimo;
	}
	
	public double getEmprestimo() {
		return emprestimo;
	}

	public void inicioEmpresa() {
		System.out.println("Bem vinde sua Conta Empresa!");
		System.out.println("Temos uma opção de emprestimo para sua empresa, seu limite é de até R$ 10.000!!!");
		System.out.println("Saldo Atual: "+saldo);
		System.out.println("Saldo Emprestimo: "+emprestimo);
	}
	
	public double emprestimo(double valorEmprestimo){
		emprestimo=10000.00;
		if(valorEmprestimo <= 0 ) {
			System.out.println("Valor invalido!\n");
		}
		else if (valorEmprestimo>emprestimo) {
			System.out.printf("Saldo insulficiente! Ainda restam R$ %d de limite de emprestimo!",emprestimo);
		} else if(valorEmprestimo <= emprestimo){
			this.emprestimo = this.emprestimo - valorEmprestimo;
			super.saldo = super.saldo + valorEmprestimo;
			System.out.println("Emprestimo realizado!");
		}
		
		return emprestimo;
	}
	
	

}
