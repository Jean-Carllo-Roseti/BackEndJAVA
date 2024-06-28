package br.com.jcmar.generic.jdbc;


import br.com.jcmar.domin.Cliente;

public interface IClienteDAO {
    public int cadastrar(Cliente cliente) throws Exception;

    public Cliente consultar (String codigo) throws Exception;


}
