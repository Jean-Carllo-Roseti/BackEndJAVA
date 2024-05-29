package br.com.jcmar;

import br.com.jcmar.dao.ClienteMapDAO;
import br.com.jcmar.dao.IClienteDAO;
import br.com.jcmar.domain.Cliente;

import javax.swing.*;

public class App {
    private static IClienteDAO iClienteDAO;

    public static void main(String[] args) {
        iClienteDAO = new ClienteMapDAO();

        while (true) {
            String opcao = JOptionPane.showInputDialog(null, "Digite 1 para cadastrar, 2 para consultar, 3 para exclusão, 4 para alterar ou 5 para encerrar.",
                    "Menu Principal", JOptionPane.INFORMATION_MESSAGE);

            while (!isOpcaoValida(opcao)) {
                if ("".equals(opcao) || opcao == null) {
                    sair();
                }
                opcao = JOptionPane.showInputDialog(null, "Opção inválida: Digite 1 para cadastrar, 2 para consultar, 3 para exclusão, 4 para alterar ou 5 para encerrar.",
                        "Menu Principal", JOptionPane.INFORMATION_MESSAGE);
            }

            if (isOpcaoSair(opcao)) {
                sair();
            } else if (isCadastro(opcao)) {
                String dados = JOptionPane.showInputDialog(null, "Digite os dados dos clientes separados por vírgula, conforme o exemplo: Nome, Cpf, Telefone, Endereço, Número, Cidade, Estado",
                        "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                cadastrar(dados);
            } else if (isConsulta(opcao)) {
                String dados = JOptionPane.showInputDialog(null, "Digite o CPF que deseja consultar", "Consultar", JOptionPane.INFORMATION_MESSAGE);
                consultar(dados);
            } else if (isAlterar(opcao)) {
                String dados = JOptionPane.showInputDialog(null, "Digite os dados dos clientes separados por vírgula, conforme o exemplo: Nome, Cpf, Telefone, Endereço, Número, Cidade, Estado",
                        "Alterar", JOptionPane.INFORMATION_MESSAGE);
                alterar(dados);
            } else if (isExcluir(opcao)) {
                String dados = JOptionPane.showInputDialog(null, "Digite o CPF que deseja excluir",
                        "Excluir", JOptionPane.INFORMATION_MESSAGE);
                excluir(dados);
            }
        }
    }

    private static boolean isCadastro(String opcao) {
        return "1".equals(opcao);
    }

    private static boolean isConsulta(String opcao) {
        return "2".equals(opcao);
    }

    private static boolean isExcluir(String opcao) {
        return "3".equals(opcao);
    }

    private static boolean isAlterar(String opcao) {
        return "4".equals(opcao);
    }

    private static boolean isOpcaoSair(String opcao) {
        return "5".equals(opcao);
    }

    private static void sair() {
        StringBuilder clienteCadastrados = new StringBuilder();
        for (Cliente cliente : iClienteDAO.buscarTodos()) {
            clienteCadastrados.append(cliente.toString()).append("\n");
        }
        JOptionPane.showMessageDialog(null, "Clientes cadastrados:\n" + clienteCadastrados.toString());
        System.exit(0);
    }

    private static void cadastrar(String dados) {
        String[] dadosSeparados = dados.split(",");
        if (dadosSeparados.length != 7) {
            JOptionPane.showMessageDialog(null, "Dados incompletos. Por favor, forneça todos os campos: Nome, Cpf, Telefone, Endereço, Número, Cidade, Estado",
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Cliente cliente = new Cliente(dadosSeparados[0], dadosSeparados[1], dadosSeparados[2], dadosSeparados[3], dadosSeparados[4], dadosSeparados[5], dadosSeparados[6]);
        Boolean isCadastro = iClienteDAO.cadastrar(cliente);
        if (isCadastro) {
            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Cliente já está cadastrado.", "Erro", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static void consultar(String dados) {
        Cliente cliente = iClienteDAO.consular(Long.parseLong(dados));
        if (cliente != null) {
            JOptionPane.showMessageDialog(null, "Cliente encontrado: " + cliente, "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Cliente não foi encontrado.", "Erro", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static void alterar(String dados) {
        String[] dadosSeparados = dados.split(",");
        if (dadosSeparados.length != 7) {
            JOptionPane.showMessageDialog(null, "Dados incompletos. Por favor, forneça todos os campos: Nome, Cpf, Telefone, Endereço, Número, Cidade, Estado",
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Cliente cliente = new Cliente(dadosSeparados[0], dadosSeparados[1], dadosSeparados[2], dadosSeparados[3], dadosSeparados[4], dadosSeparados[5], dadosSeparados[6]);
        iClienteDAO.alterar(cliente);
        JOptionPane.showMessageDialog(null, "Cliente alterado com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
    }

    private static void excluir(String dados) {
        iClienteDAO.excluir(Long.parseLong(dados));
        JOptionPane.showMessageDialog(null, "Cliente excluído com sucesso.", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
    }

    private static boolean isOpcaoValida(String opcao) {
        return "1".equals(opcao) || "2".equals(opcao) || "3".equals(opcao) || "4".equals(opcao) || "5".equals(opcao);
    }
}
