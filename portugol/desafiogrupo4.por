programa
{
	
	funcao inicio()
	{
		const cadeia TIME1 = "Corinthians"
		const cadeia TIME2 = "Palmeiras"
		const cadeia TIME3 = "São Paulo"
		const cadeia TIME4 = "Santos"
		const inteiro RODADA = 4
		
		inteiro pontosCor = 0, pontosPal = 0, pontosSao = 0, pontosSan = 0
		caracter resultado
		
		para (inteiro i = 1; i <= RODADA; i++) {
			escreva("RODADA " + i, "\n")
			escreva("Corinthians - ")
			escreva("Ganhou, Perdeu, Empatou: ")
			leia(resultado)
			se ((resultado == 'P') ou (resultado == 'p')) {
				pontosCor+= 0
			} senao se (resultado == 'E') {
				pontosCor+= 1
			} senao se (resultado == 'G') {
				pontosCor+= 3
			}
			escreva("Palmeiras - ")
			escreva("Ganhou, Perdeu, Empatou: ")
			leia(resultado)
			se ((resultado == 'P') ou (resultado == 'p')) {
				pontosPal+= 0
			} senao se (resultado == 'E') {
				pontosPal+= 1
			} senao se (resultado == 'G') {
				pontosPal+= 3
			}
			escreva("São Paulo - ")
			escreva("Ganhou, Perdeu, Empatou: ")
			leia(resultado)
			se ((resultado == 'P') ou (resultado == 'p')) {
				pontosSao+= 0
			} senao se (resultado == 'E') {
				pontosSao+= 1
			} senao se (resultado == 'G') {
				pontosSao+= 3
			}
			escreva("Santos - ")
			escreva("Ganhou, Perdeu, Empatou: ")
			leia(resultado)
			se ((resultado == 'P') ou (resultado == 'p')) {
				pontosSan+= 0
			} senao se (resultado == 'E') {
				pontosSan+= 1
			} senao se (resultado == 'G') {
				pontosSan+= 3
			}
		}

		escreva("RESULTADO FINAL: \n")
		escreva("Corinthians: " + pontosCor + "\n")
		escreva("Palmeiras: " + pontosPal + "\n")
		escreva("São Paulo: " + pontosSao + "\n")
		escreva("Santos: " + pontosSan + "\n")
	}
}


/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1301; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */