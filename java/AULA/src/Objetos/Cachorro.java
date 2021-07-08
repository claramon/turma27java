package Objetos;

public class Cachorro extends Animal {
	private boolean corre;
	
	public Cachorro (String nome, int idade, boolean som, boolean corre) {
		
		super(nome, idade, som);
		this.corre=corre;
	}

	public boolean getCorre() {
		return corre;
	}

	public void setCorre(boolean corre) {
		this.corre = corre;
	}
	
	
	
}
