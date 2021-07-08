package Programas_POO;

import java.util.Scanner;

import Objetos.Aviao;

/*
 * Crie uma classe avião e apresente os atributos e métodos referentes esta classe, em seguida crie um
 * objeto avião, defina as instancias deste objeto e apresente as informações deste objeto no console.
 */

public class Ex_2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		Aviao aeronave1 = new Aviao();
	
				
		aeronave1.modelo="BIMOTOR";
		aeronave1.tipo="PASSAGEIRO 14 LUGARES";
		aeronave1.noAr=false;
		aeronave1.ligado=false;
		aeronave1.velocidade=0;
		
		//vamo colocar o avião pra voar
		aeronave1.ligaAviao();
		aeronave1.aceleraAviao();
		aeronave1.aceleraAviao();
		aeronave1.aceleraAviao();
		aeronave1.desaceleraAviao();
		aeronave1.desaceleraAviao();
		aeronave1.desaceleraAviao();
		aeronave1.voaAviao();
		aeronave1.aceleraAviao(40);
		System.out.println("velocimentro atual: "+aeronave1.velocidade+" NO AR "+aeronave1.noAr+" LIGADO "+aeronave1.ligado);
		aeronave1.desaceleraAviao(39);
		System.out.println("velocimentro atual: "+aeronave1.velocidade+" NO AR "+aeronave1.noAr+" LIGADO "+aeronave1.ligado);
		aeronave1.pousaAviao();
		System.out.println("velocimentro atual: "+aeronave1.velocidade+" NO AR "+aeronave1.noAr+" LIGADO "+aeronave1.ligado);
		}
		
		
	}



