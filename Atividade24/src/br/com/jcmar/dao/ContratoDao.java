package br.com.jcmar.dao;

/**
 * @author rodrigo.pires
 */
public class ContratoDao implements IContratoDao {
    @Override
    public void salvar() {
        throw new UnsupportedOperationException("Não funciona com o banco");
    }

    @Override
    public void atualizar() {
        throw new UnsupportedOperationException("Não funciona com o banco");
    }

    @Override
    public void excluir() {
        throw new UnsupportedOperationException("Não funciona com o banco");
    }

    @Override
    public String buscar(int id) {
        throw new UnsupportedOperationException("Não funciona com o banco");
    }
}
