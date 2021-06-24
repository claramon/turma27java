programa
{

/*
 * Construa um sistema para ler uma variável numérica N e imprimi-la somente se a mesma for maior que 100, caso contrário 
 * imprimi-la com o valor zero.
 */
	
	funcao inicio()
	{
		inteiro n=0.0

		escreva("digite um número inteiro: ")
		leia(n)

		se (n > 100) {
			escreva("seu valor é: ",n)
		} senao {
			escreva("seu valor é zero")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 211; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */