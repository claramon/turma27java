package Programas_POO;

import Objetos.Cachorro;
import Objetos.Cavalo;
import Objetos.Preguica;

public class Ex2_Animais {

	public static void main(String[] args) {
		
		Cachorro dog1 = new Cachorro("Marley", 7, true);
		Cavalo pocoto1 = new Cavalo("Spirit", 15, true);
		Preguica preg1 = new Preguica("Flecha", 3, true);
		
		
		System.out.println("PRIMEIRO ANIMAL: CACHORRO");
		System.out.println("nome: "+dog1.getNome());
		System.out.println(("idade: "+dog1.getIdade()));
		System.out.println("ele corre? "+dog1.getCorre());
		dog1.emiteSom();
		System.out.println();
		
		System.out.println("SEGUNDO ANIMAL: CAVALO");
		System.out.println("nome: "+pocoto1.getNome());
		System.out.println(("idade: "+pocoto1.getIdade()));
		System.out.println("ele corre? "+pocoto1.getCorre());
		pocoto1.emiteSom();
		System.out.println();
		
		System.out.println("TERCEIRO ANIMAL: PREGUIÇA");
		System.out.println("nome: "+preg1.getNome());
		System.out.println(("idade: "+preg1.getIdade()));
		System.out.println("ele sobe em árvore? "+preg1.getSobeArvore());
		preg1.emiteSom();
		System.out.println();
	}

}
