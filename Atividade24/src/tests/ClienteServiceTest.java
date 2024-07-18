package br.com.jcmar;

import br.com.jcmar.dao.ClienteDao;
import br.com.jcmar.dao.ClienteDaoMock;
import br.com.jcmar.dao.IClienteDao;
import br.com.jcmar.service.ClienteService;
import br.com.jcmar.Assert;
import br.com.jcmar.Test;

/**
 * @author rodrigo.pires
 */
public class ClienteServiceTest {

    @Test
    public void salvarTest() {
        IClienteDao mockDao = new ClienteDaoMock();
        ClienteService service = new ClienteService(mockDao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarTest() {
        IClienteDao mockDao = new ClienteDao();
        ClienteService service = new ClienteService(mockDao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }
}
