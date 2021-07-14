package Objetos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SomaTest2 extends Soma{

	Soma ex1 = new Soma();
	
	public void testSomar() {
		int somatorio=ex1.somar(10, 10);
		
		assertEquals(30,somatorio);
	}
}
