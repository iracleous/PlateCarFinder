package com.dimitris;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SearchForm {
    public JPanel getSearchPanel() {
        return SearchPanel;
    }

    private JPanel SearchPanel;
    private JTextField platesTextField;
    private JButton searchButton;

    public SearchForm() {
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Search search = new Search();
           String owner =      search.findCarOwner(platesTextField.getText());

             JOptionPane.showMessageDialog(null,"the owner is "+ owner);

            }
        });

    }
}
