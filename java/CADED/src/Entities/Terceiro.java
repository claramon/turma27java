package Entities;

public class Terceiro extends Funcionario{

	private double adicional;

	//classe filha tem que OBRIGATORIAMENTE ter construtor - construtor completo
	public Terceiro(String matricula, int horasTrabalhadas, double valorHora, double adicional) {
		super(matricula, horasTrabalhadas, valorHora);
		this.adicional = adicional;
	}
	
	//posso agr escolher, se quero completo ou so matricula (sobrecarga que criei na mãe)
	public Terceiro(String matricula, double adicional) {
		super(matricula);//super está apontando para a mãe
		this.adicional = adicional;
	}

	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	
	//sobrecarga de mae pra filha, tinha na mae mas nao tinha na filha
	@Override
	public double salario() {
		return (super.getHorasTrabalhadas()*super.getValorHora())+adicional;//pego as horas e o valor da super
	}
	
}
