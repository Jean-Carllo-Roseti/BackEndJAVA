package br.com.jcmar.dao.jpa;

import br.com.jcmar.dao.generic.jpa.GenericJpaDAO;
import br.com.jcmar.domain.jpa.ProdutoJpa;


public class ProdutoJpaDAO extends GenericJpaDAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

	public ProdutoJpaDAO() {
		super(ProdutoJpa.class);
	}

}
