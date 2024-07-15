/**
 * 
 */
package br.com.jcmar.dao.jpa;

import br.com.jcmar.dao.generic.jpa.GenericJpaDB1DAO;
import br.com.jcmar.domain.jpa.ClienteJpa;


public class ClienteJpaDAO extends GenericJpaDB1DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

	public ClienteJpaDAO() {
		super(ClienteJpa.class);
	}

}
