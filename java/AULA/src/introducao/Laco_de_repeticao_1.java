package introducao;

import java.util.Scanner;

//2- Fa�a um programa que pegue um n�mero do teclado e calcule a soma de todos os n�meros  de 1 at� ele.
//Ex.: o usu�rio entra 7, o programa vai mostrar 28, pois  1+2+3+4+5+6+7=28.


public class Laco_de_repeticao_1 {//WHILE
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero;
		int x=1;//contador
		int aux=1;//para comparar
		
		System.out.println("digite um numero positivo: ");
		numero = leia.nextInt();
		
		if (numero<=0) {//nao da pra fazer a soma at� zero, e tmb n�o soma "pra tr�s"
			System.out.println("numero inv�lido ");
			
		}else if(numero==1){//se tiver que mostrar o 1 (1 n�o tem somat�rio)
			System.out.println("1 = 1");
			
		}else {//la�o at� chegar no numero que a pessoa digitou
			do {//tem que mostra o 1 (primeiro numero do passo) e somar at� o numero digitado
				//aux=(aux+x) soma mais um, depois o aux + 1 => 1+2; 1+3...
				System.out.printf("%d + ",x);
				x++;//pq tem que mudar o numero do x, senao � um looping infinito
				aux=(aux+x);
				
				}while(x<numero);
					System.out.print(x);
					System.out.print(" = "+aux);
			}
		}
	}

	
