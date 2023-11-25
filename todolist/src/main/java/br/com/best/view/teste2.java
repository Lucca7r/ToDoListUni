package br.com.best.view;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;
import br.com.best.model.Tarefa;
import java.util.List;
import java.util.List;





public class teste2 extends JFrame {

    static teste2 myFrame;
    static int countMe = 0;
    JScrollPane mainPanel;


    public static void main(String[] args) {
        
          SwingUtilities.invokeLater(() -> {
              createAndShowGUI();
          });
      }
      
      private static void createAndShowGUI() {
        myFrame = new teste2();
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.prepareUI();
        myFrame.pack();
        myFrame.setVisible(true);
    }


    private void prepareUI() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JButton buttonAdd = new JButton("Atualizar Tarefas");
        buttonAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                List<Tarefa> tarefas = listaTarefas();

                // Limpa o painel antes de adicionar novas tarefas
                panel.removeAll();

                // Adiciona subpainéis com as novas tarefas
                for (Tarefa tarefa : tarefas) {
                    panel.add(new SubPanel(tarefa));
                }
            }
        });
    }

    private class subPanel extends JPanel {
        

        subPanel me;

        public subPanel(Tarefa t) {
            super();
            me = this;
            this.setBackground(new java.awt.Color(255, 255, 255));
            this.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 4, true));
            this.setForeground(new java.awt.Color(0, 0, 0));
            
        
            JLabel labelDataInicio = new javax.swing.JLabel();
            labelDataInicio.setForeground(new java.awt.Color(0, 0, 0));
            labelDataInicio.setText("labelDataInicio");
            labelDataInicio.setText(new SimpleDateFormat("yyyy-MM-dd").format(t.getStartDate()));

            JLabel labelDataTermino = new javax.swing.JLabel();
            labelDataTermino.setBackground(new java.awt.Color(0, 0, 0));
            labelDataTermino.setForeground(new java.awt.Color(0, 0, 0));
            labelDataTermino.setText("labelDataTermino");
            labelDataTermino.setText(new SimpleDateFormat("yyyy-MM-dd").format(t.getEndDate()));

            JCheckBox checkboxTarefa = new javax.swing.JCheckBox();
            checkboxTarefa.setForeground(new java.awt.Color(0, 0, 0));
            checkboxTarefa.setText("checkboxTarefa");
            labelDataInicio.setText(t.getName());

            JLabel labelPrioridade = new javax.swing.JLabel();
            labelPrioridade.setForeground(new java.awt.Color(0, 0, 0));
            labelPrioridade.setText("labelPrioridade");
            labelDataInicio.setText(t.getPriority());
        
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

    private List<Tarefa> listaTarefas() {
        // Implement your logic to retrieve the list of tasks
        return null;
    }

    private class SubPanel extends JPanel {

        public SubPanel(Tarefa tarefa) {
        }
        // Implement your SubPanel logic here
    }


}

