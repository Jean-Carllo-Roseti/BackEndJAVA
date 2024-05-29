package br.com.jcmar;

import br.com.jcmar.dao.ClienteMapDAO;
import br.com.jcmar.dao.IClienteDAO;
import br.com.jcmar.domain.Cliente;

import javax.swing.*;

public class App {
    private static IClienteDAO iClienteDAO;

    public static void  main (String[] args) {
        iClienteDAO = new ClienteMapDAO();

        String opcao = JOptionPane.showInputDialog(null, "Digite 1 para cadastar, 2 para consultar, 3 para exclusão, 4 para alterar ou 5 para encerrar.",
                "Cadastrar",JOptionPane.INFORMATION_MESSAGE);

        while (!isOpcaoValida(opcao)){
            if ("".equals(opcao)) {
                sair();
            }
            opcao = JOptionPane.showInputDialog(null, "Opção inválida: Digite 1 para cadastar, 2 para consultar, 3 para exclusão, 4 para alterar ou 5 para encerrar.",
                    "Green Dinner",JOptionPane.INFORMATION_MESSAGE);
        }
        while (isOpcaoValida(opcao)) {

            if(isOpcaoSair(opcao)) {
                sair();
            } else if (isCadastro(opcao)) {
                String dados = JOptionPane.showInputDialog(null,"Digite os dados dos clientes separados por virgula, conforme o exemplo: Nome, Cpf, Telefone, Endereço, Número, Cidade, Estado",
                        "Cadastro",JOptionPane.INFORMATION_MESSAGE);
                cadastrar(dados);
            } else if (isConsulta(opcao)) {
                String dados = JOptionPane.showInputDialog(null, "Digite o CPF que deseja consultar", "Consultar",JOptionPane.INFORMATION_MESSAGE);
                consultar(dados);
            } else if (isAlterar(opcao)) {
                String dados = JOptionPane.showInputDialog(null, "Digite os dados dos clientes separados por virgula, conforme o exemplo: Nome, Cpf, Telefone, Endereço, Número, Cidade, Estado",
                        "Consultar",JOptionPane.INFORMATION_MESSAGE);
                alterar(dados);
        }   else if (isExcluir(opcao)) {
                String dados = JOptionPane.showInputDialog(null, "Digite o CPF q deseja excluir",
                        "Consultar",JOptionPane.INFORMATION_MESSAGE);
                exlcuir(dados);
            }
        }
    }



    private static boolean isCadastro(String opcao) {
        if ("1".equals(opcao)) {
            return true;
        }
        return false;
    }

    private static boolean isConsulta(String opcao) {
        if ("2".equals(opcao)) {
            return true;
        }
        return false;
    }

    private static boolean isExcluir(String opcao) {
        if ("3".equals(opcao)) {
            return true;
        }
        return false;
    }

    private static boolean isAlterar(String opcao) {
        if ("4".equals(opcao)) {
            return true;
        }
        return false;
    }


    private static boolean isOpcaoSair(String opcao) {
        if ("5".equals(opcao)) {
            return true;
        }
        return false;
    }

    private static void sair() {
        String clienteCadastrados = "";
        for (Cliente cliente : iClienteDAO.buscarTodos()) {
        clienteCadastrados += cliente.toString() + "\n";
        }
        JOptionPane.showInputDialog(null,"Cliente cadastrado: " + clienteCadastrados);
        System.exit(0);
    }

    private static  void cadastrar(String dados) {
        String[] dadosSeparados = dados.split(",");
        Cliente cliente = new Cliente(dadosSeparados[0],
                dadosSeparados[1],
                dadosSeparados[2],
                dadosSeparados[3],
                dadosSeparados[4],
                dadosSeparados[5],
                dadosSeparados[6]);
        Boolean isCadastro = iClienteDAO.cadastrar(cliente);
        if(isCadastro) {
            JOptionPane.showInputDialog(null,"Cliente cadastrado com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showInputDialog(null,"Cliente já esta cadastrado.", "Erro", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static void consultar(String dados) {
        Cliente cliente = iClienteDAO.consular(Long.parseLong(dados));
        if (cliente!= null) {
            JOptionPane.showInputDialog(null,"Cliente encontrado com sucesso.", "Sucesso",JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showInputDialog(null, "Cliente não foi encontrado.","Erro",JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static void alterar(String dados) {
        String[] dadosSeparados = dados.split(",");
        Cliente cliente = new Cliente(dadosSeparados[0],
                dadosSeparados[1],
                dadosSeparados[2],
                dadosSeparados[3],
                dadosSeparados[4],
                dadosSeparados[5],
                dadosSeparados[6]);
        iClienteDAO.alterar(cliente);

    }

    private static void exlcuir(String dados) {
        iClienteDAO.excluir(Long.parseLong(dados));
        JOptionPane.showInputDialog(null, "Cliente excluido com sucesso.","Sucesso", JOptionPane.INFORMATION_MESSAGE);
    }

    private static boolean isOpcaoValida(String opcao) {
        if("1".equals(opcao) || "2".equals(opcao) || "3".equals(opcao) || "4".equals(opcao) || "5".equals(opcao)) {
            return true;
        }
        return false;
    }
}
