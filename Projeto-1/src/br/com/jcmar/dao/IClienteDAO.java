package br.com.jcmar.dao;


import br.com.jcmar.domain.Cliente;

import java.util.Collection;

public interface IClienteDAO {
    public Boolean cadastrar(Cliente cliente);

    public void excluir (Long cpf);

    public void alterar ( Cliente cliente);

    public Cliente consular (Long cpf);

    public Collection<Cliente> buscarTodos();
}
