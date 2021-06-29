programa
{
	
	funcao inicio()
	{
		 
		inteiro nota[5],maiorNota=0,x=0

		para(x=0; x<5; x++){
			escreva("escreva a nota: ")
			leia(nota[x])	
			
		}
		limpa()
		para(x=0; x<5; x++){
			se(nota[x] > maiorNota){
			maiorNota = nota[x]
			
			
			}
		}
			escreva("Maior nota digitada foi ",maiorNota,"\n")
			
	}			
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 147; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */