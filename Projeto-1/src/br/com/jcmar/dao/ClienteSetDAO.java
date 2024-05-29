package br.com.jcmar.dao;

import br.com.jcmar.domain.Cliente;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class ClienteSetDAO implements IClienteDAO{


    public Set<Cliente> set;

    public ClienteSetDAO () {
        this.set = new HashSet<>();
    }

    @Override
    public Boolean cadastrar(Cliente cliente) {
        return this.set.add(cliente);
    }

    @Override
    public void excluir(Long cpf) {
        Cliente clienteEncontrado = null;
        for(Cliente cliente: this.set) {
            if (cliente.getCpf().equals(cpf)){
                clienteEncontrado = cliente;
                break;
            }
        }
        if (clienteEncontrado != null) {
            this.set.remove(clienteEncontrado);
        }
    }

    @Override
    public void alterar(Cliente cliente) {
        if (this.set.contains(cliente)) {
            for (Cliente clienteCadastrado : this.set) {
               if (clienteCadastrado.equals(cliente)){
                   clienteCadastrado.setNome(cliente.getNome());
                   clienteCadastrado.setCpf(cliente.getCpf());
                   clienteCadastrado.setTel(cliente.getTel());
                   clienteCadastrado.setEstado(cliente.getEstado());
                   clienteCadastrado.setCidade(cliente.getCidade());
                   clienteCadastrado.setEnd(cliente.getEnd());
                   clienteCadastrado.setNumero(cliente.getNumero());
                   break;
               }
            }
        }
    }

    @Override
    public Cliente consular(Long cpf) {
        for ( Cliente clienteCadastrado : this.set) {
            if(clienteCadastrado.getCpf().equals(cpf)) {
                return clienteCadastrado;
            }
        }
        return null;
    }

    @Override
    public Collection<Cliente> buscarTodos() {
        return this.set;
    }


}
