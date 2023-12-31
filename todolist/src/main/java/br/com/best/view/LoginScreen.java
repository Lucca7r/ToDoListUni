package br.com.best.view;

import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import br.com.best.model.Usuario;
import br.com.best.util.BDD;
import java.util.*;
import java.util.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Lorrana
 * 
 */

public class LoginScreen extends javax.swing.JFrame {

        public int id;

        public LoginScreen() {
                initComponents();
                setExtendedState(JFrame.MAXIMIZED_BOTH);
        }
        @SuppressWarnings("unchecked")
        private void initComponents() {

                jPanel26 = new javax.swing.JPanel();
                jPanel27 = new javax.swing.JPanel();
                jLabel73 = new javax.swing.JLabel();
                jLabel76 = new javax.swing.JLabel();
                jTextField38 = new javax.swing.JTextField();
                jLabel77 = new javax.swing.JLabel();
                jPasswordField1 = new javax.swing.JPasswordField();
                jButton74 = new javax.swing.JButton();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setPreferredSize(new java.awt.Dimension(982, 646));

                jPanel26.setBackground(new java.awt.Color(247, 248, 251));

                jPanel27.setBackground(new java.awt.Color(255, 255, 255));
                jPanel27.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 4, true));
                jPanel27.setForeground(new java.awt.Color(0, 0, 0));

                jLabel73.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
                jLabel73.setForeground(new java.awt.Color(98, 62, 218));
                jLabel73.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel73.setText("LOGIN");

                jLabel76.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel76.setForeground(new java.awt.Color(0, 0, 0));
                jLabel76.setText("Nome de Usuário");

                jTextField38.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jTextField38ActionPerformed(evt);
                        }
                });

                jLabel77.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel77.setForeground(new java.awt.Color(0, 0, 0));
                jLabel77.setText("Senha");

                jButton74.setBackground(new java.awt.Color(98, 62, 218));
                jButton74.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
                jButton74.setForeground(new java.awt.Color(255, 255, 255));
                jButton74.setText("ENTRAR");
                jButton74.setBorder(null);
                jButton74.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                jButton74.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                try {
                                        jButton74ActionPerformed(evt);
                                } catch (HeadlessException | SQLException e) {
                                        // TODO Auto-generated catch block
                                        e.printStackTrace();
                                }
                        }
                });

                javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
                jPanel27.setLayout(jPanel27Layout);
                jPanel27Layout.setHorizontalGroup(
                                jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout
                                                                .createSequentialGroup()
                                                                .addContainerGap(22, Short.MAX_VALUE)
                                                                .addGroup(jPanel27Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                jPanel27Layout
                                                                                                                .createSequentialGroup()
                                                                                                                .addGroup(jPanel27Layout
                                                                                                                                .createParallelGroup(
                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                                false)
                                                                                                                                .addComponent(jLabel77)
                                                                                                                                .addComponent(jLabel76)
                                                                                                                                .addComponent(jTextField38)
                                                                                                                                .addComponent(jPasswordField1,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                350,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                .addContainerGap(
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                Short.MAX_VALUE))
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                jPanel27Layout.createSequentialGroup()
                                                                                                                .addComponent(jButton74,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                102,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addGap(138, 138,
                                                                                                                                138))))
                                                .addGroup(jPanel27Layout.createSequentialGroup()
                                                                .addContainerGap(130, Short.MAX_VALUE)
                                                                .addComponent(jLabel73,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                125,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 130, Short.MAX_VALUE)));
                jPanel27Layout.setVerticalGroup(
                                jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel27Layout.createSequentialGroup()
                                                                .addContainerGap(35, Short.MAX_VALUE)
                                                                .addComponent(jLabel73,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                30,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                31,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(jLabel76)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jTextField38,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jLabel77)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jPasswordField1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(46, 46, 46)
                                                                .addComponent(jButton74,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                30,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(59, Short.MAX_VALUE)));

                javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
                jPanel26.setLayout(jPanel26Layout);
                jPanel26Layout.setHorizontalGroup(
                                jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel26Layout.createSequentialGroup()
                                                                .addContainerGap(270, Short.MAX_VALUE)
                                                                .addComponent(jPanel27,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(267, Short.MAX_VALUE)));
                jPanel26Layout.setVerticalGroup(
                                jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel26Layout.createSequentialGroup()
                                                                .addContainerGap(145, Short.MAX_VALUE)
                                                                .addComponent(jPanel27,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(146, Short.MAX_VALUE)));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void jTextField38ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextField38ActionPerformed

        }// GEN-LAST:event_jTextField38ActionPerformed

        private void jButton74ActionPerformed(java.awt.event.ActionEvent evt) throws HeadlessException, SQLException {// GEN-FIRST:event_jButton74ActionPerformed

                String nickName = jTextField38.getText();
                String passwordUser = new String(jPasswordField1.getPassword());

                if (passwordUser.isEmpty() || nickName.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Preencha todos os campos!", "Campo vazio",
                                        JOptionPane.ERROR_MESSAGE);
                } else {
                        if (checkIfUserExists(nickName, passwordUser)) {
                                TasksScreen t = new TasksScreen(id);
                                t.setVisible(true); // abre a tela com todas as tarefas do usuário
                                this.setVisible(false); // fecha a tela de login

                                t.userID(id);

                                return;
                        } else {
                                JOptionPane.showMessageDialog(null, "Usuário ou senha incorretos!", "Erro",
                                                JOptionPane.ERROR_MESSAGE);
                        }
                }

        }

        private boolean checkIfUserExists(String nameUser, String tPassword) throws SQLException {
                BDD bdd = new BDD();
                ResultSet resultSet = bdd.listaUsuario();
                while (resultSet.next()) {
                        String nick_name = resultSet.getString("nick_name");

                        if (nameUser.equals(nick_name)) {
                                ResultSet resultSet2 = bdd.checkUser(nameUser);
                                while (resultSet2.next()) {
                                        String password2 = resultSet2.getString("password");
                                        if (tPassword.equals(password2)) {
                                                System.out.println("Senha correta");
                                                id = resultSet2.getInt("user_id");
                                                return true;
                                        }
                                        System.out.println("Senha incorreta");

                                }
                        }
                }
                System.out.println("Usuário não existe");
                return false;
        }

        /**
         * @param args the command line arguments
         */
        
        public static void main(String args[]) {

                try {
                        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
                                        .getInstalledLookAndFeels()) {
                                if ("Nimbus".equals(info.getName())) {
                                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                                        break;
                                }
                        }
                } catch (ClassNotFoundException ex) {
                        java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                }
                // </editor-fold>

                /* Create and display the form */
                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new LoginScreen().setVisible(true);
                        }
                });
        }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton jButton74;
        private javax.swing.JLabel jLabel73;
        private javax.swing.JLabel jLabel76;
        private javax.swing.JLabel jLabel77;
        private javax.swing.JPanel jPanel26;
        private javax.swing.JPanel jPanel27;
        private javax.swing.JTextField jTextField38;
        private javax.swing.JPasswordField jPasswordField1;
        // End of variables declaration//GEN-END:variables
}
