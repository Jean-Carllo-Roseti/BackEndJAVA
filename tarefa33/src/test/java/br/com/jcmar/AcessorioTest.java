package br.com.jcmar;

import br.com.jcmar.dao.AcessorioDao;
import br.com.jcmar.dao.IAcessorioDao;
import br.com.jcmar.domain.Acessorio;

import org.junit.Test;
import static org.junit.Assert.assertNotNull;

public class AcessorioTest {

    private IAcessorioDao acessorioDao;

    public AcessorioTest() {
        acessorioDao = new AcessorioDao();
    }

    @Test
    public void cadastrar() {
        Acessorio acessorio = new Acessorio();
        acessorio.setAlarme("S");
        acessorio.setCodigo("A1");
        acessorio.setArCondicioando("N");
        acessorio.setFaroisLed("S");
        acessorio.setMolasEsportivas("N");
        acessorio = acessorioDao.cadastrar(acessorio);

        assertNotNull(acessorio);
        assertNotNull(acessorio.getId());
    }
}
