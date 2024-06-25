package br.com.jcmar;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PessoaTest {


    @Test
    public void testCriarListaPessoas() {
        List<Pessoa> pessoas = Main.criarListaPessoas();
        assertEquals(10, pessoas.size());
    }

    @Test
    public void testFiltrarPorSexoFeminino() {
        List<Pessoa> pessoas = Main.criarListaPessoas();
        List<Pessoa> femininas = Main.filtrarPorSexo(pessoas, "Feminino");
        assertEquals(5, femininas.size());
        assertTrue(femininas.stream().allMatch(pessoa -> "Feminino".equalsIgnoreCase(pessoa.getSexo())));
    }

    @Test
    public void testFiltrarPorSexoMasculino() {
        List<Pessoa> pessoas = Main.criarListaPessoas();
        List<Pessoa> masculinas = Main.filtrarPorSexo(pessoas, "Masculino");
        assertEquals(5, masculinas.size());
        assertTrue(masculinas.stream().allMatch(pessoa -> "Masculino".equalsIgnoreCase(pessoa.getSexo())));
    }



}
