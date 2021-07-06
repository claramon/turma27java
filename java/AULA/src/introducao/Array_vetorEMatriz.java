package introducao;

import java.util.Scanner;

public class Array_vetorEMatriz {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		//String alunos[]=new String[4]; => vetor, vai de zero à 3 (4 posições)
		//alunos[0] = "EPAMINONDAS"; =>> ARRAY
		//System.out.println(alunos[1]);
		
		String alunos[]= {//outro jeito de fazer...
				"João","Marcos","Maria","Pedro"
		};
		String matricula[]= new String[4];
		int notas[]=new int[4];//no for posso usar o tamanho do vetor, ou uma contante...
		final int LIMITE=4;
		String aux;
		
		alunos[3]=alunos[3].toUpperCase();
		System.out.println(alunos[3]);
		System.out.println(alunos[2].toUpperCase());
		
		//for (String x : alunos) { =>> for each (já tem um int lá dentro) cria um apelido (x)
			//System.out.println(x);
		//}
		
		System.out.println("cadastro de notas");
		
		for(int x=0;x<alunos.length;x++) {//para mostrar todos os vetores, já puxa o tamanho do vetor
			System.out.println("Alune "+(x+1));
			matricula[x]= "MAT-"+(x+1);//precisa de texto, pq é string. Não da só pra colocar x+1
			System.out.println("Matricula "+matricula[x]+"\nAlune "+alunos[x].toUpperCase()+": ");//para mostrar posição por posição
			notas[x]=leia.nextInt();
		}
		
		System.out.println("BOLETIM");
		for(int x=0;x<LIMITE;x++) {
			if(notas[x]>=5) {
				System.out.printf("%s - %s: %d APROVADO\n",matricula[x],alunos[x].toUpperCase(),notas[x]);
			}else {
				System.out.printf("%s - %s: %d AINDA NÃO\n",matricula[x],alunos[x].toUpperCase(),notas[x]);
			}
			
		}
		System.out.println("escolha o aluno do qual deseja ver a nota pelo numero da matricula");
		System.out.println("digite a matricula: ");
		aux = leia.next();
		
		for(int x=0;x<4;x++) {
			if(matricula[x].equals(aux)) {//tem que digitar MAT - x
				if(notas[x]>=5) {
					System.out.printf("%s - %s: %d APROVADO\n",matricula[x],alunos[x].toUpperCase(),notas[x]);
				}else {
					System.out.printf("%s - %s: %d AINDA NÃO\n",matricula[x],alunos[x].toUpperCase(),notas[x]);
				}
			}
		}
}
}