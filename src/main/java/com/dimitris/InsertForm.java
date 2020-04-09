package com.dimitris;

import javax.imageio.IIOException;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class InsertForm {


    private JPanel InsertPanel;
    private JTextField owner;
    private JTextField plate;
    private JButton insertDataButton;

    public JPanel getInsertPanel() {
        return InsertPanel;
    }


    public InsertForm() {
        insertDataButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                CarData carData = new CarData(plate.getText(), owner.getText());
                PlateIo plateIo = new PlateIo();
                List<CarData> list = new ArrayList<>();
                list.add(carData);
                try {
                    plateIo.saveToFile(list,"plates.txt", true);
                    JOptionPane.showMessageDialog(null,"the data have been saved");
                    plate.setText("");
                    owner.setText("");

                } catch (IOException e) {
                  //  e.printStackTrace();
                    JOptionPane.showMessageDialog(null,
                            "something went wrong");
                }
           }
        });
    }
}
