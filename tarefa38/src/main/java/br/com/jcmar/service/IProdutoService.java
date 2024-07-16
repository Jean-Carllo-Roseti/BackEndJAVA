/**
 * 
 */
package br.com.jcmar.service;

import java.util.List;

import br.com.jcmar.domain.Produto;
import br.com.jcmar.services.generic.IGenericService;

/**
 * @author rodrigo.pires
 *
 */
public interface IProdutoService extends IGenericService<Produto, String> {

	List<Produto> filtrarProdutos(String query);

}
