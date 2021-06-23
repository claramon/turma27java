programa
{
	
	funcao inicio()
	{
		cadeia nome
		real f
		real c
		
		escreva("nome: ")
		leia(nome)
		escreva("temperatura em F: ")
		leia(f)
		//já declarei ela lá em cima, agr trago a conta
		//agr posso usar o 'f' na conta, pq ele foi lido na linha acima
		c = (f - 26) / 1.8
		escreva("temperatura em C: " + c)
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 134; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */