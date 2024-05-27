package jean.roseti;

import java.util.Arrays;
import java.util.Scanner;

public class Registro {
	public static void main (String [] args) {
		ApenasNome();
		NomeSexo();
	}

	private static void NomeSexo() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite os nomes e sexo para registro");
		String input = scanner.nextLine();
		
		String[] dados = input.split(",");
		
		Arrays.sort(dados);
		
		System.out.println("Dados cadastrados: ");
			for(String dado: dados) {
				System.out.print(dado);
				 System.out.println("");
			}
			 scanner.close();
	}

	private static void ApenasNome() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
	      
		System.out.println("Digite os nomes registro");
		String input = scanner.nextLine();
		
		String[] nomes = input.split(",");
		
		 Arrays.sort(nomes);
		 
		 System.out.print("Nomes cadastrados: ");
		 for(String nome: nomes) {
			 System.out.print(nome);
			 System.out.println("");
		 }
		 
		
	}
	
}
