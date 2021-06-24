programa
{
	
	funcao inicio()
	{
		// portugol = IDE
		// algoritmo = programa (receita de bolo): nome (objetivo), início - (variáveis, entradas, processamentos, saídas) - fim
		// objetivo: 
		// Faça um sistema que leia o tempo de duração de um evento em uma fábrica expressa em segundos e mostre-o expresso em horas, minutos e segundos
		
		inteiro td, s, m, h

		escreva("digite o tempo do evento[segundos]: ")
		leia(td)
		h = td / 3600
		m = (td % 3600) / 60// quero o resto da divisão das horas, só quando dá resto que vai calcular os minutos
		s = (td % 3600) % 60// pq agora preciso do resto do resto, só quando tiver resto que vai calcular os seg
		
		escreva("horas: " + h + "\n")
		escreva("minutos: " + m + "\n")
		escreva("segundos: " + s + "\n\n")

		escreva("fim de programa")
		
		
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 755; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */