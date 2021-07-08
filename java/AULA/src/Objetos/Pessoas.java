package Objetos;

public class Pessoas {
	
		//atributos - coisas que compõem o objeto
		public String nome;
		public char sexo;
		public int anoNascimento;
		public int cadastro;
		
		//termina nele mesmo, não devolve para o programa
		public void mostrarIdade() {
			System.out.println(2021-anoNascimento);
			if((2021-anoNascimento)>=18) {
				System.out.println("vc é dulto");
			}else {
				System.out.println("vc é criança");
			}
		}
		//devolve para o programa
		public int calcularIdade() {
			return 2021-anoNascimento;
		}
		//devolve para o programa
		public int calcularIdade(int anoAtual) {
			return anoAtual-anoNascimento;
		}
		
		public int chaveCadastro() {
			return cadastro = (int) (Math.random() * 10001);
			
		}
}
