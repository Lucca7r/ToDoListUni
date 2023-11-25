package br.com.best.view;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;

import br.com.best.util.BDD;
//import javax.scene.paint.Color;
import java.sql.SQLException;

/**
 *
 * @web http://java-buddy.blogspot.com/
 */
public class exemplo extends JFrame {
    public int id;
    static exemplo myFrame;
    static int countMe = 0;
    JScrollPane mainPanel;
    JPanel panel = new JPanel();

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }

    void userID(int id) {
        System.out.println("AllTasksScreen: " + id);
        this.id = id;
    }

    public static void createAndShowGUI() {
        myFrame = new exemplo();
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.prepareUI();
        myFrame.pack();
        myFrame.setVisible(true);
    }

    public void prepareUI() {
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        printarTarefas();

        JButton buttonAdd = new JButton("CRIAR NOVA TAREFA");

        buttonAdd.setBackground(new java.awt.Color(98, 62, 218));
        buttonAdd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonAdd.setForeground(new java.awt.Color(255, 255, 255));
        buttonAdd.setText("CRIAR NOVA TAREFA");
        buttonAdd.setBorder(null);
        buttonAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        buttonAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NewTaskScreen t = new NewTaskScreen(); // abre a tela de criação de tarefas
                t.setVisible(true);
                this.setVisible(false); // fecha a tela de tarefas

                t.userID(id);
                System.out.println("AAAA: " + id);
            }

            private void setVisible(boolean b) {
            }
        });

        mainPanel = new JScrollPane(panel);

        getContentPane().add(mainPanel, BorderLayout.CENTER);
        getContentPane().add(buttonAdd, BorderLayout.PAGE_START);
    }

    public class subPanel extends JPanel {

        subPanel me;

        public subPanel(String startDate, String endDate, String name, String priority) {
            super();
            me = this;
            this.setBackground(new java.awt.Color(255, 255, 255));
            this.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 4, true));
            this.setForeground(new java.awt.Color(0, 0, 0));

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

            JLabel labelPrioridade = new javax.swing.JLabel();
            labelPrioridade.setForeground(new java.awt.Color(0, 0, 0));
            labelPrioridade.setText("labelPrioridade");
            labelPrioridade.setText(priority);

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
            this.setLayout(layout);
            layout.setHorizontalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                    .addComponent(checkboxTarefa)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                            262, Short.MAX_VALUE)
                                                    .addComponent(labelPrioridade))
                                            .addGroup(layout.createSequentialGroup()
                                                    .addGap(21, 21, 21)
                                                    .addGroup(layout
                                                            .createParallelGroup(
                                                                    javax.swing.GroupLayout.Alignment.LEADING)
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
                                            .addComponent(labelPrioridade))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(labelDataInicio)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                            javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelDataTermino)
                                    .addContainerGap()));
        }
    }

    public void printarTarefas() {
        BDD bdd = new BDD();
        try {
            ResultSet resultSet = bdd.listaTarefas(4);
            if (resultSet != null) {
                while (resultSet.next()) {
                    String name = resultSet.getString("name");
                    String startDate = resultSet.getString("start_date");
                    String endDate = resultSet.getString("end_date");
                    String priority = resultSet.getString("priority");

                    panel.add(new subPanel(startDate, endDate, name, priority));
                    myFrame.pack();
                }
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return;
    }
}