package introducao;

import java.util.Scanner;

public class Agenda_ArrayMatriz {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		String agenda[][] = new String[24][31];//24 horas 31 dias
		
		agenda [11][6]="FAZER PROGRAMA EM JAVA";
		agenda [17][7]="BAROMETRO";
		
		
		for(int hora=0;hora<24;hora++) {
			for(int dia=0;dia<31;dia++) {
				if(agenda [hora][dia] != null) {
					System.out.println("dia "+dia+" - hora "+dia+": "+agenda[hora][dia]);
				}
				
			}
		}
		
	}

}
