package br.com.rpires.service;

/**
 * @author rodrigo.pires
 */

    public interface IContratoService {
        String salvar();
        String atualizar();
        String excluir();
        String buscar(int id);
    }
