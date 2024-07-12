/**
 * 
 */
package br.com.jcmar.dao;

import br.com.jcmar.dao.generic.IGenericDAO;
import br.com.jcmar.domain.Venda;
import br.com.jcmar.exceptions.DAOException;
import br.com.jcmar.exceptions.TipoChaveNaoEncontradaException;


public interface IVendaDAO extends IGenericDAO<Venda, String> {

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
	
	public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
}
