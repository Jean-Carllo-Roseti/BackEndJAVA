package br.com.jcmar.generic.jdbc;

import br.com.jcmar.dao.ConnnetionFactory;
import br.com.jcmar.domin.Cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ClienteDAO implements IClienteDAO{

    @Override
    public int cadastrar(Cliente cliente) throws Exception {
            Connection connection = null;
            PreparedStatement stm = null;
        try{
            connection = ConnnetionFactory.getConnetion();
            String sql = "INSERT INTO TB_CLIENTE_2 (ID, CODIGO,NOME) VALUES (nextval('SQ_CLIENTE_2'),?,?";
            stm = connection.prepareStatement(sql);
            stm.setString(1,cliente.getCodigo());
            stm.setString(2,cliente.getNome());
            return  stm.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            if (stm != null && !stm.isClosed()) {
                stm.close();
            }
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
        }

    @Override
    public Cliente consultar(String codigo) throws Exception {
        return null;

    }

}
