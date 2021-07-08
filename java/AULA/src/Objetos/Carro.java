package Objetos;

public class Carro {

	//atributos que o objeto tem ou é ou está
	public String marca;
	public String cor;
	public int preco;
	public char compraOuVenda;
	public boolean ligado;//atributo tipo estado
	public int velocidade;
	
	//metodo que liga/desliga carro
	public void ligarCarro() {
		ligado = true;
		System.out.println("carro ligando... ");
	}
	
	public void desligaCarro() {
		if(velocidade==0) {
			ligado=false;
			System.out.println("carro desligando... ");
		}else {
			System.out.println("desacelere o carro! ");
		}
		
	}
	public void aceleraCarro() {
		velocidade++;//acelera de 1 em 1
	}
}
