programa
{
	
	funcao inicio()
	{	
	/*
	 * Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa que gere um vetor com os lançamentos, 
	 * escreva esse vetor. A seguir determine e imprima a média aritmética dos lançamentos, contabilize e apresente também 
	 * quantas foram as ocorrências da maior pontuação.
	 */
	 
		inteiro lancaDado[10]//são 6 lados do dado
		inteiro x=0, maiorOcorrencia=0, maiorLance=0
		real media=0.0, soma=0.0
		

			para(x=0;x<10;x++){//soma e média
				escreva("qual o valor da rodada? ")
				leia(lancaDado[x])
				soma += lancaDado[x]
				media = soma / 10

				se(lancaDado[x]>maiorLance){
					maiorLance=lancaDado[x]
				}
				
			}
			para(x=0;x<10;x++){//contador e maior ocorrência
				se(maiorLance == lancaDado[x]){
					maiorOcorrencia++
			}

		}

		escreva("soma: ",soma,"\n")
		escreva("a média é: ",media,"\n")
		escreva("maior ocorrência: ",maiorOcorrencia)
	}
}




/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 927; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */