programa
{
	
	/*
	 * Elabore um sistema que leia as variáveis C e N, respectivamente código e número de horas trabalhadas de um operário. 
	 * E calcule o salário sabendo-se que ele ganha R$ 10,00 por hora. Quando o número de horas exceder a 50 calcule o excesso 
	 * de pagamento armazenando-o na variável E, caso contrário zerar tal variável. A hora excedente de trabalho vale R$ 20,00. 
	 * No final do processamento imprimir o salário total e o salário excedente.
	 */
	
	funcao inicio()
	{
		cadeia c
		inteiro n=0, excesso=0
		real acrescimo=0.0, s=0.0
		const real VH = 10.0
		const inteiro HORAS_PERMITIDAS = 50
		const real HORAS_EXTRA = 20.0

		escreva("qual seu código? ")
		leia(c)
		escreva("seu código é ",c,". Quantas horas esse mês? ")
		leia(n)
		
		se (HORAS_PERMITIDAS < n){
			excesso = n - HORAS_PERMITIDAS
			acrescimo = excesso * HORAS_EXTRA
			s = acrescimo + (VH * HORAS_PERMITIDAS) 
			escreva("vc trabalhou durante ",n," horas e receberá R$",s,", ou seja, receberá R$ ",acrescimo," de horas extras trabalhadas")
		}
		senao {
			s = n * VH // => TEM QUE CALCULAR O SALÁRIO DENOVO, e diferente
			escreva("você não fez horas extras esse mês \n")
			escreva("vc trabalhou durante ",n," horas e receberá R$",s)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 750; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */