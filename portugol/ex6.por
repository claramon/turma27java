programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real x1, x2, y1, y2, d, a, b

		escreva("digite o valor de x1: ")
		leia(x1)
		escreva("digite o valor de x2: ")
		leia(x2)
		escreva("digite o valor de y1: ")
		leia(y1)
		escreva("digite o valor de y2: ")
		leia(y2)

		//usa mais variáveis, consome memória... em programa pequeno é legal, mas em programas grandes pode pesar
		a = (x2-x1) 
		b = (y2-y1)
		d = mat.raiz((Matematica.potencia(a,2) + mat.potencia(b,2)),2)//(x2-x1)+(y2-y1)

		escreva("a distância de 'd' é: " + mat.arredondar(d,2))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 74; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */