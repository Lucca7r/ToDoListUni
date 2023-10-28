package br.com.best.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {

    private static final String URL = "jdbc:postgres://ykmjoobw:nX-_mS31qqed0qL85JX87TRf1EQR7L97@isabelle.db.elephantsql.com/ykmjoobw";
    private static final String USUARIO = "qeyrswvn";
    private static final String SENHA = "nX-_mS31qqed0qL85JX87TRf1EQR7L97";

    private Connection conexao;

    public DBUtil() {
        this.conexao = null;
    }

    public Connection conectar() {
        try {

            Class.forName("org.postgresql.Driver");

            // Conecte ao banco de dados
            conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
            return conexao;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void desconectar() {
        try {
            if (conexao != null && !conexao.isClosed()) {
                conexao.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean executarSQL(String sql) {
        Statement stmt = null;
        try {
            stmt = conexao.createStatement();
            stmt.executeUpdate(sql);
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}