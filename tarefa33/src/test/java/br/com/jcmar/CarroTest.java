package br.com.jcmar;


import br.com.jcmar.dao.CarroDao;
import br.com.jcmar.dao.ICarroDao;
import br.com.jcmar.domain.Carro;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class CarroTest {

    private ICarroDao carroDao = new CarroDao();

    public CarroTest() { carroDao = new CarroDao(); }

    @Test
    public void cadastrar() {
        Carro carro = new Carro();
        carro.setCodigo("A1");
        carro.setAno("2002");
        carro.setCor("VERMELHA");
        carro.setModelo("ESPORTIVO");
        carro = carroDao.cadastrar(carro);

        assertNotNull(carro);
        assertNotNull(carro.getId());
    }
}
