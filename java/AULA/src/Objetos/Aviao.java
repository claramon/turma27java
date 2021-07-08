package Objetos;

public class Aviao {
	
		public int velocidade;
		public String modelo;
		public boolean noAr;
		public String tipo;
		public boolean ligado;
		
		
		public void voaAviao() {
			for(int x=0;x<10;x++) {
				aceleraAviao();	
			}
			noAr = true;
			System.out.println("tripulação preparar para decolagem...");
		}
		
		public void ligaAviao() {
			ligado = true;
			System.out.println("ligando...");
		}
		public void desligaAviao() {
			ligado = false;
			System.out.println("desligando...");
		}
		
		public void pousaAviao() {
			for(int x=0;x<10;x++) {
				desaceleraAviao();
			}
				noAr=false;
				System.out.println("obrigado por escolher a FlyJed!!");
		}
		
		public int aceleraAviao() {
			return velocidade++;
		}
		public int aceleraAviao(int acrescimo) {
			return velocidade+=acrescimo;
		}
		public int desaceleraAviao() {
			return velocidade--;
		}
		public int desaceleraAviao(int decrescimo) {
			return velocidade-=decrescimo;
		}
		
			
		
}
