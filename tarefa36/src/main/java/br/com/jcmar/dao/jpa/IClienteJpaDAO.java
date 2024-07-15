/**
 * 
 */
package br.com.jcmar.dao.jpa;

import br.com.jcmar.dao.generic.jpa.IGenericJapDAO;
import br.com.jcmar.domain.jpa.Persistente;

public interface IClienteJpaDAO<T extends Persistente> extends IGenericJapDAO<T, Long>{

}
