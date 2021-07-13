package Entities;

public class Funcionario {

	private String matricula;
	private int horasTrabalhadas=0;
	private double valorHora=0.00;
	
	
	//construtor - inicializa os atributos da classe no programa, programa só começa após inicializar os atributos
	public Funcionario(String matricula, int horasTrabalhadas, double valorHora) {
		super();//super está vazio pq Funcionario é a classe mãe
		this.matricula = matricula;
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorHora = valorHora;
	}

	
	//sobrecarga matricula, mesmo nome, numeros diferentes de atributos - se meu funcionario precisa so da matricula
	public Funcionario(String matricula) {
		super();
		this.matricula = matricula;
	}



	//getters and setters - encapsulamento - na duvida faz todos, depois se precisar, comenta
	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}


	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}


	public double getValorHora() {
		return valorHora;
	}


	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	
	
	public double salario() {
		//double valorSalario;
		//valorSalario=this.horasTrabalhadas*this.valorHora;
		//return valorSalario;
		//ou
		return this.horasTrabalhadas*this.valorHora;
	}
	
	
	
}
