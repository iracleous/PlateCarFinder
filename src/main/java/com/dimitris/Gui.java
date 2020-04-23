package com.dimitris;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui {

    public static void main(String[] args) {

    }



    public   void gui(){

        Search search = new Search();


        JFrame frame = new JFrame("Desktop application for plate finding");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(600,600));

        frame.setLayout(new FlowLayout());

        JLabel lb1 = new JLabel("Car plate");
        frame.add(lb1);
        JTextField j1 = new JTextField(20);
        frame.add(j1);
        JButton button = new JButton("press");
        frame.add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String carPlate = j1.getText();
                String owner= search.findCarOwner(carPlate);

                JOptionPane.
                        showMessageDialog(null,
                                owner );

            }
        });

        frame.setVisible(true);
    }


}
