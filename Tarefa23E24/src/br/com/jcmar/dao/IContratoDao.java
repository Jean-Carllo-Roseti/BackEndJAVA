package br.com.jcmar.dao;

public interface IContratoDao {
    void salvar();
    void atualizar();
    void excluir();
    String buscar(int id);
}