package introducao;

import java.util.Scanner;

public class Projeto_pastelaria_array {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		String produtos[] = {" QUEIJO ", " CARNE "," PIZZA "," CAMARAO "," BANANA "," PIZZA "," ROMEU JULIETA "," CARNE SECA "," BACALHAU "," BAURU "  };
		double precos[] = new double[10];
		int estoque[] = new int[10];
		String codigo[] = new String[10];
		char op;
		int sacola[] = new int[10];
		String auxCodigo;
		int auxQtde;
		char fecha; 
		double imposto=0.00;
		double total=0.00;
		precos[0] = 6.00;
		precos[1] = 6.00;
		precos[2] = 6.00;
		precos[3] = 10.00;
		precos[4] = 7.00;
		precos[5] = 6.00;
		precos[6] = 8.00;
		precos[7] = 8.00;
		precos[8] = 12.00;
		precos[9] = 6.00;
		//montando a primeira entrada

		for (int x=0; x<10; x++) {
			codigo[x]="G4-0"+(x+1);
			estoque[x] = 10;
		}

		do {
			       System.out.println("BEM VINDOS A ED+\n");
			System.out.println("\n TODO DIA É DIA DE COMER PASTEL ! ! !  ");
			for (int x=0; x<10; x++) {
				System.out.println(codigo[x]+"\t"+produtos[x]+"\t"+estoque[x]+"\t"+precos[x]);
			}
			System.out.println("SACOLA: ");
			System.out.println("CODIGO\tPRODUTO\tESTOQUE\tPREÇO\tCOMPRA\tSUB-TOTAL");
			for (int x=0; x<10; x++) {

				if(sacola[x]!=0) {

					System.out.println(codigo[x]+"\t"+produtos[x]+"\t"+estoque[x]+"\t"+precos[x]+"\t"+sacola[x]+"\t"+(sacola[x]*precos[x]));			
				}
			}


			System.out.print("Digite o codigo de acordo com sabor de sua preferencia: ");
			auxCodigo = leia.next().toUpperCase();
			for (int x=0; x<10; x++) {
				if (codigo[x].equals(auxCodigo)) {
					System.out.println("PRODUTO SELECIONADO");
					System.out.println("CODIGO\tPRODUTO\tESTOQUE\tPREÇO");
					System.out.println(codigo[x]+"\t"+produtos[x]+"\t"+estoque[x]+"\t"+precos[x]);
					if (estoque[x]==0) {
						System.out.println("Impossivel realizar!!");
					} else {
						System.out.print("Qual quantidade voce deseja: ");
						auxQtde= leia.nextInt();
						if (auxQtde > estoque[x] ) {
							System.out.println("Valor invalido!!!");
						}
						else {
							sacola[x] = auxQtde;
						}
					}
				}
			}
			System.out.print("Finalizar a compra S/N? ");
			fecha = leia.next().toUpperCase().charAt(0);
			if (fecha =='S') {
				for (int x=0; x<3; x++) {
					total=total+(sacola[x]*precos[x]);
				}
				imposto = total*0.09;
				System.out.println("NOTA FISCAL ");
				System.out.println();
				System.out.println("CODIGO\tPRODUTO\tPREÇO\tCOMPRA\tSUB-TOTAL");
				for (int x=0; x<10; x++) {

					if(sacola[x]!=0) {

						System.out.println(codigo[x]+"\t"+produtos[x]+"\t"+precos[x]+"\t"+sacola[x]+"\t"+(sacola[x]*precos[x]));			
					}
				}
				System.out.println("Valor imposto 9% : "+imposto);
				System.out.println("Valor total da compra: R$ "+total);
				for (int x=0; x<3; x++) {
					if(sacola[x]>0) {
					   estoque[x]-=sacola[x];
					  // estoque[x]=estoque[x]-carrinho[x];
					   sacola[x]=0;
					}

				}

			}
			System.out.println("Deseja voltar ao Menu S/N: ");
			op = leia.next().toUpperCase().charAt(0);
		} while (op =='S');
		System.out.println("OBRIGADO PELA PREFERENCIA !\n");
		System.out.println(" VOLTE SEMPRE");
	}


	}


