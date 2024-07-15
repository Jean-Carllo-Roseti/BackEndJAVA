/**
 * 
 */
package br.com.jcmar.dao.generic.jpa;

import br.com.jcmar.domain.jpa.Persistente;

import java.io.Serializable;


public abstract class GenericJpaDB1DAO <T extends Persistente, E extends Serializable>
	extends GenericJpaDAO<T,E> {

	public GenericJpaDB1DAO(Class<T> persistenteClass) {
		super(persistenteClass, "Postgre1");
	}

}
