package br.com.best.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class test {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Soma de dois números");
        frame.setSize(700, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);

        JLabel label1 = new JLabel("Digite o primeiro número:");
        JTextField textField1 = new JTextField();
        JLabel label2 = new JLabel("Digite o segundo número:");
        JTextField textField2 = new JTextField();
        JButton button = new JButton("Somar");
        JLabel label3 = new JLabel("Resultado:");
        JTextArea textArea = new JTextArea();

        textField1.setBounds(100, 100, 200, 200);
        textField2.setBounds(100, 400, 200, 200);

        panel.add(label1);
        panel.add(textField1);
        panel.add(label2);
        panel.add(textField2);
        panel.add(button);
        panel.add(label3);
        panel.add(textArea);

        button.addActionListener(e -> {
            int number1 = Integer.parseInt(textField1.getText());
            int number2 = Integer.parseInt(textField2.getText());
            int sum = number1 + number2;

            textArea.setText("A soma dos dois números é: " + sum);
        });

        frame.setVisible(true);
    }
}
