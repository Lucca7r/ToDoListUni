package br.com.best;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.best.model.Usuario;
import br.com.best.util.BDD;
public class main {
  public static void main(String[] args) throws SQLException {
    
    Usuario u = new Usuario();

    u.setUser("gege");
    u.setName("Gessica");
    u.setPassword("funcinapeloamordedeusfunciona");

    new  BDD().inserirUsuario(u);
   }
 } 