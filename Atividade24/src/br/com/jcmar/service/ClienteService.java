package br.com.jcmar.service;

import br.com.jcmar.dao.ClienteDao;
import br.com.jcmar.dao.ClienteDaoMock;
import br.com.jcmar.dao.IClienteDao;

/**
 * @author rodrigo.pires
 */
public class ClienteService {

    private IClienteDao clienteDao;

    public ClienteService(IClienteDao clienteDao) {
        //clienteDao = new ClienteDao();
        //clienteDao = new ClienteDaoMock();
        this.clienteDao = clienteDao;
    }

    public String salvar() {
        clienteDao.salvar();
        return "Sucesso";
    }
}
