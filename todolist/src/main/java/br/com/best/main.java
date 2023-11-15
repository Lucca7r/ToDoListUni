package br.com.best;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.best.model.Tarefa;
import br.com.best.model.Usuario;
import br.com.best.util.BDD;

public class main {
  public static void main(String[] args) throws SQLException, ClassNotFoundException {

    Usuario u = new Usuario();

    u.setNickName("ihaaa");
    u.setName("ta funcionaando");
    u.setPassword("tarefafuncionou");
    

    new BDD().inserirUsuario(u);

    Tarefa t = new Tarefa();

    t.setName("fazer funcionar");
    t.setDescription("teste para funcionar");
    t.setStartDate(java.sql.Date.valueOf("2021-11-16"));
    t.setEndDate(java.sql.Date.valueOf("2023-11-16"));
    
    new BDD().insertTarefa(t);
  }
}