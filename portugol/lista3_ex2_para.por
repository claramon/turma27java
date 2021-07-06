programa
{
	
	/*Desenvolver um sistema que efetue a soma de todos os números ímpares que são múltiplos de três e que se encontram no 
	 * conjunto dos números de 1 até 500
	 */
	 
	funcao inicio()
	{
		const inteiro limite = 500
		inteiro soma = 0

		para(inteiro contagem = 1; contagem<=500;contagem++){//começa em 1 e vai até 500
			se((contagem%2 == 1) e (contagem%3 ==0)){//se o resto=1, o número é impar
				soma += contagem //somar os números de contagem = 3
			}
		}
		escreva("a soma de todos os números ímpares multiplos de 3 até 500 é: ",soma)
	}
}	
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 559; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */