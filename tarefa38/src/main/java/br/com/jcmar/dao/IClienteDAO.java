/**
 * 
 */
package br.com.jcmar.dao;

import java.util.List;

import br.com.jcmar.dao.generic.IGenericDAO;
import br.com.jcmar.domain.Cliente;

/**
 * @author rodrigo.pires
 *
 */
public interface IClienteDAO extends IGenericDAO<Cliente, Long>{

	List<Cliente> filtrarClientes(String query);

}
