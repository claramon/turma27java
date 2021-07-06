package Lista_Array;

import java.util.Scanner;

/*
 * Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e em seguida, exiba 
 * a soma dos valores dela e a soma dos valores da primeira diagonal, ou seja, diagonal principal.
 */

public class Ex_4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int M[][] = new int[3][3];
		int somaMatriz=0;
		int somaDiagonal=0;
		int linha=0;
		int coluna=0;
		
		for(linha=0;linha<3;linha++) {
			for(coluna=0;coluna<3;coluna++) {
				System.out.println("digite valor de "+linha+" - "+ coluna+ " M: ");
				M[linha][coluna] = leia.nextInt();	
			}
		}
		for(linha=0;linha<3;linha++) {
			for(coluna=0;coluna<3;coluna++) {
				somaMatriz += M[linha][coluna];
				somaDiagonal = M[0][0]+M[1][1]+M[2][2];
				
				/*
				 * if (M[linha][linha] == M[coluna][coluna]){
		 			somaDiagonal += M[linha][linha]
				 */
			}
		}
		System.out.println("soma matriz: "+somaMatriz);
		System.out.println("soma diagonal matriz: "+somaDiagonal);
	}

}
