package Objetos;

public class Preguica extends Animal{
	private boolean sobeArvore;
	
	public Preguica (String nome, int idade, boolean sobeArvore) {
		
		super(nome, idade);
		this.sobeArvore=sobeArvore;
	}

	public boolean getSobeArvore() {
		return sobeArvore;
	}

	public void setSobeArvore(boolean sobeArvore) {
		this.sobeArvore = sobeArvore;
	}
	
	@Override//polimorfismo - cada animal faz um som diferente
	public void emiteSom() {
		System.out.println("???");
	}
	
}
