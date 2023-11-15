package br.com.best;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

import javax.swing.JOptionPane;

import br.com.best.model.Tarefa;
import br.com.best.model.Usuario;
import br.com.best.util.BDD;

public class main {
  public static void main(String[] args) throws SQLException, ClassNotFoundException {
    BDD bdd = new BDD();

    ResultSet resultSet = bdd.listaTarefas();

    while (resultSet.next()) {
      int task_id = resultSet.getInt("task_id");
      String name = resultSet.getString("name");
      String description = resultSet.getString("description");
      String priority = resultSet.getString("priority");

      System.out.println("ID: " + task_id);
      System.out.println("Name: " + name);
      System.out.println("Description: " + description);
      System.out.println("Priority: " + priority);
    }

    /*
     * Usuario u = new Usuario();
     * u.setNickName("ihaaa");
     * u.setName("ta funcionaando");
     * u.setPassword("tarefafuncionou");
     * 
     * 
     * new BDD().inserirUsuario(u);
     * 
     * Tarefa t = new Tarefa();
     * 
     * t.setName("fazer funcionar");
     * t.setDescription("teste para funcionar");
     * t.setStartDate(java.sql.Date.valueOf("2021-11-16"));
     * t.setEndDate(java.sql.Date.valueOf("2023-11-16"));
     * 
     * new BDD().insertTarefa(t);
     */
}
}