programa
{
	inclua biblioteca Matematica --> mat
	
/*
 * Desenvolva um sistema em que:
Leia 4 (quatro) números;
Calcule o quadrado de cada um;
Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
Caso contrário, imprima os valores lidos e seus respectivos quadrados
 */
	
	funcao inicio()
	{
		real n1=0.0,n2=0.0,n3=0.0,n4=0.0,q1=0.0,q2=0.0,q3=0.0,q4=0.0

			escreva("digite seu primeiro número: ")
		leia(n1)
		escreva("digite seu segundo número: ")
		leia(n2)
		escreva("digite seu terceiro número: ")
		leia(n3)
		escreva("digite seu quarto número: ")
		leia(n4)

		q1 = mat.potencia(n1, 2)
		q2 = mat.potencia(n2, 2)
		q3 = mat.potencia(n3, 2)
		q4 = mat.potencia(n4, 2)

		se (q3 >= 1000) {
			escreva("seu número é: ",q3)
	 	}
	 	senao {
	 		escreva("o quadrado de seu primeiro número é: ",q1,"\n")
	 		escreva("o quadrado de seu segundo número é: ",q2,"\n")
	 		escreva("o quadrado de seu terceiro número é: ",q3,"\n")
	 		escreva("o quadrado de seu quarto número é: ",q4)
	 	}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 387; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */