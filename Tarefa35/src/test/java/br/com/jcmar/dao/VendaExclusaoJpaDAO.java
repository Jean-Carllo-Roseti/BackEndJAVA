/**
 * 
 */
package br.com.jcmar.dao;

import br.com.jcmar.dao.generic.jpa.GenericJpaDAO;
import br.com.jcmar.dao.jpa.IVendaJpaDAO;
import br.com.jcmar.domain.jpa.VendaJpa;
import br.com.jcmar.exceptions.DAOException;
import br.com.jcmar.exceptions.TipoChaveNaoEncontradaException;

/**
 * Classe utilizada somente no teste para fazer a exclusão das vendas
 *
 */
public class VendaExclusaoJpaDAO extends GenericJpaDAO<VendaJpa, Long> implements IVendaJpaDAO {

	public VendaExclusaoJpaDAO() {
		super(VendaJpa.class);
	}

	@Override
	public void finalizarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

	@Override
	public void cancelarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

	@Override
	public VendaJpa consultarComCollection(Long id) {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

}
