package Objetos;

public class Time {

	private String nome;
	private int pontos;
	
	
	public Time(String nome) {
		super();
		this.nome = nome;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getPontos() {
		return pontos;
	}


	//public void setPontos(int pontos) {   => NAO PODE MEXER NOS PONTOS
	//	this.pontos = pontos;
	//}
	
	public void darPontos(char status) {
		if(status=='g') {//=> ganhou
			pontos=pontos+3;
			
		}else if(status=='e') {//=> empatou
			pontos+=1;
			
		}else if(status=='p') {//=> perdeu
			pontos+=0;
		}
	}
	
	
}
