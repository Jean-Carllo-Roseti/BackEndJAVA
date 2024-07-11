package br.com.jcmar;

import br.com.jcmar.dao.CarroDao;
import br.com.jcmar.dao.ICarroDao;
import br.com.jcmar.dao.IMarcaDao;
import br.com.jcmar.dao.MarcaDao;
import br.com.jcmar.domain.Carro;
import br.com.jcmar.domain.Marca;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class MarcaTest {

    private IMarcaDao marcaDao = new MarcaDao();

    public MarcaTest() { marcaDao = new MarcaDao(); }

    @Test
    public void cadastrar() {
        Marca marca = new Marca();
        marca.setCodigo("A2");
        marca.setNacionalidade("japonesa");
        marca.setNome("Mistubishy");
        marca = marcaDao.cadastrar(marca);

        assertNotNull(marca);
        assertNotNull(marca.getId());
    }
}
