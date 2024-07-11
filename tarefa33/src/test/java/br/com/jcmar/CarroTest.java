package br.com.jcmar;

import br.com.jcmar.dao.*;
import br.com.jcmar.domain.Acessorio;
import br.com.jcmar.domain.Carro;
import br.com.jcmar.domain.Marca;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class CarroTest {

    private ICarroDao carroDao;
    private IMarcaDao marcaDao;
    private IAcessorioDao acessorioDao;

    @Before
    public void setUp() {
        carroDao = new CarroDao();
        marcaDao = new MarcaDao(); // Adicione a inicialização do DAO da Marca se necessário
        acessorioDao= new AcessorioDao();
    }

    @Test
    public void cadastrar() {
        Acessorio acessorio = new Acessorio();
        acessorio.setAlarme("S");
        acessorio.setCodigo("A1");
        acessorio.setArCondicionado("N");
        acessorio.setFaroisLed("S");
        acessorio.setMolasEsportivas("N");
        acessorio = acessorioDao.cadastrar(acessorio);

        // Cadastrar uma marca primeiro, se necessário
        Marca marca = new Marca();
        marca.setCodigo("A2");
        marca.setNacionalidade("japonesa");
        marca.setNome("Mitsubishi");
        marca = marcaDao.cadastrar(marca);

        Carro carro = new Carro();
        carro.setCodigo("A1");
        carro.setAno("2002");
        carro.setCor("VERMELHA");
        carro.setModelo("ESPORTIVO");
        carro.setMarca(marca); // Associa o carro com a marca cadastrada
        carro = carroDao.cadastrar(carro);

        assertNotNull(carro);
        assertNotNull(carro.getId());
    }
}
