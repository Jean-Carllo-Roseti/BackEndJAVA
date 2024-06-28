package br.com.jcmar.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnnetionFactory {

    private static Connection connetion;

    private ConnnetionFactory( Connection connetion) {
    }

    public static Connection getConnetion() throws SQLException{
        if (connetion == null) {
            connetion = initConection();
            return connetion;
        } else if (connetion.isClosed()){
            connetion = initConection();
            return connetion;
        } else {
        return connetion;
        }
    }

    private static Connection initConection() {
        try {
            return DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/vendas_online_2", "postgres", "1851923102030");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
