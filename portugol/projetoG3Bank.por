//G3 Bank
//Seu dinheiro em desenvolvimento.
programa{
	inclua biblioteca Util
	inclua biblioteca Matematica --> mat
	
	funcao inicio(){
	
		cadeia Menu[6]={"Conta Poupança","Conta Corrente","Conta Especial","Conta Empresa","Conta Estudante","Sair"}
		inteiro op
		inteiro conta
		caracter continuar, voltaMenu	

		limpa()
		escreva("Bem Vinde ao Banco G3")
		escreva("\nSeu dinheiro em desenvolvimento!\n")
		escreva("\n")

		para(inteiro x=0; x<6; x++){
			escreva(x,"-",Menu[x],"\n")
		}
		
		escreva("\nEscolha a opção desejada:")
		leia(op)

//OPÇÕES DE CONTA PARA ABRIR CÓDIGO EM SE
		se(op<0 ou op>5){
			escreva("Opção invalida!\n")
			escreva("\nDeseja voltar ao Menu principal? S-Sim ou N-Não: ")
			leia(voltaMenu)
			se(voltaMenu=='s' ou voltaMenu=='S'){
			inicio()
			} senao {
			limpa()
			escreva("Volte Sempre!\n")
			escreva("Banco G3")
			escreva("\nSeu dinheiro em desenvolvimento!\n")
			}

		}senao se (op==0){
 //Conta Poupança
 //CLARA
		real saldo=0.00,saldoPoupanca=0.00 
		caracter opP//operação débito crédito poupança
		inteiro numero //equivale ao número da conta

  		  	limpa()
		  	escreva("Banco G3")
			escreva("\nSeu dinheiro em desenvolvimento!\n")
			escreva("\n")
			escreva("Tipo:",Menu[op],"\n\n")
			conta = Util.sorteia(000000,999999)
			escreva("Número: ",conta,"-0")
			escreva("\n\nFaça um crédito para iniciar sua conta.\n")

			para(inteiro x=1;x<=10;x++){
				caracter confirma
				inteiro valor
				caracter saldoInsuficiente = 'S'

				confirma='z'
				opP='z'
				valor=0
				
				escreva("Operação numero "+x+"\n\n")
				escreva("Saldo atual da poupança: "+saldoPoupanca+"\n\n")

				//pergunta operação
				enquanto (confirma!='S' e confirma!='N' e confirma!='s' e confirma!='n'){
					escreva("Deseja fazer uma operação? S-Sim ou N-Não: ")
					leia(confirma)
					se (confirma!='S' e confirma!='N' e confirma!='s' e confirma!='n'){
						escreva("Senhor(a), tem que ser S ou N. Tente de novo...\n\n")
					}
				}	
						
				//pergunta débito crédito			
				se(confirma=='s' ou confirma=='S'){
				enquanto (opP!='D' e opP!='C' e opP!='d' e opP!='c'){
					escreva("Qual movimentação deseja realizar? D-Débito ou C-Credito: ")
					leia(opP)
					se (opP!='D' e opP!='C' e opP!='d' e opP!='c'){
						escreva("Senhor(a), tem que ser D ou C. Tente de novo...\n\n")
					}
				}

					//limpa()
					escreva("Qual o valor da operação? ")
					leia(valor)

				//se o valor de saque for maior que o saldo, transação inválida
				se(opP=='D' ou opP=='d'){
					enquanto(saldoInsuficiente=='S'){

						se(valor>saldoPoupanca){
							escreva("Saldo insuficiente\n")
							escreva("Saldo atual: "+saldoPoupanca)
							escreva("\n Digite o valor a debitar: (para sair use 0) ")
							leia(valor)
							
						}senao{
							//escreva("\nConta poupança zerada. Faça um crédito para continuar.")
							//escreva("\nQual movimentação deseja realizar? D-Débito ou C-Credito: ")
							//leia(opP)
							saldoInsuficiente='N'
						}
					}
				}
				//não pode valor negativo
				se(opP=='D' ou opP=='d'){
					se(valor<0){
						escreva("O valor digitado é inválido\n")
						escreva("\n Digite o valor a debitar (para sair use 0) : ")
						leia(valor)
				}
					}
				//não pode valor negativo
				se(opP=='C' ou opP=='c'){
					se(valor<=0){
						escreva("O valor digitado é inválido\n")
						escreva("Digite o valor a creditar (para sair use 0) :")
						leia(valor)
					}
				}
				//confirma operação débito ou crédito
				enquanto (confirma!='S' e confirma!='N' e confirma!='s' e confirma!='n'){
					escreva("Confirma operação? S-Sim ou N-Não: ")
					leia(confirma)
					se (confirma!='S' e confirma!='N' e confirma!='s' e confirma!='n'){
						escreva("Senhor(a), tem que ser S ou N. Tente de novo...\n\n")
					} senao se (confirma=='n' ou confirma=='N'){
						pare
						}
				}
				//transação débito crédito
				se(confirma=='s' ou confirma=='S'){
					se(opP=='d' ou opP=='D'){
						saldoPoupanca -= valor
					} senao se(opP=='c' ou opP=='C'){
						saldoPoupanca += valor
					}
				}senao{
					pare
				}
			}senao{
				escreva("Limite de transações diárias atingido. Siga para informar a data de hoje")
				pare
			}
			
			}
			escreva("Saldo final do dia: "+saldoPoupanca+"\n\n")
			//informar o dia, para ver se é aniversário
			inteiro dia
			escreva("Digite o dia de hoje: ")
			leia(dia)
			se (dia==5){
				saldoPoupanca=saldoPoupanca*1.05	
				escreva("Saldo data de Aniversário: "+mat.arredondar(saldoPoupanca, 2)+"\n\n")
			}//ADIÇÃO DE TITULO DE CAPITALIZAÇÃO
			se(saldoPoupanca>=20){
				caracter titulo 
				escreva("Deseja fazer um título de capitalização?? Hoje pode ser seu dia de sorte!! \n")
				escreva("OBS: será debitado de sua conta poupança \n")
				escreva("Digite 'S' para confirmar:")
				leia(titulo)
				se(titulo=='s' ou titulo=='S'){
					saldoPoupanca -= 20
					escreva("Transação efetuada \n")
					escreva("Saldo atual: "+saldoPoupanca+"\n")
				}senao{
				escreva("Transação finalizada")
				}
			}
		
		 		escreva("\n\nDeseja voltar ao Menu principal? S-Sim ou N-Não: ")
				leia(voltaMenu)
					se(voltaMenu=='s' ou voltaMenu=='S'){
						inicio()
					} senao {
						limpa()
						escreva("\n\nVolte Sempre!\n")
			               escreva("Banco G3")
						escreva("\nSeu dinheiro em desenvolvimento!\n")
				  	}


		} senao se (op==1){
 //Conta Corrente
//JEFFERSON
		limpa()
		escreva("Void\n")
				escreva("       Void\n")
						escreva("              Void\n")

		escreva("\n\nDeseja voltar ao Menu principal? S-Sim ou N-Não: ")
				leia(voltaMenu)
					se(voltaMenu=='s' ou voltaMenu=='S'){
						inicio()
					} senao {
						limpa()
						escreva("\n\nVolte Sempre!\n")
			               escreva("Banco G3")
						escreva("\nSeu dinheiro em desenvolvimento!\n")
				  	}
			
		} senao se (op==2){
 // Conta Especial
 //JAQUELINE		
	          real saldo=0.00
			caracter movimento//opção de d,D é débito e c,C é crédito
			//inteiro numero //equivale ao número da conta
			real valorMovimento=0.00
			real limiteEspecial=1000.00
			inteiro extrato
			//real saldoFinal=0.00
			real saldoVariavel=0.00
			inteiro interacao=1

				limpa()
				escreva("Banco G3")
				escreva("\nSeu dinheiro em desenvolvimento!\n")
				escreva("\n")
				escreva("Tipo:",Menu[op],"\n")
				conta = Util.sorteia(000000,999999)
				escreva("Número: ",conta,"-2")
				
				para(extrato=0; extrato<=9; extrato++){
					escreva("\n\nTransação nº",interacao)
					escreva("\nSaldo Atual R$: ",saldo)
					escreva("\nSaldo Limite Especial R$: ",limiteEspecial)
		               escreva("\nMovimento:D-debito ou C-Crédito: ")
					leia(movimento)
					escreva("Valor do movimento R$: ")
					leia(valorMovimento)
					se(valorMovimento<=0){
						escreva("O valor digitado é negativo ou zero e não pode ser computado")
					} senao se(movimento!='d' e movimento!='D' e movimento!='c' e movimento!='C'){
							escreva("Opção de transação inválida! \n")					
						} senao se(movimento=='D' ou movimento=='d'){
							se(valorMovimento>saldo+limiteEspecial /*e valorMovimento>limiteEspecial*/){
								escreva("Não há saldo para essa transação. Faça um crédito para continuar!\n")
							}senao se(saldo>=valorMovimento){
								saldo-=valorMovimento
							} senao se (saldo==0){
								saldo+=valorMovimento //registro para entrar no saldo e sair do saldo
								limiteEspecial-=valorMovimento
								saldo-=valorMovimento
							} senao se (saldo < valorMovimento){
							  	saldoVariavel=valorMovimento-saldo
							  	limiteEspecial-=saldoVariavel
							  	saldo=0.00
							}
						}
					senao se(movimento=='C' ou movimento=='c'){
							saldo+=valorMovimento
	                    }
	                    interacao++
	                    escreva("\nDeseja continuar S-Sim ou N-Nao: ")
	                    leia(continuar)
	                    se(continuar=='n' ou continuar=='N'){
		                    escreva("\nSaldo Atual R$: ",saldo)
						escreva("\nSaldo Limite Especial R$: ",limiteEspecial)
						pare
	                        }
	               } se(interacao>10){
	               	escreva("\nLimite de 10 movimentações excedido.")    
	               }           
				escreva("\n\nDeseja voltar ao Menu principal? S-Sim ou N-Não: ")
				leia(voltaMenu)
					se(voltaMenu=='s' ou voltaMenu=='S'){
						inicio()
					} senao {
						limpa()
						escreva("\n\nVolte Sempre!\n")
			               escreva("Banco G3")
						escreva("\nSeu dinheiro em desenvolvimento!\n")
				  	}
		  	
		} senao se (op==3){
//Conta Empresa 
 //- W. LUAN			
		real emprestimoEmpresa=0.00, valorCliente=0.00                      
		real saldo=0.00, emprestimo=10000.00
		caracter emprestimoCliente,transacaoCliente
		inteiro contD=0
		
		limpa()
		escreva("Banco G3")
		escreva("\nSeu dinheiro em desenvolvimento!\n")
		escreva("\n")
		escreva("Tipo:",Menu[op],"\n")
		conta = Util.sorteia(000000,999999)
		escreva("Número: ",conta,"-3")
		escreva("\nTemos uma opção de emprestimo para sua empresa, seu limite é de até R$ 10.000!!!\n")


	     para (inteiro cont=0;cont<10;cont++){
	     	escreva("\nSaldo atual: R$ "+saldo +"\nLimite para emprestimo: "+emprestimo)
	      	escreva("\nGostaria de um emprestimo? S-Sim N-Não: ")
	     	leia(emprestimoCliente)

	     	se (emprestimoCliente == 'S' ou emprestimoCliente == 's' ){
	     		escreva("Digite o valor do emprestimo de até R$ 10.000: ")
				leia(emprestimoEmpresa)
				se(emprestimoEmpresa<=0){
				escreva("O valor digitado é negativo ou zero e não pode ser computado")
				} senao se(emprestimoEmpresa>10000.00){
					escreva("Seu limite de emprestimo é R$10.000 o valor de R$",emprestimoEmpresa," é superior")
				} senao{
				saldo = saldo + emprestimoEmpresa
				emprestimo = emprestimo - emprestimoEmpresa
				escreva("Saldo atual: R$ "+saldo +"\nLimite para emprestimo: "+emprestimo)
				}
	     	}senao se(emprestimoCliente == 'N' ou emprestimoCliente == 'n' ) {	

				escreva("\nSaldo atual: R$ "+saldo +"\nLimite para emprestimo: "+emprestimo)
				
	     	}
				     escreva("\nSelecione a transação D-Débito C-Crédito: ")
					leia(transacaoCliente)
					escreva("Qual é o valor da transação? ")
					leia(valorCliente)
					se(valorCliente<=0.00){
					escreva("O valor digitado é negativo ou zero e não pode ser computado") }
					
					senao se(transacaoCliente == 'D' ou transacaoCliente == 'd'){
						contD++
						se(saldo==0.00){
							escreva("Você não tem saldo,faça um emprestimo ou Credito")
						}senao se(valorCliente >saldo){
							escreva("Você não tem saldo suficiente, faça um emprestimo ou Credito")
						}
						senao{
							saldo = saldo - valorCliente	
							escreva("Transação nº"+contD+" Movimento: Debito R$ "+ valorCliente)
						}
	     			}senao se(transacaoCliente == 'C' ou transacaoCliente == 'c'){
						contD++
						saldo = saldo + valorCliente	
					     escreva("Transação nº"+contD+" Movimento: credito R$ "+ valorCliente)	     
	     			}
				escreva("\n\nDeseja continuar S-Sim ou N-Nao: ")
                         leia(continuar)
                             se(continuar=='n' ou continuar=='N'){
                                 escreva("\nSaldo atual: R$ "+saldo +"\nLimite para emprestimo: "+emprestimo)
                                 pare
                             }
				 
	     	} se(contD>=10){
	     		escreva("\nLimite de 10 movimentações excedido.")
	     		}
				escreva("\nDeseja voltar ao Menu principal? S-Sim ou N-Não: ")
            		leia(voltaMenu)
                		se(voltaMenu=='s' ou voltaMenu=='S'){
                   		 inicio()
                } senao {
                	limpa()
                    escreva("\n\nVolte Sempre!\n")
                    escreva("Banco G3")
                    escreva("\nSeu dinheiro em desenvolvimento!\n")
                  }
			
		
		} senao se (op==4){
//Conta Estudante
//GU AUGUSTO

		  	real emprestimoEstudante=0.0, valorCliente=0.00
			real saldo=0.00, emprestimo=5000.00
			caracter emprestimoCliente,transacaoCliente
			inteiro contD=0
			limpa()			
			escreva("Banco G3")
			escreva("\nSeu dinheiro em desenvolvimento!\n")
			escreva("\n")
			escreva("Tipo:",Menu[op],"\n")
			conta = Util.sorteia(000000,999999)
			escreva("Número: ",conta,"-4")
			escreva("\nOlá Estudante! Temos uma opção de emprestimo de até R$ 5.000! Aproveite!!\n")
			
			para (inteiro x=0;x<10;x++){
				
				escreva("\nSaldo atual: R$ "+saldo +"\nLimite para emprestimo: "+emprestimo)
 				escreva("\nGostaria de um emprestimo? S-Sim N-Não: ")
 				leia(emprestimoCliente)

					se (emprestimoCliente == 'S' ou emprestimoCliente == 's' )
					{
							escreva("Digite o valor do emprestimo de até R$ 5.000: ")
							leia(emprestimoEstudante)
							
							se(emprestimoEstudante<=0)
							{
							escreva("O valor digitado é negativo ou zero e não pode ser computado")
							} senao se(emprestimoEstudante>5000.00)
							{
							escreva("Seu limite de emprestimo é R$5.000 o valor de R$",emprestimoEstudante," é superior")
							} senao
							{
							saldo += emprestimoEstudante
							emprestimo -= emprestimoEstudante
							escreva("Saldo atual: R$ "+saldo +"\nLimite para emprestimo: "+emprestimo)
							}
					}senao se(emprestimoCliente == 'N' ou emprestimoCliente == 'n' ) 
							{
		          			escreva("\nSaldo atual: R$ "+saldo +"\nLimite para emprestimo: "+emprestimo)
		  					}escreva("\nSelecione a transação D-Débito C-Crédito: ")
		                    	leia(transacaoCliente)
		                    	escreva("Qual é o valor da transação? ")
		                    	leia(valorCliente)
						
						se(valorCliente<=0){
				                    escreva("O valor digitado é negativo ou zero e não pode ser computado") 
				                    }
						senao se(transacaoCliente == 'D' ou transacaoCliente == 'd')
								{
				                    contD++
				                    se(saldo==0.0)
				                    {
				                    escreva("Você não tem saldo,faça um emprestimo ou Credito")
				                    }senao se(valorCliente >saldo)
				                    {
				                    escreva("Você não tem saldo suficiente, faça um emprestimo ou Credito")
				                    }
				                    senao
				                    {
				                    saldo = saldo - valorCliente
				                    escreva("Transação nº"+contD+" - Movimento: Debito R$ "+ valorCliente)
				                    }
						 }senao se(transacaoCliente == 'C' ou transacaoCliente == 'c')
				                    {
				                    contD++
				                    saldo = saldo + valorCliente
				                    escreva("Transação nº"+contD+" - Movimento: Credito R$ "+ valorCliente)
				                    }
					escreva("\n\nDeseja continuar S-Sim ou N-Nao: ")
					leia(continuar)
					se(continuar=='n' ou continuar=='N')
					{
					escreva("\nSaldo atual: R$ "+saldo +"\nLimite para emprestimo: "+emprestimo)
					pare
					}
					}se(contD>=10)
					{
                 		escreva("\nLimite de 10 movimentações excedido.")
                 		}

					escreva("\nDeseja voltar ao Menu principal? S-Sim ou N-Não: ")
					leia(voltaMenu)
					se(voltaMenu=='s' ou voltaMenu=='S')
					{
					inicio()
					} senao 
					{
					limpa()
					escreva("\n\nVolte Sempre!\n") 
					escreva("Banco G3")
					escreva("\nSeu dinheiro em desenvolvimento!\n")
					}

			
		} senao se (op==5){
//SAIR DO BANCO!
			limpa()
			escreva("Sistema finalizado!")
			escreva("\nVolte Sempre!")
			escreva("\n\nBanco G3")
			escreva("\nSeu dinheiro em desenvolvimento!\n")
		}
	escreva("\n\n\n\nFim do programa!")
	}	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2391; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */