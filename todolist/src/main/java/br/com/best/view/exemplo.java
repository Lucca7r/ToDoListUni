
package br.com.best.view;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;

// import javafx.scene.paint.Color;

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

            @Override
            public void actionPerformed(ActionEvent e) {
                panel.add(new subPanel());
                myFrame.pack();
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

    private class subPanel extends JPanel {

        subPanel me;

        public subPanel() {
            super();
            me = this;
            this.setBackground(new java.awt.Color(255, 255, 255));
            this.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 4, true));
            this.setForeground(new java.awt.Color(0, 0, 0));
        
            JLabel labelDataInicio = new javax.swing.JLabel();
            labelDataInicio.setForeground(new java.awt.Color(0, 0, 0));
            labelDataInicio.setText("labelDataInicio");
        
            JLabel labelDataTermino = new javax.swing.JLabel();
            labelDataTermino.setBackground(new java.awt.Color(0, 0, 0));
            labelDataTermino.setForeground(new java.awt.Color(0, 0, 0));
            labelDataTermino.setText("labelDataTermino");
        
            JCheckBox checkboxTarefa = new javax.swing.JCheckBox();
            checkboxTarefa.setForeground(new java.awt.Color(0, 0, 0));
            checkboxTarefa.setText("checkboxTarefa");
        
            JLabel labelPrioridade = new javax.swing.JLabel();
            labelPrioridade.setForeground(new java.awt.Color(0, 0, 0));
            labelPrioridade.setText("labelPrioridade");
        
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
