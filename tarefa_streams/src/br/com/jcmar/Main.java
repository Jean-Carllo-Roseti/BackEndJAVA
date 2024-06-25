package br.com.jcmar;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Ana", 25, "Feminino"));
        pessoas.add(new Pessoa("João", 30, "Masculino"));
        pessoas.add(new Pessoa("Maria", 22, "Feminino"));
        pessoas.add(new Pessoa("Pedro", 28, "Masculino"));
        pessoas.add(new Pessoa("Clara", 26, "Feminino"));
        pessoas.add(new Pessoa("Carlos", 27, "Masculino"));
        pessoas.add(new Pessoa("Sofia", 29, "Feminino"));
        pessoas.add(new Pessoa("Lucas", 24, "Masculino"));
        pessoas.add(new Pessoa("Beatriz", 23, "Feminino"));
        pessoas.add(new Pessoa("Miguel", 21, "Masculino"));

        // Imprimir a lista original
        System.out.println("Lista original:");
        pessoas.forEach(System.out::println);

        // Criar listas separadas usando Streams
        List<Pessoa> femininas = pessoas.stream()
                .filter(pessoa -> "Feminino".equalsIgnoreCase(pessoa.getSexo()))
                .collect(Collectors.toList());

        List<Pessoa> masculinas = pessoas.stream()
                .filter(pessoa -> "Masculino".equalsIgnoreCase(pessoa.getSexo()))
                .collect(Collectors.toList());

        // Imprimir as listas resultantes
        System.out.println("\nLista de pessoas do sexo feminino:");
        femininas.forEach(System.out::println);

        System.out.println("\nLista de pessoas do sexo masculino:");
        masculinas.forEach(System.out::println);
    }
}

