
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
import javafx.scene.paint.Color;
import java.sql.SQLException;

/**
 *
 * @web http://java-buddy.blogspot.com/
 */
public class exemplo extends JFrame {

    static exemplo myFrame;
    static int countMe = 0;
    JScrollPane mainPanel;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }

    private static void createAndShowGUI() {
        myFrame = new exemplo();
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.prepareUI();
        myFrame.pack();
        myFrame.setVisible(true);
    }

    private void prepareUI() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JButton buttonAdd = new JButton("Add subPanel");
        buttonAdd.addActionListener(new ActionListener() {
            // String startDate = "01/01/2021";
            // String endDate = "01/01/2021";
            // String name = "Tarefa";

            @Override
            public void actionPerformed(ActionEvent e) {
                BDD bdd = new BDD();
                try {
                    ResultSet resultSet = bdd.listaTarefas(4);
                    while (resultSet.next()) {
                        String name = resultSet.getString("name");
                        String startDate = resultSet.getString("start_date");
                        String endDate = resultSet.getString("end_date");
                        String priority = resultSet.getString("priority"); 
                        
                        System.out.println(name);
                        System.out.println(startDate);
                        System.out.println(endDate);

                        panel.add(new subPanel(startDate, endDate, name, priority));
                        myFrame.pack();
                    }

                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });

        JButton buttonAddTarefa = new JButton("Criar Tarefa");

        // JButton buttonRemoveAll = new JButton("Remove All");
        // buttonRemoveAll.addActionListener(new ActionListener() {

        //     @Override
        //     public void actionPerformed(ActionEvent e) {
        //         panel.removeAll();
        //         myFrame.pack();
        //     }
        // });

        mainPanel = new JScrollPane(panel);

        getContentPane().add(mainPanel, BorderLayout.CENTER);
        getContentPane().add(buttonAdd, BorderLayout.PAGE_START);
        getContentPane().add(buttonAddTarefa, BorderLayout.PAGE_END);
        // getContentPane().add(buttonRemoveAll, BorderLayout.PAGE_END);
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
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 262, Short.MAX_VALUE)
                                .addComponent(labelPrioridade))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelDataTermino)
                                    .addComponent(labelDataInicio))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(checkboxTarefa)
                            .addComponent(labelPrioridade))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelDataInicio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelDataTermino)
                        .addContainerGap())
            );
        }
    }
}
