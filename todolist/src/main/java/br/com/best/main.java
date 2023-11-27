package br.com.best;

import java.sql.SQLException;

import javax.swing.SwingUtilities;

import br.com.best.view.HomeScreen;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        try {
            // Set Nimbus look and feel
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        }

        // Create and show the HomeScreen
        HomeScreen tela = new HomeScreen();
        tela.setVisible(true);
    }
}

