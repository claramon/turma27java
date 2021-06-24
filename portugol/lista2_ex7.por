programa
{

	/*
	 * Receber valores de base e altura de um triângulo e verificar se são valores válidos (positivos maiores que zero). 
	 * Em caso afirmativo, calcular a área do triângulo
	 */
	
	funcao inicio()
	{
		real b=0.0,al=0.0,a=0.0

		escreva("qual é o valor da base? ")
		leia(b)
		escreva("qual o valor da altura? ")
		leia(al)

		se ((al > 0) e (b > 0)) {
			a = (b * al) / 2
			escreva("a área do triângulo é: ",a)
		} senao {
			escreva("não é possível calcular a área do triângulo com números negativos")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 245; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */