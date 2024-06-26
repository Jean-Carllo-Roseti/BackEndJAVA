package br.com.jcmar;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClientTest {


    @Test
    public void testeClasseCliente() {
        TesteCliente cli = new TesteCliente();
        cli.adicionarNome("Rodrigo");
        cli.adicionarNome1("Rodrigo");

        Assert.assertEquals("Rodrigo", cli.getNome());
    }

}