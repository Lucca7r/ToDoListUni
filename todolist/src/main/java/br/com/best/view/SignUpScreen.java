package br.com.best.view;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import br.com.best.model.Tarefa;
import br.com.best.model.Usuario;
import br.com.best.util.BDD;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Lorrana
 */
public class SignUpScreen extends javax.swing.JFrame {
        public int id;

        /**
         * Creates new form SignUpScreen
         */

        public SignUpScreen() {
                initComponents();
                setExtendedState(JFrame.MAXIMIZED_BOTH);
        }

        void userID(int id) {
                System.out.println("new user: " + id);
                this.id = id;
        }

        /**
         * This method is called from within the constructor to initialize the form.
         * WARNING: Do NOT modify this code. The content of this method is always
         * regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated
        // Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jPanel25 = new javax.swing.JPanel();
                jPanel26 = new javax.swing.JPanel();
                jPanel27 = new javax.swing.JPanel();
                jLabel73 = new javax.swing.JLabel();
                jLabel74 = new javax.swing.JLabel();
                jTextField37 = new javax.swing.JTextField();
                jLabel76 = new javax.swing.JLabel();
                jTextField38 = new javax.swing.JTextField();
                jLabel77 = new javax.swing.JLabel();
                jPasswordField1 = new javax.swing.JPasswordField();
                jButton74 = new javax.swing.JButton();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jPanel25.setBackground(new java.awt.Color(247, 248, 251));

                jPanel26.setBackground(new java.awt.Color(247, 248, 251));

                jPanel27.setBackground(new java.awt.Color(255, 255, 255));
                jPanel27.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 4, true));
                jPanel27.setForeground(new java.awt.Color(0, 0, 0));

                jLabel73.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
                jLabel73.setForeground(new java.awt.Color(98, 62, 218));
                jLabel73.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel73.setText("INSCREVA-SE");

                jLabel74.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel74.setForeground(new java.awt.Color(0, 0, 0));
                jLabel74.setText("Nome");

                jTextField37.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jTextField37ActionPerformed(evt);
                        }
                });

                jLabel76.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel76.setForeground(new java.awt.Color(0, 0, 0));
                jLabel76.setText("Nickname");

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
                jButton74.setText("CADASTRAR");
                jButton74.setBorder(null);
                jButton74.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                jButton74.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                try {
                                        jButton74ActionPerformed(evt);
                                } catch (ClassNotFoundException | SQLException e) {
                                        System.out.println("Erro ao cadastrar usuário");
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
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addGroup(jPanel27Layout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                false)
                                                                                .addComponent(jLabel77)
                                                                                .addComponent(jLabel76)
                                                                                .addComponent(jTextField37)
                                                                                .addComponent(jTextField38)
                                                                                .addComponent(jPasswordField1,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                350,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabel74))
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE))
                                                .addGroup(jPanel27Layout.createSequentialGroup()
                                                                .addGroup(jPanel27Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel27Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(144, 144, 144)
                                                                                                .addComponent(jButton74,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                102,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(jPanel27Layout
                                                                                                .createSequentialGroup()
                                                                                                .addContainerGap(130,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addComponent(jLabel73,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                125,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addContainerGap(130, Short.MAX_VALUE)));
                jPanel27Layout.setVerticalGroup(
                                jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel27Layout.createSequentialGroup()
                                                                .addContainerGap(32, Short.MAX_VALUE)
                                                                .addComponent(jLabel73,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                30,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(jLabel74)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jTextField37,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
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
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                20,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(jButton74,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                30,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(14, Short.MAX_VALUE)));

                javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
                jPanel26.setLayout(jPanel26Layout);
                jPanel26Layout.setHorizontalGroup(
                                jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel26Layout.createSequentialGroup()
                                                                .addContainerGap(271, Short.MAX_VALUE)
                                                                .addComponent(jPanel27,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(297, Short.MAX_VALUE)));
                jPanel26Layout.setVerticalGroup(
                                jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel26Layout.createSequentialGroup()
                                                                .addContainerGap(147, Short.MAX_VALUE)
                                                                .addComponent(jPanel27,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(152, Short.MAX_VALUE)));

                javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
                jPanel25.setLayout(jPanel25Layout);
                jPanel25Layout.setHorizontalGroup(
                                jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
                jPanel25Layout.setVerticalGroup(
                                jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

                pack();
        }

        private void jTextField38ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextField38ActionPerformed

        }

        private void jButton74ActionPerformed(java.awt.event.ActionEvent evt)
                        throws ClassNotFoundException, SQLException {

                String nameUser = jTextField37.getText();
                String nickName = jTextField38.getText();
                String passwordUser = new String(jPasswordField1.getPassword());

                if (nameUser.isEmpty() || nickName.isEmpty() || passwordUser.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Preencha todos os campos!", "Campo vazio",
                                        JOptionPane.ERROR_MESSAGE);
                } else {
                        if (checkIfUserExists(nameUser)) {
                                JOptionPane.showMessageDialog(null, "Usuário já existe!", "Erro",
                                                JOptionPane.ERROR_MESSAGE);
                                return;
                        }

                        Usuario newUser = new Usuario();
                        newUser.setName(nameUser);
                        newUser.setNickName(nickName);
                        newUser.setPassword(passwordUser);

                        new BDD().inserirUsuario(newUser);

                        JOptionPane.showMessageDialog(null, "Deu tudo certo!", "Sucesso",
                                        JOptionPane.INFORMATION_MESSAGE);
                        LoginScreen l = new LoginScreen();
                        l.setVisible(true); // abre a tela de login
                        this.setVisible(false); // fecha a tela de cadastro
                }

        }

        private boolean checkIfUserExists(String nameUser) throws SQLException {
                BDD bdd = new BDD();
                ResultSet resultSet = bdd.listaUsuario();
                while (resultSet.next()) {
                        String nick_name = resultSet.getString("nick_name");

                        if (nameUser.equals(nick_name)) {
                                return true;
                        }
                }
                return false;
        }

        private void jTextField37ActionPerformed(java.awt.event.ActionEvent evt) {

        }

        /**
         * @param args the command line arguments
         */
        public static void main(String args[]) {
                /* Set the Nimbus look and feel */
                // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
                // (optional) ">
                /*
                 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
                 * look and feel.
                 * For details see
                 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
                 */
                try {
                        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
                                        .getInstalledLookAndFeels()) {
                                if ("Nimbus".equals(info.getName())) {
                                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                                        break;
                                }
                        }
                } catch (ClassNotFoundException ex) {
                        java.util.logging.Logger.getLogger(SignUpScreen.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(SignUpScreen.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(SignUpScreen.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(SignUpScreen.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                }
                // </editor-fold>

                /* Create and display the form */
                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new SignUpScreen().setVisible(true);
                        }
                });
        }

        // Variables declaration - do not modify//GEN-BEGIN:variables

        private javax.swing.JButton jButton74;
        private javax.swing.JLabel jLabel73;
        private javax.swing.JLabel jLabel74;
        private javax.swing.JLabel jLabel76;
        private javax.swing.JLabel jLabel77;
        private javax.swing.JPanel jPanel25;
        private javax.swing.JPanel jPanel26;
        private javax.swing.JPanel jPanel27;
        private javax.swing.JTextField jTextField37;
        private javax.swing.JTextField jTextField38;
        private javax.swing.JPasswordField jPasswordField1;
        // End of variables declaration//GEN-END:variables
}
