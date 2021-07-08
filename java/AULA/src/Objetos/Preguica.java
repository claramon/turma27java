package Objetos;

public class Preguica extends Animal{
	private boolean sobeArvore;
	
	public Preguica (String nome, int idade, boolean som, boolean corre) {
		
		super(nome, idade, som);
		this.sobeArvore=corre;
	}

	public boolean getSobeArvore() {
		return sobeArvore;
	}

	public void setSobeArvore(boolean sobeArvore) {
		this.sobeArvore = sobeArvore;
	}
	
	
	
}
