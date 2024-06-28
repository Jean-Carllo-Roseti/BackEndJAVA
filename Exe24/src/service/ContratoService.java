package service;

import dao.IContratoDao;

public class ContratoService implements IContratoService {

    private IContratoDao contratoDao;

    public ContratoService(IContratoDao dao) {
        this.contratoDao = dao;
    }

    @Override
    public String salvar() {
        contratoDao.salvar();
        return "Sucesso";
    }

    @Override
    public String atualizar() {
        return "Sucesso";
    }

    @Override
    public String excluir() {
        return "Sucesso";
    }

    @Override
    public String buscar(int id) {
        return "Sucesso";
    }


}
