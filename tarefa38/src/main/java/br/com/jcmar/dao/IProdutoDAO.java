/**
 * 
 */
package br.com.jcmar.dao;

import java.util.List;

import br.com.jcmar.dao.generic.IGenericDAO;
import br.com.jcmar.domain.Produto;

/**
 *
 */
public interface IProdutoDAO extends IGenericDAO<Produto, String>{

	List<Produto> filtrarProdutos(String query);

}
