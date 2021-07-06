package introducao;

import java.util.Scanner;

public class Projeto_loja_array {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		String produtos[] = {"CAMISA", "CALÇA","BERMUDA"};
		double precos[] = new double[3];
		int estoque[] = new int[3];
		String codigo[] = new String[3];
		char op;
		int carrinho[] = new int[3];
		String auxCodigo;
		int auxQtde;
		char fecha; 
		double imposto=0.00;
		double total=0.00;
		precos[0] = 100.00;
		precos[1] = 150.00;
		precos[2] = 50.55;
		
		//montando a primeira entrada
		
		for (int x=0; x<3; x++) {
			codigo[x]="EJ-0"+(x+1);
			estoque[x] = 10;
		}
		
		do {
			System.out.println("CODIGO\tPRODUTO\tESTOQUE\tPREÇO");
			for (int x=0; x<3; x++) {
				System.out.println(codigo[x]+"\t"+produtos[x]+"\t"+estoque[x]+"\t"+precos[x]);
			}
			System.out.println("Carrinho:");
			System.out.println("CODIGO\tPRODUTO\tESTOQUE\tPREÇO\tCOMPRA\tSUB-TOTAL");
			for (int x=0; x<3; x++) {
				
				if(carrinho[x]!=0) {
					
					System.out.println(codigo[x]+"\t"+produtos[x]+"\t"+estoque[x]+"\t"+precos[x]+"\t"+carrinho[x]+"\t"+(carrinho[x]*precos[x]));			
				}
			}
			
			
			System.out.print("Digite o codigo do produto que deseja compra: ");
			auxCodigo = leia.next().toUpperCase();
			for (int x=0; x<3; x++) {
				if (codigo[x].equals(auxCodigo)) {
					System.out.println("PRODUTO SELECIONADO");
					System.out.println("CODIGO\tPRODUTO\tESTOQUE\tPREÇO");
					System.out.println(codigo[x]+"\t"+produtos[x]+"\t"+estoque[x]+"\t"+precos[x]);
					if (estoque[x]==0) {
						System.out.println("Impossivel realizar!!");
					} else {
						System.out.print("Qual quantidade vc deseja: ");
						auxQtde= leia.nextInt();
						if (auxQtde > estoque[x] ) {
							System.out.println("Valor invalido!!!");
						}
						else {
							carrinho[x] = auxQtde;
						}
					}
				}
			}
			System.out.print("Finalizar a compra S/N? ");
			fecha = leia.next().toUpperCase().charAt(0);
			if (fecha =='S') {
				for (int x=0; x<3; x++) {
					total=total+(carrinho[x]*precos[x]);
				}
				imposto = total*0.09;
				System.out.println("NOTA FISCAL");
				System.out.println();
				System.out.println("CODIGO\tPRODUTO\tPREÇO\tCOMPRA\tSUB-TOTAL");
				for (int x=0; x<3; x++) {
					
					if(carrinho[x]!=0) {
						
						System.out.println(codigo[x]+"\t"+produtos[x]+"\t"+precos[x]+"\t"+carrinho[x]+"\t"+(carrinho[x]*precos[x]));			
					}
				}
				System.out.println("Valor imposto 9% :"+imposto);
				System.out.println("Valor total da compra: R$ "+total);
				for (int x=0; x<3; x++) {
					if(carrinho[x]>0) {
					   estoque[x]-=carrinho[x];
					  // estoque[x]=estoque[x]-carrinho[x];
					   carrinho[x]=0;
					}
					
				}
				
			}
			System.out.println("Continua S/N");
			op = leia.next().toUpperCase().charAt(0);
		} while (op =='S');
		System.out.println("VOLTE SEMPRE, COMPRE MAIS!!!");
	}

}