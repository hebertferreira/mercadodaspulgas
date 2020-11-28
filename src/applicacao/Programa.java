package applicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Produto;
import entities.ProdutoImportado;
import entities.ProdutoUsado;

public class Programa {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		//Locale.setDefault(Locale.US);
		
		List<Produto> lista = new ArrayList<>();
		
		System.out.println("VAMOS CADASTRAR OS PRODUTOS");
		System.out.print("Quantos produtos são: ");
		int numProdutos = sc.nextInt();
		
		for(int x = 1; x <= numProdutos; x++) {
			System.out.print("O produto é comum, importado, usado(c/u/i)?");
			char tipo = sc.next().charAt(0);
			System.out.print("Qual o nome do produto:");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Qual o valor unitario do produto:");
			Double valorUnitario = sc.nextDouble();
			
			if(tipo == 'c') {
				lista.add(new Produto(nome,valorUnitario));

			}else if(tipo == 'u') {
				System.out.println("Fabricação (dd/MM/yyyy):");
				Date dataF = sdf.parse(sc.next());
				lista.add(new ProdutoUsado(nome, valorUnitario, dataF));				

			}else{
				System.out.println("Infome a taxa de juros: ");
				Double taxaJ = sc.nextDouble();
				lista.add(new ProdutoImportado(nome, valorUnitario, taxaJ));
			}
				
		}
		System.out.println();
		System.out.println(" ==== IMPRIMINDO ====");
		for(Produto prod : lista) {
			System.out.println(prod.imprimirEtiqueta());
		}
		sc.close();
	}

}
