/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.caissemarven.windows;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author Dory
 */
public class Principal extends JFrame {
    public Principal(){
        super(" Caisse Automatique");
        WindowListener l = new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        };
            addWindowListener(l);
            //ImageIcon img = new ImageIcon("tips.gif");
            JButton button = new JButton("Bouton");
            
            JPanel panneau = new JPanel();
            panneau.add(button);
            setContentPane(panneau);
            setSize(200,100);
            setVisible(true);
    }
}
