programa
{
	
	funcao inicio()
	{
		cadeia alunos [4]
		inteiro nota [4]

		escreva("BOLETINHO DO ED \n")
		
		para(inteiro x=0; x<4; x++){
			escreva("digite o nome do aluno: ")
			leia(alunos[x])//não sei em que posição ele vai estar, vai depositar o nome na posição do laço
			escreva("digite a nota: ")
			leia(nota[x])
		}
			
	

		limpa()
		
		para(inteiro x=0; x<4; x++){
			se(nota[x] >= 5){
				escreva("aluno ",alunos[x],", você foi aprovado com nota ",nota[x]," parabéns!\n")
			}senao{
				escreva("poxa aluninho ",alunos[x],", você foi reprovado com nota ",nota[x]," :(\n")
			}
			
		}
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 543; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */