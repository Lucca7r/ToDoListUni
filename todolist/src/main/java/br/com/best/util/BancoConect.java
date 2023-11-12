package br.com.best.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BancoConect {
    private static final String URL = "jdbc:postgres://isabelle.db.elephantsql.com/ykmjoobw";
    private static final String USUARIO = "ykmjoobw";
    private static final String SENHA = "nX-_mS31qqed0qL85JX87TRf1EQR7L97";
    
    private static Connection conn;

    /**
     * @return
     */
    public static Connection getConexao() {
        try {
            if (conn == null) {
                conn = DriverManager.getConnection(URL, USUARIO, SENHA);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
}
