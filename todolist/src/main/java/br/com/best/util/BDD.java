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

    private Connection connection;

   
    public void DDD(Connection connection) {
      this.connection = connection;
    }

    public void conectar(Connection connection) throws SQLException {
        this.connection = connection;
    }

    public void inserirUsuario(Usuario user) throws SQLException {
      
        String sql = "INSERT INTO usuario (nickName, name, password) VALUES (?, ?, ?)";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, user.getNickName() );
        preparedStatement.setString(2, user.getName());
        preparedStatement.setString(3, user.getPassword());
        preparedStatement.executeUpdate();
    }

    
    public void insertTarefa(Tarefa tarefa) throws SQLException {
        String sql = "INSERT INTO tarefa (name, description, start_date, end_date) VALUES (?, ?, ?, ? )";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, tarefa.getName());
        preparedStatement.setString(2, tarefa.getDescription());
        preparedStatement.setDate(3, tarefa.getStartDate());
        preparedStatement.setDate(4, tarefa.getEndDate());
        //preparedStatement.setDate(5, tarefa.getCreatedAt());
        preparedStatement.executeUpdate();
    }

}
