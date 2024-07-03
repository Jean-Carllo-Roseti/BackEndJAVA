package br.com.jcmar.dao.generic.jdbc.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {

    public static void main(String[] args) {
        Connection connection = null;
        try {
            // Carrega o driver JDBC do PostgreSQL (certifique-se de ter o JAR do driver no classpath)
            Class.forName("org.postgresql.Driver");

            // URL de conexão JDBC para o PostgreSQL
            String url = "jdbc:postgresql://localhost:5432/vendas_online_2";
            String usuario = "postgres";
            String senha = "1851923102030";

            // Estabelece a conexão com o banco de dados
            connection = DriverManager.getConnection(url, usuario, senha);

            // Se a conexão for bem-sucedida, imprime uma mensagem
            System.out.println("Conexão bem-sucedida!");

        } catch (ClassNotFoundException e) {
            System.out.println("Driver JDBC não encontrado. Verifique se o JAR do driver está no classpath.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Erro ao conectar ao banco de dados.");
            e.printStackTrace();
        } finally {
            // Fecha a conexão, se estiver aberta
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}