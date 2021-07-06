package Lista_laco_repeticao;

public class Ex_1 {

	//Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5. (FOR)
	
	public static void main(String[] args) {
		
		int contador=0;
		
		
		for(contador=1000;contador<=1999;contador++) {//começa em 1000 e vai até 1999
			if(contador%11 == 5) {
				System.out.printf("\n %d",contador);
			}
		}

	}

}
