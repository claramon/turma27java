package Programas_POO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Objetos.Time;

public class Paulistinha_POO {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		List<Time> tabela = new ArrayList<>();//=> puxa o "tipo" da classe Time
		
		
		tabela.add(new Time("PALMEIRAS"));
		tabela.add(new Time("SANTOS"));
		tabela.add(new Time("SPFC"));
		tabela.add(new Time("CORINTHIANS"));
		
		
		System.out.println(tabela.get(3).getNome().toUpperCase());//pega o item na posição 3(de 0 à 3), e o nome
		
		
		for(Time e : tabela) {
			System.out.println("time de SP: "+e.getNome());
		}
		
	}

}
