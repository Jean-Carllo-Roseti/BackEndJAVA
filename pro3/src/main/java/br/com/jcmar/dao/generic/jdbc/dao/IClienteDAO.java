package br.com.jcmar.dao.generic.jdbc.dao;

import br.com.jcmar.domin.Cliente;

import java.util.List;

public interface IClienteDAO {


    public Integer cadastrar(Cliente cliente) throws Exception;

    public Cliente consultar(String codigo) throws Exception;

    public Integer excluir(Cliente clienteBD) throws Exception;
}
