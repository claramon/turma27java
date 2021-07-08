package Objetos;

public class P_Eletronico {

		public String tipo;
		public String modelo;
		public int temperatura;
		public boolean ligado;
		public boolean fritando;
		
				
		public void ligaAirFrier() {
			ligado = true;
		}
		
		public void desligaAirFrier() {
			ligado = false;
		}
		
		public int aqueceAirFrier() {
			return temperatura++;
		}
		
		public int aqueceAirFrier(int acrescimo) {
			return temperatura+=acrescimo;
		}
		
		public int esfriaAirFrier() {
			return temperatura--;
		}
		
		public int esfriaAirFrier(int acrescimo) {
			return temperatura-=acrescimo;
		}
		
		public void fritaAirFrier() {
			for(int x=0;x<5;x++) {
				if(temperatura>10) {
				aqueceAirFrier();	
				fritando=true;
			}
		}
		}
		
		public void paraAirFrier() {
			for(int x=0;x<5;x++) {
				esfriaAirFrier();
			}fritando=false;
		}
}
