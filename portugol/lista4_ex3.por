programa
{
	
	funcao inicio()
	{
		/* Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma posição das matrizes N1 e N2.
		 */
		inteiro N1[4][6], N2[4][6], M1[4][6], M2[4][6] //os valores serão somados, mas o tamanho da matriz é igual
		inteiro linha=0, coluna=0//toda vez que for matriz, tem que fazer as variáveis linha e coluna, e os 'paras'

		para (linha=0; linha<4; linha++){
			para(coluna=0;coluna<6;coluna++){
				escreva("digite valor de ",linha," - ", coluna, " N1: ")
				leia(N1[linha][coluna])
				escreva("digite valor de ",linha," - ", coluna, " N2: ")
				leia(N2[linha][coluna])
				M1[linha][coluna]=N1[linha][coluna]+N2[linha][coluna]
				M2[linha][coluna]=N1[linha][coluna]-N2[linha][coluna]
			}
		}
		
		 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 366; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {N1, 10, 10, 2}-{N2, 10, 20, 2}-{M1, 10, 30, 2}-{M2, 10, 40, 2};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */