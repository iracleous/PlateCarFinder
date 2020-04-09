package com.dimitris;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DeleteForm {

    private JPanel DeletePanel;
    private JTextField plates;
    private JButton deleteButton;

    public DeleteForm() {
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                PlateIo plateIo =new PlateIo();
                plateIo.deletePlate(plates.getText());

                JOptionPane.showMessageDialog(null,"The requested plates have been deleted");
            }
        });
    }

    public JPanel getDeletePanel() {
        return DeletePanel;
    }



}
