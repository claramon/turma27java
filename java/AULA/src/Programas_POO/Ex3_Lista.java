package Programas_POO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex3_Lista {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		List <String> listaEstoque=new ArrayList<>();
		
		listaEstoque.add("BALA");
		listaEstoque.add("SORVETE");
		listaEstoque.add("BRIGADEIRO");
		listaEstoque.add("CHICLETE");
		listaEstoque.add("BOLACHA");
		listaEstoque.add("BOLO");
		listaEstoque.add("MUSSE");
		listaEstoque.add("COOKIE");
		listaEstoque.add("BIS");
		listaEstoque.add("ROSQUINHAS");
		
		for(String item : listaEstoque) {
			System.out.println("doce: "+item);
		}

		System.out.println("tamanho atual da lista: "+listaEstoque.size());
		
		listaEstoque.remove("BOLO");
		
		for(String item : listaEstoque) {
			System.out.println("doce: "+item);
		}
		
		System.out.println("tamanho atual da lista: "+listaEstoque.size());
		
	}

}
