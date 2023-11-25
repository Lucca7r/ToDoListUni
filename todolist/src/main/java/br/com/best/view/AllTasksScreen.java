package br.com.best.view;

import javax.swing.*;

import br.com.best.model.Tarefa;
import br.com.best.util.BDD;

import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.Toolkit;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Lorrana
 */

public class AllTasksScreen extends javax.swing.JFrame {
        public int id;
        /**
         * Creates new form AllTasksScreen
         */
        public AllTasksScreen() {
                initComponents();
        }

        public void close() {
                WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
                Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
        }

        void userID(int id) {
                System.out.println("AllTasksScreen: " + id);
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

                jPanel1 = new javax.swing.JPanel();// painel principal
                jButton1 = new javax.swing.JButton(); // criar nova tarefa
                jButton2 = new javax.swing.JButton(); // filtrar
                jPanel3 = new javax.swing.JPanel(); // tarefa 1
                jCheckBox1 = new javax.swing.JCheckBox(); // checkbox
                jLabel2 = new javax.swing.JLabel(); // data de inicio
                jLabel3 = new javax.swing.JLabel();// data de fim
                jLabel4 = new javax.swing.JLabel();// prioridade
                jLabel1 = new javax.swing.JLabel();// titulo
                jPanel4 = new javax.swing.JPanel();// tarefa 2
                jCheckBox2 = new javax.swing.JCheckBox();// checkbox
                jLabel5 = new javax.swing.JLabel();// data de inicio
                jLabel6 = new javax.swing.JLabel();// data de fim
                jLabel7 = new javax.swing.JLabel();// prioridade

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jPanel1.setBackground(new java.awt.Color(247, 248, 251));

                jButton1.setBackground(new java.awt.Color(98, 62, 218));
                jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
                jButton1.setForeground(new java.awt.Color(255, 255, 255));
                jButton1.setText("CRIAR NOVA TAREFA");
                jButton1.setBorder(null);
                jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                jButton1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton1ActionPerformed(evt);
                        }
                });

                jButton2.setBackground(new java.awt.Color(98, 62, 218));
                jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
                jButton2.setForeground(new java.awt.Color(255, 255, 255));
                jButton2.setText("FILTRAR");
                jButton2.setBorder(null);
                jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                jButton2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                try {
                                        jButton2ActionPerformed(evt);
                                } catch (SQLException e) {
                                        // TODO Auto-generated catch block
                                        e.printStackTrace();
                                }
                        }
                });

                jPanel3.setBackground(new java.awt.Color(255, 255, 255));
                jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 4, true));
                jPanel3.setForeground(new java.awt.Color(0, 0, 0));

                jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
                jCheckBox1.setForeground(new java.awt.Color(0, 0, 0));
                jCheckBox1.setText("Estudar");
                jCheckBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jCheckBox1ActionPerformed(evt);
                        }
                });

                jLabel2.setForeground(new java.awt.Color(0, 0, 0));
                jLabel2.setText("21/10/2023 - 18:00");

                jLabel3.setForeground(new java.awt.Color(0, 0, 0));
                jLabel3.setText("21/10/2023 - 23:00");

                jLabel4.setBackground(new java.awt.Color(182, 214, 168));
                jLabel4.setForeground(new java.awt.Color(0, 0, 0));
                jLabel4.setText("Baixa");
                jLabel4.setToolTipText("");
                jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

                javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
                jPanel3.setLayout(jPanel3Layout);
                jPanel3Layout.setHorizontalGroup(
                                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(jPanel3Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel3Layout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(jCheckBox1)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addComponent(jLabel4))
                                                                                .addGroup(jPanel3Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(21, 21, 21)
                                                                                                .addGroup(jPanel3Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(jLabel3)
                                                                                                                .addComponent(jLabel2))
                                                                                                .addGap(0, 0, Short.MAX_VALUE)))
                                                                .addContainerGap()));
                jPanel3Layout.setVerticalGroup(
                                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(jPanel3Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jCheckBox1)
                                                                                .addComponent(jLabel4))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel2)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel3)
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));

                jLabel1.setBackground(new java.awt.Color(0, 0, 0));
                jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
                jLabel1.setForeground(new java.awt.Color(98, 62, 218));
                jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel1.setLabelFor(jPanel1);
                jLabel1.setText("GERENCIADOR DE TAREFAS");
                jLabel1.setToolTipText("");
                jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

                jPanel4.setBackground(new java.awt.Color(255, 255, 255));
                jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 4, true));
                jPanel4.setForeground(new java.awt.Color(0, 0, 0));

                jCheckBox2.setBackground(new java.awt.Color(255, 255, 255));
                jCheckBox2.setForeground(new java.awt.Color(0, 0, 0));
                jCheckBox2.setText("Pagar Boleto");
                jCheckBox2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jCheckBox2ActionPerformed(evt);
                        }
                });

                jLabel5.setForeground(new java.awt.Color(0, 0, 0));
                jLabel5.setText("05/11/2023 - 14:00");

                jLabel6.setForeground(new java.awt.Color(0, 0, 0));
                jLabel6.setText("05/11/2023 - 14:05");

                jLabel7.setBackground(new java.awt.Color(182, 214, 168));
                jLabel7.setForeground(new java.awt.Color(100, 0, 0));
                jLabel7.setText("Alta");
                jLabel7.setToolTipText("");
                jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(100, 0, 0)));

                javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
                jPanel4.setLayout(jPanel4Layout);
                jPanel4Layout.setHorizontalGroup(
                                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel4Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(jPanel4Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel4Layout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(jCheckBox2)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addComponent(jLabel7))
                                                                                .addGroup(jPanel4Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(21, 21, 21)
                                                                                                .addGroup(jPanel4Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(jLabel6)
                                                                                                                .addComponent(jLabel5))
                                                                                                .addGap(0, 0, Short.MAX_VALUE)))
                                                                .addContainerGap()));
                jPanel4Layout.setVerticalGroup(
                                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel4Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(jPanel4Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jCheckBox2)
                                                                                .addComponent(jLabel7))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel5)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel6)
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addContainerGap(278, Short.MAX_VALUE)
                                                                .addGroup(jPanel1Layout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                false)
                                                                                .addComponent(jPanel3,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(jButton2,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                61,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addGap(206, 206, 206)
                                                                                                .addComponent(jButton1,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                137,
                                                                                                                Short.MAX_VALUE))
                                                                                .addComponent(jLabel1,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(jPanel4,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE))
                                                                .addContainerGap(278, Short.MAX_VALUE)));
                jPanel1Layout.setVerticalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addContainerGap(27, Short.MAX_VALUE)
                                                                .addComponent(jLabel1,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addGap(38, 38, 38)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.CENTER)
                                                                                .addComponent(jButton2,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                30,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jButton1,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE))
                                                                .addGap(37, 37, 37)
                                                                .addComponent(jPanel3,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, Short.MAX_VALUE)
                                                                .addComponent(jPanel4,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(279, Short.MAX_VALUE)));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE));

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
                NewTaskScreen t = new NewTaskScreen(); // abre a tela de criação de tarefas
                t.setVisible(true);
                this.setVisible(false); // fecha a tela de tarefas

                t.userID(id);
                System.out.println("AAAA: " + id);
                
        }

        private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {// GEN-FIRST:event_jButton2ActionPerformed
                System.out.println("Button clicked!");

                BDD bdd = new BDD();

                ResultSet resultSet = bdd.listaTarefas(4);

                while (resultSet.next()) {
                        String name = resultSet.getString("name");
                        String priority = resultSet.getString("priority");
                        Date startDate = resultSet.getDate("start_date");
                        Date endDate = resultSet.getDate("end_date");


                        jCheckBox1.setText(name);
                        jLabel4.setText(priority);
                        jLabel2.setText(startDate.toString());
                        jLabel3.setText(endDate.toString());

                }

        }// GEN-LAST:event_jButton2ActionPerformed

        private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jCheckBox1ActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_jCheckBox1ActionPerformed

        private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jCheckBox2ActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_jCheckBox2ActionPerformed

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
                        java.util.logging.Logger.getLogger(AllTasksScreen.class.getName()).log(java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(AllTasksScreen.class.getName()).log(java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(AllTasksScreen.class.getName()).log(java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(AllTasksScreen.class.getName()).log(java.util.logging.Level.SEVERE,
                                        null, ex);
                }
                // </editor-fold>

                /* Create and display the form */
                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new AllTasksScreen().setVisible(true);
                        }
                });

                /*
                 * jButton1.actionPerformed(new java.awt.event.ActionListener() {
                 * public void actionPerformed(java.awt.event.ActionEvent evt) {
                 * // Carrega a tela da classe TaksScreen
                 * TaskScreen tasksScreen = new TaskScreen();
                 * tasksScreen.setVisible(true);
                 * }
                 * });
                 */

                jButton1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                // Carrega a tela da classe TaksScreen
                                System.out.println("Button clicked!");
                                NewTaskScreen tasksScreen = new NewTaskScreen();
                                tasksScreen.setVisible(true);
                        }
                });
        }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private static javax.swing.JButton jButton1;
        private javax.swing.JButton jButton2;
        private javax.swing.JCheckBox jCheckBox1;
        private javax.swing.JCheckBox jCheckBox2;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JLabel jLabel7;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JPanel jPanel3;
        private javax.swing.JPanel jPanel4;
        // End of variables declaration//GEN-END:variables
}
