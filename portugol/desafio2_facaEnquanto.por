programa
{

    funcao inicio()
    {

        //numeros inteiros numero for impar e multiplo de 3 vc dever somar
        // media desses numeros multiplos de 3 e impares
        //se o usuario digita 0 o programa terminar
        //mostrar qual foi o maior numero multiplo de 3 e impar digitado

        //variaveis
        inteiro numero =0
        inteiro totalImparMultiplo3=0
        real contador3impar=0.00
        real media3impar=0.00
        inteiro maiorNumero=0

        //entrada
        faca {
            escreva("Digite o numero positivo inteiro:")
            leia(numero)
            se ( ((numero%2)==1) e ((numero%3)==0) ){
                //totalImparMultiplo3 = totalImparMultiplo3 + numero
                totalImparMultiplo3 += numero //totalizador
                contador3impar++ //quantos valores foram digitados
                se (numero > maiorNumero) //para achar o maior ou menor
                {

                    maiorNumero = numero //29
                }

            }

        } enquanto (numero != 0)

        //saida
        media3impar = totalImparMultiplo3 / contador3impar
        escreva("Media dos numeros impares multiplos de 3 :"+media3impar+"\n")
        escreva("Maior numero digitado foi "+maiorNumero+"\n")
        escreva("FIM DE PROGRAMA")

    }
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1306; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */