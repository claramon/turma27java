package Lista_laco_repeticao;

import java.util.Scanner;

public class Ex_4 {

	//Uma empresa desenvolveu uma pesquisa para saber as características psicológicas dos indivíduos de 
	//uma região. Para tanto, a cada uma das pessoas era perguntado: idade, sexo (1-feminino / 2-masculino / 
	//3-Outros), e as opções (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era 
    //agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e 
	//mostre: 	
	//o número de pessoas calmas; 
	//o número de mulheres nervosas; 
	//o número de homens agressivos; 
	//o número de outros calmos;
	//o número de pessoas nervosas com mais de 40 anos; 
	//o número de pessoas calmas com menos de 18 anos.

	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int idade=0;
		char sexo;//(1-feminino / 2-masculino / 3-Outros)
		char opcoes;//1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva
		int pessoasCalmas=0; 
		int mulheresNervosas=0; 
		int homensAgressivos=0; 
		int outrosCalmos=0;
		int pessoasNervosas40Mais=0; 
		int pessoasCalmas18Menos=0;
		char op=' ';
		final int LIMITE=150;
		int contador=1;
		
		while((op=='s' || op == 'S') && contador<=LIMITE) {
			System.out.println("participante "+contador);
			System.out.println("digite a idade: ");
			idade = leia.nextInt();
			System.out.println("\n1-feminino \n2-masculino \n3-Outros: ");
			sexo = leia.next().charAt(0);
			System.out.println("selecione: ");
			System.out.println("1 - pessoa calma; \n2 - pessoa nervosa \n3 - pessoa agressiva: ");
			opcoes = leia.next().charAt(0);
			
			if(opcoes=='1') {
				pessoasCalmas++;//contador de pessoas calmas
			}
			if(sexo=='1' && opcoes =='2') {//não é else if, as perguntas não estão encadeadas
				mulheresNervosas++;
			}
			if(sexo =='2' && opcoes=='3') {
				homensAgressivos++;
			}
			if(sexo =='3' && opcoes=='1') {
				outrosCalmos++;
			}
			if(idade>40 && opcoes=='2') {
				pessoasNervosas40Mais++;
			}
			if(idade<18 && opcoes=='1') {
				pessoasCalmas18Menos++;
			}
			
			contador++;//quando atingir contador=150, sai do loop
			System.out.println("continua? S/N");
			op = leia.next().charAt(0);
			
			
		}
		System.out.println("pessoas calmas: "+pessoasCalmas);//saida
		System.out.println("mulheres nervosas: "+mulheresNervosas);
		System.out.println("homens agressivos: "+homensAgressivos);
		System.out.println("outros calmos: "+outrosCalmos);
		System.out.println("pessoas nervosas com mais de 40 anos: "+pessoasNervosas40Mais);
		System.out.println("pessoas calmas com menos de 18 anos: "+pessoasCalmas18Menos);
	}

}
