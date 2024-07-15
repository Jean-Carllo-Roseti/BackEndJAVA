/**
 * 
 */
package br.com.jcmar.dao.generic.jpa;

import br.com.jcmar.domain.jpa.Persistente;

import java.io.Serializable;


public abstract class GenericJpaDB3DAO <T extends Persistente, E extends Serializable>
	extends GenericJpaDAO<T,E> {

	public GenericJpaDB3DAO(Class<T> persistenteClass) {
		super(persistenteClass, "Mysql1");
	}

}
