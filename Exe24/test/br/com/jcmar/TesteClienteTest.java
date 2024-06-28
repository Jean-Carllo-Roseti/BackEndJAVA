package br.com.jcmar;

import org.junit.Assert;
import org.junit.Test;

public class TesteClienteTest {

    @Test
    public void TestCliente() {
        TesteCliente cli = new TesteCliente();
        cli.adicionarNome("Jean");
        cli.adicionarNome1("Jean");

        Assert.assertEquals("Jean", cli.getNome());
    }
}
