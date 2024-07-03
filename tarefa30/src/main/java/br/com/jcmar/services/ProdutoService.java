package br.com.jcmar.services;

import br.com.jcmar.dao.IProdutoDAO;
import br.com.jcmar.domain.Produto;
import br.com.jcmar.services.generic.GenericService;

public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

    public ProdutoService(IProdutoDAO dao) {
        super(dao);
    }

}
