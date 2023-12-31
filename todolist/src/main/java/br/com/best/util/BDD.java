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

    public ResultSet listaTarefas(int user_id) throws SQLException {
        String sql = "SELECT * FROM tarefa WHERE user_id = ? ORDER BY create_in ASC";
        PreparedStatement ps = BancoConect.getConexao().prepareStatement(sql);
        ps.setInt(1, user_id);
        return ps.executeQuery();
    }     

    public void deleteTarefa(int id) throws SQLException {
        String sql = "DELETE FROM tarefa WHERE task_id = ?";
        PreparedStatement ps = BancoConect.getConexao().prepareStatement(sql);
        ps.setInt(1, id);
        ps.execute();
        ps.close();
    }

}

