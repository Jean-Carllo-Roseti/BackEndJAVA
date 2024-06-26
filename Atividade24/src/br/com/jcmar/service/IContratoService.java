package br.com.jcmar.service;

/**
 * @author rodrigo.pires
 */

    public interface IContratoService {
        String salvar();
        String atualizar();
        String excluir();
        String buscar(int id);
    }
