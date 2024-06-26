package br.com.rpires.dao.mocks;

import br.com.rpires.dao.IContratoDao;

/**
 * @author rodrigo.pires
 */
public class ContratoDaoMock implements IContratoDao {

    @Override
    public void salvar() {

    }

    @Override
    public void atualizar() {

    }

    @Override
    public void excluir() {

    }

    @Override
    public String buscar(int id) {
        return "Sucesso";
    }
}
