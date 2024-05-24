package colecoesParte2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroDePessoas {
    public static void main(String[] args) {
    	
        List<String> dadosPessoais = new ArrayList<>();
        List<String> sexoMasculino = new ArrayList<>();
        List<String> sexoFeminino = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        String resposta = "N";
        
        do {
            System.out.println("Digite o nome da pessoa:");
            String nome = scanner.nextLine();
            
            System.out.println("Digite o sexo da pessoa (M/F):");
            String sexo = scanner.nextLine().toUpperCase();
            
            dadosPessoais.add(nome + " - " + sexo);
            
            if (sexo.equals("M")) {
                sexoMasculino.add(nome);
            } else if (sexo.equals("F")) {
                sexoFeminino.add(nome);
            } else {
                System.out.println("Sexo inválido, tente novamente.");
            }
            
            System.out.println("Gostaria de cadastrar mais pessoas? (S/N)");
            resposta = scanner.nextLine().toUpperCase();
        } while (resposta.equals("S"));
        
        scanner.close();
        
        System.out.println("Exibindo informações cadastradas:");
        System.out.println("Sexo Masculino: " + sexoMasculino);
        System.out.println("Sexo Feminino: " + sexoFeminino);
    
    }

}
    


