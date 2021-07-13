package Objetos;

public class Animal {
	
	private String nome;
	private int idade;
	
	
	public Animal(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;

	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}

	// metodo proprio - regra geral
	public void emiteSom() {
		System.out.println("emitindo som...");
	}


	
	
	
	
}
