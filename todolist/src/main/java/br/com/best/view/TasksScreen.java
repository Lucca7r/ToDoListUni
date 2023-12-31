package br.com.best.view;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.text.SimpleDateFormat;
import java.text.ParseException;

import br.com.best.util.BDD;

/**
 *
 * @author Lorrana
 */
public class TasksScreen extends javax.swing.JFrame {
        public static int id;

        public TasksScreen(int id) {
                this.id = id;
                initComponents();
                printarTarefas(id);
                setExtendedState(JFrame.MAXIMIZED_BOTH);
                this.pack();
        }
        
        void userID(int id) {
                System.out.println("TasksScreen: " + id);
                this.id = id;
        }

        @SuppressWarnings("unchecked")
        private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        javax.swing.JScrollPane jScrollPane = new javax.swing.JScrollPane(); // Added JScrollPane
        jScrollPane.setPreferredSize(new java.awt.Dimension(600, 400));
        jPanel3 = new javax.swing.JPanel();
        jPanel3.setLayout(new BoxLayout(jPanel3, BoxLayout.Y_AXIS));
        jLabel1 = new javax.swing.JLabel();

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

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 4, true));
        jPanel3.setForeground(new java.awt.Color(0, 0, 0));

        jPanel3.setLayout(new BoxLayout(jPanel3, BoxLayout.Y_AXIS)); // Set layout manager to BoxLayout

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(98, 62, 218));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setLabelFor(jPanel1);
        jLabel1.setText("GERENCIADOR DE TAREFAS");
        jLabel1.setToolTipText("");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        // Add jScrollPane to jPanel1
        jScrollPane.setViewportView(jPanel3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(278, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(
                                        javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jScrollPane, // Change here
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                Short.MAX_VALUE)
                                        .addComponent(jLabel1,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                404,
                                                Short.MAX_VALUE))
                                .addContainerGap(278, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout
                                .createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                        Short.MAX_VALUE)
                                .addComponent(jButton1,
                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                        188,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                        Short.MAX_VALUE)));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel1,
                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                        22,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(jButton1,
                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                        30,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(
                                        javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane, // Change here
                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                        Short.MAX_VALUE)
                                .addContainerGap()));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        pack();

        // System.out.println("teste:" + id);
        // printarTarefas(id);
        }


        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
                NewTaskScreen e = new NewTaskScreen();
                System.out.println("tarefaaaaaaaa");
                e.setVisible(true); // abre a tela com todas as tarefas do usuário
                this.setVisible(false); // fecha a tela de login

                e.userID(id);
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
                        java.util.logging.Logger.getLogger(TasksScreen.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(TasksScreen.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(TasksScreen.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(TasksScreen.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                }

                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                TasksScreen tasksScreen = new TasksScreen(id);
                                tasksScreen.setVisible(true);
                                tasksScreen.printarTarefas(id);
                        }
                });
        }

        public class subPanel extends JPanel {

                subPanel me;

                public subPanel(String startDate, String endDate, String name, String priority, int task_id) {
                        super();
                        me = this;
                        this.setBackground(new java.awt.Color(255, 255, 255));
                        this.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 4, true));
                        this.setForeground(new java.awt.Color(0, 0, 0));

                        SimpleDateFormat fromUser = new SimpleDateFormat("yyyy-MM-dd");
                        SimpleDateFormat myFormat = new SimpleDateFormat("dd/MM/yyyy");

                        try {
                                startDate = myFormat.format(fromUser.parse(startDate));
                                endDate = myFormat.format(fromUser.parse(endDate));
                        } catch (ParseException e) {
                                e.printStackTrace();
                        }

                        JLabel labelDataInicio = new javax.swing.JLabel();
                        labelDataInicio.setForeground(new java.awt.Color(0, 0, 0));
                        labelDataInicio.setText("labelDataInicio");
                        labelDataInicio.setText(startDate);

                        JLabel labelDataTermino = new javax.swing.JLabel();
                        labelDataTermino.setBackground(new java.awt.Color(0, 0, 0));
                        labelDataTermino.setForeground(new java.awt.Color(0, 0, 0));
                        labelDataTermino.setText("labelDataTermino");
                        labelDataTermino.setText(endDate);

                        JCheckBox checkboxTarefa = new javax.swing.JCheckBox();
                        checkboxTarefa.setForeground(new java.awt.Color(0, 0, 0));
                        checkboxTarefa.setText("checkboxTarefa");
                        checkboxTarefa.setText(name);

                        JButton labelPrioridade = new javax.swing.JButton();
                        labelPrioridade.setForeground(new java.awt.Color(0, 0, 0));
                        labelPrioridade.setText("labelPrioridade");
                        labelPrioridade.setText(priority);

                        
                        if ("Urgente".equals(priority)) {
                                labelPrioridade.setBackground(new java.awt.Color(245,93,30));
                        } else if ("Alta".equals(priority)) {
                                labelPrioridade.setBackground(new java.awt.Color(253, 152, 0));
                        } else if ("Média".equals(priority)) {
                                labelPrioridade.setBackground(new java.awt.Color(255, 247, 87));
                        } else if ("Baixa".equals(priority)) {
                                labelPrioridade.setBackground(new java.awt.Color(181, 214, 167));
                        } else {
                                labelPrioridade.setBackground(new java.awt.Color(255, 255, 255));
                        }

                        JButton deleteButton = new javax.swing.JButton();
                        deleteButton.setText("Delete");
                        deleteButton.addActionListener(new java.awt.event.ActionListener() {
                                public void actionPerformed(java.awt.event.ActionEvent evt) {
                                        // handle delete action here
                                        BDD bdd = new BDD();
                                        try {
                                                bdd.deleteTarefa(task_id);
                                                JOptionPane.showMessageDialog(null, "Tarefa excluida", "Sucesso",
                                                                JOptionPane.INFORMATION_MESSAGE);
                                        } catch (SQLException e) {
                                                JOptionPane.showMessageDialog(null,
                                                                "Não foi possivel excluir tente novamente!", "Erro",
                                                                JOptionPane.ERROR_MESSAGE);
                                                e.printStackTrace();
                                        }

                                        TasksScreen.this.setVisible(false);
                                        TasksScreen t = new TasksScreen(id); // cria a tela de tarefas
                                        t.setVisible(true);

                                }

                        });

                        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                        this.setLayout(layout);
                        layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                        .addComponent(checkboxTarefa)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(deleteButton)  // Add deleteButton here
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 262, Short.MAX_VALUE)
                                        .addComponent(labelPrioridade))
                                        .addGroup(layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(labelDataTermino)
                                                .addComponent(labelDataInicio))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap()));
                        layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(checkboxTarefa)
                                        .addComponent(deleteButton)  // Add deleteButton here
                                        .addComponent(labelPrioridade))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelDataInicio)
                                .addGap(10, 10, 10)  // Add a fixed gap of 10 pixels
                                .addComponent(labelDataTermino)
                                .addContainerGap()));
                }
        }

        public void printarTarefas(int id) {
                BDD bdd = new BDD();
                try {
                        System.out.println(id);
                        ResultSet resultSet = bdd.listaTarefas(id);
                        if (resultSet != null) {
                                while (resultSet.next()) {
                                        String name = resultSet.getString("name");
                                        String startDate = resultSet.getString("start_date");
                                        String endDate = resultSet.getString("end_date");
                                        String priority = resultSet.getString("priority");
                                        int task_id = resultSet.getInt("task_id");
                                        System.out.println(task_id);
                                        jPanel3.add(new subPanel(startDate, endDate, name, priority, task_id));
                                }
                                jPanel3.revalidate();
                                jPanel3.repaint();
                        }

                } catch (SQLException ex) {
                        ex.printStackTrace();
                }
        }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton jButton1;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JPanel jPanel3;
        // End of variables declaration//GEN-END:variables
}
