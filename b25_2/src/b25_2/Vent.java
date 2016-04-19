/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b25_2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author balva
 */
public class Vent implements ActionListener {
 JFrame marco;
    JPanel panel;
    JButton boton1;
     JButton boton2;
    JLabel etiqueta;
           
    
    
    public void crearVentana(){
        marco=new JFrame("Curso Dam");
        panel=new JPanel();
        boton1=new JButton("Programacion");
        boton1.setBackground(Color.GREEN);
        boton2=new JButton("Bases");
        boton2.setBackground(Color.PINK);
        etiqueta=new JLabel();
        marco.setSize(500,500);
        //Monitorizamos el boton
        //si esta en la misma clase se pone this si no se crearia un objeto de esa clase
        
        boton1.addActionListener(this);
        boton2.addActionListener(this);
        panel.add(boton1);
        panel.add(boton2);
        panel.add(etiqueta);
        marco.add(panel);
        
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      Object a = e.getSource();
      if(a==boton1){
          marco.setTitle("Programacion");
      }else{
          marco.setTitle("Bases de datos");
      }
          
    }
}
