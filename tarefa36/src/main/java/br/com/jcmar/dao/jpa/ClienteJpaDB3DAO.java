/**
 * 
 */
package br.com.jcmar.dao.jpa;

import br.com.jcmar.dao.generic.jpa.GenericJpaDB3DAO;
import br.com.jcmar.domain.jpa.ClienteJpa2;


public class ClienteJpaDB3DAO extends GenericJpaDB3DAO<ClienteJpa2, Long> implements IClienteJpaDAO<ClienteJpa2> {

	public ClienteJpaDB3DAO() {
		super(ClienteJpa2.class);
	}

}
