programa
{
	
	funcao inicio()
	{
		real cf
		real pd
		real im
		real cc

		escreva("digite o valor do custo de fábrica: ")
		leia(cf)
		pd = cf*.28 + cf
		im = cf*.45 + cf
		cc = cf + pd + im

		escreva("total custo consumidor: " + cc)
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 139; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */