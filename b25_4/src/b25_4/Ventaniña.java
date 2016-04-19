/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b25_4;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author balva
 */
public class Ventaniña {
         JFrame marco;
    JPanel panel;
    JLabel etiqueta;
           
    public void CrearVentana () {
    
    
        marco=new JFrame("A outra ventana");
        panel=new JPanel();
        
 
     
        etiqueta=new JLabel("Mira que te mato");
        marco.setSize(500,500);
        marco.add(panel);
        panel.add(etiqueta);
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    }

