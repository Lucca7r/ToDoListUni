package br.com.best.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

import java.time.LocalDateTime;
import br.com.best.model.Tarefa;
import br.com.best.model.Usuario;

public class BDD {


    //------------------ querys sobre usuarios ------------------//

    
    public void inserirUsuario(Usuario user) throws SQLException, ClassNotFoundException {
        String sql = "INSERT INTO usuario (nick_name, name, password) VALUES (?, ?, ?)";

        PreparedStatement ps = BancoConect.getConexao().prepareStatement(sql);

        try {
            ps = BancoConect.getConexao().prepareStatement(sql);

            ps.setString(1, user.getNickName());
            ps.setString(2, user.getName());
            ps.setString(3, user.getPassword());
            ps.execute();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ResultSet checkUser(String nameUser) throws SQLException {
        String sql = "SELECT nick_name, password, user_id FROM usuario WHERE nick_name = ?";
        PreparedStatement ps = BancoConect.getConexao().prepareStatement(sql);
        ps.setString(1, nameUser);
        return ps.executeQuery();
    }

    
    public ResultSet listaUsuario() throws SQLException {
        String sql = "SELECT * FROM usuario";
        PreparedStatement ps = BancoConect.getConexao().prepareStatement(sql);
        return ps.executeQuery();
    }

    //-------------------query sobre tarefas-------------------//

    public void insertTarefa(Tarefa tarefa) throws SQLException {
        String sql = "INSERT INTO tarefa (name, description, start_date, end_date, user_id, priority) VALUES (?, ?, ?, ?, ?, ? )";

        PreparedStatement ps = BancoConect.getConexao().prepareStatement(sql);

        try {
            ps = BancoConect.getConexao().prepareStatement(sql);

            ps.setString(1, tarefa.getName());
            ps.setString(2, tarefa.getDescription());
            ps.setDate(3, tarefa.getStartDate());
            ps.setDate(4, tarefa.getEndDate());
            ps.setInt(5, tarefa.getUserId());
            ps.setString(6, tarefa.getPriority());
            ps.execute();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ResultSet listaTarefas() throws SQLException {
        String sql = "SELECT * FROM tarefa";
        PreparedStatement ps = BancoConect.getConexao().prepareStatement(sql);
        return ps.executeQuery();
    }

     


}

// comentado para testes

/*
 * private Connection connection;
 * 
 * 
 * public void conectar(Connection connection) throws SQLException {
 * this.connection = connection;
 * }
 * 
 * public void inserirUsuario(Usuario user) throws SQLException {
 * 
 * String sql =
 * "INSERT INTO usuario (nickName, name, password) VALUES (?, ?, ?)";
 * 
 * PreparedStatement preparedStatement = connection.prepareStatement(sql);
 * preparedStatement.setString(1, user.getNickName() );
 * preparedStatement.setString(2, user.getName());
 * preparedStatement.setString(3, user.getPassword());
 * preparedStatement.executeUpdate();
 * }
 * 
 * 
 * public void insertTarefa(Tarefa tarefa) throws SQLException {
 * String sql =
 * "INSERT INTO tarefa (name, description, start_date, end_date) VALUES (?, ?, ?, ? )"
 * ;
 * 
 * PreparedStatement preparedStatement = connection.prepareStatement(sql);
 * preparedStatement.setString(1, tarefa.getName());
 * preparedStatement.setString(2, tarefa.getDescription());
 * preparedStatement.setDate(3, tarefa.getStartDate());
 * preparedStatement.setDate(4, tarefa.getEndDate());
 * //preparedStatement.setDate(5, tarefa.getCreatedAt());
 * preparedStatement.executeUpdate();
 * }
 * 
 * public ResultSet listaTarefas() throws SQLException {
 * String sql = "SELECT * FROM tarefas";
 * PreparedStatement preparedStatement = connection.prepareStatement(sql);
 * return preparedStatement.executeQuery();
 * }
 */
