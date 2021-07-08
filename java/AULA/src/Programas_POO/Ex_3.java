package Programas_POO;

import java.util.Scanner;

import Objetos.P_Eletronico;

public class Ex_3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		P_Eletronico airFrier1 = new P_Eletronico();
		
		airFrier1.modelo="AIRFRIER POLISHOP 1234";
		airFrier1.tipo="FRITADEIRA ELÉTRICA";
		airFrier1.ligado=true;
		airFrier1.fritando=true;
		airFrier1.temperatura=0;
		
		airFrier1.ligaAirFrier();
		airFrier1.aqueceAirFrier(50);
		airFrier1.fritaAirFrier();
		System.out.println("temperatura: "+airFrier1.temperatura+" graus, fritando: "+airFrier1.fritando+", ligada? "+airFrier1.ligado);
		airFrier1.esfriaAirFrier(46);
		System.out.println("temperatura: "+airFrier1.temperatura+" graus, fritando: "+airFrier1.fritando+", ligada? "+airFrier1.ligado);
		airFrier1.paraAirFrier();
		System.out.println("temperatura: "+airFrier1.temperatura+" graus, fritando: "+airFrier1.fritando+", ligada? "+airFrier1.ligado);
	}

}
