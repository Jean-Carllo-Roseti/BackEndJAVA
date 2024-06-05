package br.com.jcmar;

@ITabela(tabela = "TabelaUm")
public class Tabela {
    public String getNomeTabela() {
        ITabela anotacao = getClass().getAnnotation(ITabela.class);
        if (anotacao != null) {
            return anotacao.tabela();
        } else {
            return null;
        }
    }
}
