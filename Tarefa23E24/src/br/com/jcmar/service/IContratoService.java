package br.com.jcmar.service;

public interface IContratoService {
    String salvar();
    String atualizar();
    String excluir();
    String buscar(int id);
}
