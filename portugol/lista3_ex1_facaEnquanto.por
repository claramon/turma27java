programa
{
	/*1- Faça um programa que mostre uma contagem na tela de 233 a 456, só que contando de 3 em 3 quando estiver 
	 * entre 300 e 400 e de 5 em 5 quando não estiver
	 */
	funcao inicio()
	{
		inteiro minimo = 233
		inteiro maximo = 456
		inteiro soma = 0
				

		faca{
			escreva(minimo, " \n")
			se((minimo >= 300) e (minimo <= 400)){
				soma = 3
			}senao{
				soma = 5
			}
			minimo += soma
						
		}enquanto(minimo <= maximo)
			
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 348; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */