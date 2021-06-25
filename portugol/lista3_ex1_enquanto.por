programa
{
	inclua biblioteca Matematica --> mat

		/*
		 * Elaborar um programa que efetue a leitura sucessiva de valores numéricos e apresente no final o total do somatório, 
		 * a média e o total de valores lidos. O programa deve fazer as leituras dos valores enquanto o usuário estiver 
		 * fornecendo valores positivos. Ou seja, o programa deve parar quando o usuário fornecer um valor negativo.
		 */	
	funcao inicio()
	{
		//variáveis
		inteiro numero=0//usuário informa
		inteiro somatorio=0//soma de todos os valores
		real contador=-1.0//quantos valores foram digitados
		real media=0.0//média simples

		//entrada + processamento
		//o enquanto testa no início, o faça enquanto testa no final
		enquanto(numero>=0){ //ele só sai no negativo, o zero não conta
			escreva("digite um numero positivo ou negativo para sair: ")// => só isso não somaria vários numeros
			leia(numero)
			se(numero>=0)
			somatorio += numero//só posso somar se ele for positivo, se for negativo soma e sai
			contador++
		}
		media = somatorio / contador//precisa calcular so uma vez, não entra no looping do enquanto
		
		
		//saída
		escreva("total somatório ",somatorio,"\n")
		escreva("total numeros lidos ",contador,"\n")
		escreva("media ",media,"\n")
		escreva("fim de programa")//só sai quando for negativo
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 671; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */