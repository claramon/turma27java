programa
{
	
	funcao inicio()
	{
		cadeia carretaFuracao[5]//são dois jeitos de declarar, posso só declarar a variável, ou já colocar os nomes
		cadeia carretaFuracaoo[] = {"homem aranha","pantera negra","mulher maravilha","huklyn","dollynho"}
		inteiro numPersonagem

		carretaFuracao[4]="dollynho"//1 jeito de fazer
		escreva("\n",carretaFuracao[4],"\n")
//

		escreva("\n",carretaFuracaoo[0],"\n")
		escreva(carretaFuracaoo[1],"\n")
		escreva(carretaFuracaoo[2],"\n")
		escreva(carretaFuracaoo[3],"\n")
		escreva(carretaFuracaoo[4],"\n")

		escreva("\ndigite o numero do personagem: ")//2 jeito de fazer, mas tem que declarar quais as opções antes(lista acima)
		leia(numPersonagem)
		escreva(carretaFuracaoo[numPersonagem],"\n")
//

		para (inteiro x=0; x<=4; x++){//3 jeito de fazer - usa 'para' pq sabemos o tamanho do vetor, quantas posições tem
			escreva("digite um número para escolher o personagem: ")
			leia(carretaFuracaoo[x])
		}
		para (inteiro x=0; x<5; x++){//posso falar que é menor igual a 4, ou menor que 5
			escreva(x," - ",carretaFuracaoo[x],"\n")//x=posição zero, [x]=qual personagem está na posição zero
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 857; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */