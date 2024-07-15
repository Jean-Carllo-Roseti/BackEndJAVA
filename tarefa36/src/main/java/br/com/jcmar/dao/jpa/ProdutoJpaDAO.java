/**
 * 
 */
package br.com.jcmar.dao.jpa;

import br.com.jcmar.dao.generic.jpa.GenericJpaDB1DAO;
import br.com.jcmar.domain.jpa.ProdutoJpa;

public class ProdutoJpaDAO extends GenericJpaDB1DAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

	public ProdutoJpaDAO() {
		super(ProdutoJpa.class);
	}

}
