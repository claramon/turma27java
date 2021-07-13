package Programas_POO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cad_Churras {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		
		List <Integer> listaPontos=new ArrayList<>();//=>tem que usar a classe do int (tipo)
		List <String> listaChurras=new ArrayList<>();
		
		
		listaChurras.add("REFRIGERANTE");
		listaChurras.add("PÃO DE ALHO");
		listaChurras.add("QUEIJO COALHO");
		listaChurras.add("CARNE DE JACA");
		listaChurras.add("CEREJA");
		listaChurras.add("ABACAXI");
		listaChurras.add("FAROFA");
		listaChurras.add("PICANHA");
		listaChurras.add("ASA DE FRANGO");
		listaChurras.add("LINGUIÇA APIMENTADA");
		
		for(String item : listaChurras) {
			System.out.println("item: "+item);
		}

		System.out.println("tamanho atual da lista: "+listaChurras.size());
		
		
		listaChurras.add(1,"TANG");
		
		System.out.println("nova lista");
		for(String item : listaChurras) {
			System.out.println("item: "+item);
		}
		
		System.out.println("tamanho atual da lista: "+listaChurras.size());
		
		listaChurras.remove(4);//=>index (começa no zero)
		
		System.out.println("nova lista sem a cerva");
		for(String item : listaChurras) {
			System.out.println("item: "+item);
		}
		
	}

}
