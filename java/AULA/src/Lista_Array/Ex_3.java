package Lista_Array;

import java.util.Scanner;

/*
 Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma posição das matrizes N1 e N2.
 */

public class Ex_3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);

		int N1[][] = new int [4][6];
		int N2[][] = new int [4][6];
		int M1[][] = new int [4][6];
		int M2[][] = new int [4][6];
		int linha=0;
		int coluna=0;
		
		for(linha=0;linha<4;linha++) {
			for(coluna=0;coluna<6;coluna++) {
				System.out.println("digite valor de "+linha+" - "+ coluna+ " N1: ");
				N1[linha][coluna] = leia.nextInt();
				System.out.println("digite valor de "+linha+" - "+ coluna+ " N2: ");
				N2[linha][coluna] = leia.nextInt();
				
				M1[linha][coluna]=N1[linha][coluna]+N2[linha][coluna];
				M2[linha][coluna]=N1[linha][coluna]-N2[linha][coluna];
			}
		}
		System.out.println("M1: "+M1[linha][coluna]);
		System.out.println("M2: "+M2[linha][coluna]);
		
	}

}
