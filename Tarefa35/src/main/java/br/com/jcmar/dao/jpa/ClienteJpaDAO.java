package br.com.jcmar.dao.jpa;

import br.com.jcmar.dao.generic.jpa.GenericJpaDAO;
import br.com.jcmar.domain.jpa.ClienteJpa;


public class ClienteJpaDAO extends GenericJpaDAO<ClienteJpa, Long> implements IClienteJpaDAO {

	public ClienteJpaDAO() {
		super(ClienteJpa.class);
	}

}
