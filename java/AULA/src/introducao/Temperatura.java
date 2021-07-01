package introducao;

public class Temperatura {

	public static void main(String[] args) {
		
		String nome = "fulaninho";
		double c = 26.00;
		double f = (c * 9/5) + 32;
		double k = c+273.15;
		
		
		System.out.printf("oi %s com a temperatura em Celsius %.2f em Farenheight temos %.2f",nome,c,f);		
		System.out.printf("\ne em kelvin temos %.2f",k);

	}

}
