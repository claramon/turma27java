programa
{

/*
 * Faça um sistema que leia um número inteiro e mostre uma mensagem indicando se este número é par ou ímpar, e se é 
 * positivo ou negativo.
 */
	
	funcao inicio()
	{
		inteiro numero=0.0

		escreva("qual seu número? ")
		leia(numero)

		se ((numero % 2 == 0) e (numero > 0)) {//se o resto for igual a zero...
			escreva("seu número é par e positivo")
		}
		senao {
			se ((numero % 2 == 0) e (numero <0)) {
				escreva("seu número é par e negativo")}
			senao 
				se ((numero % 2 !=0) e (numero >0)) {
					escreva("seu número é ímpar e positivo")}
				senao 
					se ((numero % 2 !=0) e (numero <0)) {
					escreva("seu número é ímpar e negativo")}
					senao {
						escreva("você digitou zero? não pode...")
					}

	}
}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 203; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */