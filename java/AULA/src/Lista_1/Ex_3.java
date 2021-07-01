package Lista_1;

import java.util.Scanner;

public class Ex_3 {
	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int totalSeg, s, m, h;
		
		System.out.println("quantos segundos? ");
		totalSeg = leia.nextInt();
		
		h = totalSeg/3600;
		m = (totalSeg%3600)/60;
		s = (totalSeg%3600)%60;
		System.out.println("duração do evento em horas: "+h+", minutos: "+m+" e segundos: "+s);
		
	}
}
