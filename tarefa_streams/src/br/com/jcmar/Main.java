package br.com.jcmar;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Pessoa> pessoas = criarListaPessoas();


        System.out.println("Lista original:");
        pessoas.forEach(System.out::println);

        // Filtrar listas
        List<Pessoa> femininas = filtrarPorSexo(pessoas, "Feminino");
        List<Pessoa> masculinas = filtrarPorSexo(pessoas, "Masculino");

        // Imprimir as listas resultantes
        System.out.println("\nLista de pessoas do sexo feminino:");
        femininas.forEach(System.out::println);

        System.out.println("\nLista de pessoas do sexo masculino:");
        masculinas.forEach(System.out::println);
    }

    public static List<Pessoa> criarListaPessoas() {
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
        return pessoas;
    }

    public static List<Pessoa> filtrarPorSexo(List<Pessoa> pessoas, String sexo) {
        return pessoas.stream()
                .filter(pessoa -> sexo.equalsIgnoreCase(pessoa.getSexo()))
                .collect(Collectors.toList());
    }
}
