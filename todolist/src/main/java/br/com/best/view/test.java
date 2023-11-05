package br.com.best.view;

import javax.swing.*;

public class test implements ActionListener {

    public static void main(String[] args) {
        // Create a new JButton
        JButton button = new JButton("Click me!");

        // Add an action listener to the button
       /*  button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Do something when the button is clicked
                System.out.println("Button clicked!");
            }
        });*/

        // Add the button to the frame
        JFrame frame = new JFrame();
        frame.add(button);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}

