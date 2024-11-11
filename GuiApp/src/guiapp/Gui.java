/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guiapp;


import java.awt.Color;
import javax.swing.*;

/**
 *
 * @author Darren
 */
public class Gui extends JFrame{
    
    private JPanel toDoPanel;
    private JLabel toDoGuiTitle;
    private JLabel toDoItemLabel;
    private JTextField toDoItemTextField;
    private JButton addButton;
    
    public Gui(){
        
        setSize(500,500);
        setLocation(20,20);
        
        toDoPanel = new JPanel();
        add (toDoPanel);
        toDoPanel.setLayout(null);
        
        toDoGuiTitle = new JLabel ("welcome");
        toDoGuiTitle.setBounds(10,10,220,50);
        toDoPanel.add(toDoGuiTitle);
        
        toDoItemLabel = new JLabel("Item description");
        toDoPanel.add(toDoItemLabel);
        toDoItemLabel.setBounds(250,50,200,30);
        
        toDoItemTextField = new JTextField("Enter something");
        toDoItemTextField.setBounds (250,50,200,30);
        toDoPanel.add(toDoItemTextField);
        
        addButton = new JButton ("Add a new Item");
        addButton.setBounds (10,240,200,30);
        toDoPanel.add(addButton);
    }
}


