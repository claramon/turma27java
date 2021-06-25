programa
{
	
	funcao inicio()
	{
		inteiro idade
		inteiro contador=1

		escreva("digite sua idade: ")
			leia(idade)

		enquanto(idade < 18){

			escreva("você não tem idade suficiente para acessar: \n")
			escreva("digite sua idade: ")
			leia(idade)
			contador++
			
			se(contador > 3){
				escreva("colega, você já tentou 3 vezes... já deu né? \n")
				pare
			}
			
		}
		se(contador == 1){//o pc começa a contar do zero, até o 3 ele conta 4 vezes; tem que começar do 1 para digitar 3 vezes
			escreva("parabéns, agora vc tem acesso")
		}
		senao{
			escreva("esse site não é pra vc")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 140; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */