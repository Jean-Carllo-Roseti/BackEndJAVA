package br.com.jcmar.dao;

/**
 * @author rodrigo.pires
 */
public interface IContratoDao {
    void salvar();
    void atualizar();
    void excluir();
    String buscar(int id);
}
