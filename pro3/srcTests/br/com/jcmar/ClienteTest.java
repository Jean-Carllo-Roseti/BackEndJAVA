package br.com.jcmar;

import br.com.jcmar.domin.Cliente;
import br.com.jcmar.generic.jdbc.ClienteDAO;
import br.com.jcmar.generic.jdbc.IClienteDAO;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClienteTest {

    @Test
    public void cadastrarTest() throws Exception {
        IClienteDAO dao = new ClienteDAO();

        Cliente cliente = new Cliente();
        cliente.setCodigo("01");
        cliente.setNome("Jean Carllo");

        Integer qtd = dao.cadastrar(null);
        assertTrue(qtd == 1);

        Cliente clienteBD = dao.consultar(cliente.getCodigo());
        assertNotNull(clienteBD);
        assertNotNull(clienteBD.getId());
        assertEquals(clienteBD.getCodigo(), clienteBD.getCodigo());
        assertEquals(cliente.getNome(), clienteBD.getNome());
    }
}
