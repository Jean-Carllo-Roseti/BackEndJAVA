/**
 * 
 */
package br.com.jcmar.dao.jpa;

import br.com.jcmar.dao.generic.jpa.GenericJpaDB2DAO;
import br.com.jcmar.domain.jpa.ClienteJpa;


public class ClienteJpaDB2DAO extends GenericJpaDB2DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

	public ClienteJpaDB2DAO() {
		super(ClienteJpa.class);
	}

}
