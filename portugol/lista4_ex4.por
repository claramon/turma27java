programa
{
	
	funcao inicio()
	{
		/*Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e em seguida, exiba a soma dos 
		 * valores dela e a soma dos valores da primeira diagonal, ou seja, diagonal principal.
		 */
		 inteiro M[3][3], linha=0, coluna=0, diagonal=0, soma=0

		 para(linha=0;linha<3;linha++){
		 	para(coluna=0;coluna<3;coluna++){
		 		escreva("digite o valor de ",linha+1," - ",coluna," da matriz M: ")
		 		leia(M[linha][coluna])
		 		soma += M[linha][coluna]

		 		se(M[linha][linha] == M[coluna][coluna]){
		 			diagonal += M[linha][linha]
		 		}
		 	}
		 }
		 limpa()
		 escreva("somatório matriz: ",soma,"\n")
		 escreva("soma diagonal principal: ",diagonal,"\n")
		 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 620; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {M, 9, 11, 1};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */