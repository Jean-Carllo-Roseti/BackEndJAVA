package br.com.jcmar;

public class PrimeiraClasse {

	public static void main(String[] args) {
		String ambiente = args[1];
		System.out.print("Saudações " + ambiente);	
		if (ambiente.equals("JeanCarllo ")) {
			System.out.print("Prazer em recebe-lo novamente " + ambiente);
		} 
	}
}
