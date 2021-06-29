programa
{
	
	funcao inicio()
	{
		cadeia predioJess[3][3]//linhas=colunas
		inteiro linha,coluna

		predioJess[0][0]="CAIO LIMA"
		predioJess[0][1]="VIC"
		predioJess[0][2]="AUGUSTO"
		predioJess[1][0]="TAI"
		predioJess[1][1]="VALMIR"
		predioJess[1][2]="NATALIA"
		predioJess[2][0]="JOÃO"
		predioJess[2][1]="FABIO"
		predioJess[2][2] = "JANAINA"

		//declarando os moradores                   
		para(inteiro x=0; x<3; x++){//linha => roda uma vez, entra dentro e roda o outro para. quando sair do para de dentro, volta pro de fora
			para(inteiro y=0; y<3; y++){//coluna => enquanto está naquela linha, vai rodando as colunas no para de dentro
				escreva(predioJess[x][y],"\n")
			}
		}

		escreva("digite a linha: ")
		leia(linha)
		escreva("digite a coluna: ")
		leia(coluna)
		escreva("o morador do ape ",linha," - ",coluna," é ",predioJess[linha][coluna],"\n")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 653; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {predioJess, 6, 9, 10};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */