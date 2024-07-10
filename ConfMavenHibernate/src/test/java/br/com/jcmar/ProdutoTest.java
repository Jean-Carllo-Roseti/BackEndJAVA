package br.com.jcmar;

import br.com.jcmar.dao.IProdutoDao;
import br.com.jcmar.dao.ProdutoDao;
import br.com.jcmar.domain.Produto;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class ProdutoTest {

    private IProdutoDao produtoDao;

    public ProdutoTest() {

        produtoDao = new ProdutoDao();

    }

   @Test
    public void cadastrar() {

        Produto produto = new Produto();
        produto.setCodigo("A1");
        produto.setNome("Pão de frios");
        produto = produtoDao.cadastrar(produto);

        assertNotNull(produto);
        assertNotNull(produto.getId());
   }
}
