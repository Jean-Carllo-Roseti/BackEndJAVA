package br.com.jcmar;

import java.lang.reflect.Field;

public class Demo {
    public static void main(String[] args) {
        LerAnotacao();
        lerAnotacaoCampos();
    }

    public static void LerAnotacao() {
        Tabela tabela = new Tabela();
        System.out.println("Nome da tabela, usando Annotations: " + tabela.getNomeTabela());
    }

    public static void lerAnotacaoCampos() {
        // Obtém a classe Tabela
        Class<?> classeTabela = Tabela.class;

        // Lê a anotação ITabela da classe Tabela e imprime
        ITabela anotacaoClasse = classeTabela.getAnnotation(ITabela.class);
        if (anotacaoClasse != null) {
            System.out.println("Nome da tabela da classe Tabela: " + anotacaoClasse.tabela());
        }
    }
}