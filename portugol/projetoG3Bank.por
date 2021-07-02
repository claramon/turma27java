//G3 Bank
//Seu dinheiro em desenvolvimento.

//conta especial não avisa o usuario, não depende dele, se o saque for maior que o saldo aceita o limite
//automaticamente.
programa{
	inclua biblioteca Util
	
	funcao inicio(){
	
		cadeia Menu[6]={"Conta Poupança","Conta Corrente","Conta Especial","Conta Empresa","Conta Estudante","Sair"}
		inteiro op
		real saldo=0.00
		caracter d,D,c,C //opção de d,D é débito e c,C é crédito
		inteiro numero //equivale ao número da conta

		
		
		escreva("Bem Vinde ao Banco G3")
		escreva("\nSeu dinheiro em desenvolvimento!\n")
		escreva("\n")

		para(inteiro x=0; x<6; x++){
			escreva(x,"-",Menu[x],"\n")
		}
		
		escreva("\nEscolha a opção desejada:")
		leia(op)
//espaço reservado para códigos das operações

		escolha(op) {//codigo da conta poupança
		caso 0:      
		  	limpa()
		  	escreva("Banco G3")
			escreva("\nSeu dinheiro em desenvolvimento!\n")
			escreva("\n")
			escreva("Tipo:",Menu[op],"\n")
			
			
			
		pare
		
		caso 5:      
		  	limpa()
			escreva("Sistema finalizado!")
			escreva("\nVolte Sempre!")
			escreva("\n\nBanco G3")
			escreva("\nSeu dinheiro em desenvolvimento!\n")
		pare
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 952; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */