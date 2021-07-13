package Objetos;

public class Cavalo extends Animal {
	private boolean corre;
	
	public Cavalo (String nome, int idade, boolean corre) {
		
		super(nome, idade);
		this.corre=corre;
	}

	public boolean getCorre() {
		return corre;
	}

	public void setCorre(boolean corre) {
		this.corre = corre;
	}
	
	@Override//polimorfismo - cada animal faz um som diferente
	public void emiteSom() {
		System.out.println("relincho");
	}
	
}
