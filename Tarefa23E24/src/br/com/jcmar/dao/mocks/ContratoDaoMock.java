package br.com.jcmar.dao.mocks;

import br.com.jcmar.dao.IContratoDao;

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
