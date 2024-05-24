package tarefaCF;

import java.util.Scanner;

public class ControleDeFulxo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite as notas dos alunos");
        int nota1 = scanner.nextInt();
        int nota2 = scanner.nextInt();
        int nota3 = scanner.nextInt();
        int nota4 = scanner.nextInt();
        
        int media = (nota1 + nota2 + nota3 + nota4) / 4;
        
        if (media < 5) {
            System.out.println("Você está reprovado.");
        } else if (media < 7) {
            System.out.println("Você está de recuperação.");
        } else {
            System.out.println("Você está aprovado.");
        }
        
        System.out.print("Sua nota é: " + media);
        scanner.close(); 
    }
}

