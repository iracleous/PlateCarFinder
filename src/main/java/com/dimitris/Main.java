package com.dimitris;

import javax.swing.*;
import java.awt.*;


public class Main {

    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame("Police Application");
        createMenuBar(frame);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(300,300));
        frame.setVisible(true);

    }

    public static void add(JFrame frame){
        frame.setContentPane(new InsertForm().getInsertPanel());
        frame.repaint();
        frame.setVisible(true);
    }

    public static void search(JFrame frame){

        frame.setContentPane(new SearchForm().getSearchPanel());
        frame.repaint();
        frame.setVisible(true);


    }
    public static void delete(JFrame frame){
        frame.setContentPane(new DeleteForm().getDeletePanel());
        frame.repaint();
        frame.setVisible(true);
    }



    private static void createMenuBar(JFrame frame) {
        var menuBar = new JMenuBar();
        var fileMenu = new JMenu("File");
        var addMenuItem = new JMenuItem("Add plate" );
        var deleteMenuItem = new JMenuItem("Delete plate" );
        var searchMenuItem = new JMenuItem("Search plate" );
        var eMenuItem = new JMenuItem("Exit" );


        eMenuItem.addActionListener((event) -> System.exit(0));
        addMenuItem.addActionListener((event) -> add(frame));
        searchMenuItem.addActionListener((event) -> search(frame));
        deleteMenuItem.addActionListener((event) -> delete(frame));


        fileMenu.add(addMenuItem);
        fileMenu.add(deleteMenuItem);
        fileMenu.add(searchMenuItem);
        fileMenu.add(eMenuItem);


        menuBar.add(fileMenu);

        frame.setJMenuBar(menuBar);
    }




}