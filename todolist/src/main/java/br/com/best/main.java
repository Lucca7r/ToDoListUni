package br.com.best;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

import javax.swing.JOptionPane;

import br.com.best.model.Tarefa;
import br.com.best.model.Usuario;
import br.com.best.util.BDD;
import br.com.best.view.HomeScreen;

public class main {
  public static void main(String[] args) throws SQLException, ClassNotFoundException {
    BDD bdd = new BDD();


    HomeScreen tela = new HomeScreen();
    tela.setVisible(true);

    // ResultSet resultSet = bdd.listaTarefas();

    // while (resultSet.next()) {
    //   int user_id = resultSet.getInt("user_id");
    //   String name = resultSet.getString("name");
    //   String nick_name = resultSet.getString("nick_name");

    //   System.out.println("ID: " + user_id);
    //   System.out.println("Name: " + name);
    //   System.out.println("nick_name: " + nick_name);
    // }


    
      // Usuario u = new Usuario();
      // u.setNickName("ihaaa");
      // u.setName("ta funcionaando");
      // u.setPassword("tarefafuncionou");
      
      
      // new BDD().inser(u);
      
      // Tarefa t = new Tarefa();
      
      // t.setName("cego");
      // t.setDescription("cego");
      // t.setStartDate(java.sql.Date.valueOf("2021-11-16"));
      // t.setEndDate(java.sql.Date.valueOf("2023-11-16"));
      // t.setUserId(3);
      // t.setPriority("alta");
      
      // new BDD().insertTarefa(t);
     
}
}