/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buatjepape;

/**
 *
 * @author Daniel
 */

import java.awt.*;
import javax.swing.*;

public class BUATJEPAPE extends JPanel {

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Set font and draw string
        g.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 24));
        g.drawString("MWAHAHAHA", 10, 20);

        // Draw a red line
        g.setColor(Color.GREEN);
        g.drawLine(5, 30, 380, 30);

        // Draw a magenta arc
        g.setColor(Color.BLACK);
        g.fillOval(150, 100, 60, 100);
        g.setColor(Color.BLACK);
        g.fillOval(70, 100, 60, 100);
                  //KIRI ATAS KECIKKAN BESARKAN
          g.setColor(Color.white);         
         g.fillOval(150, 100, 60, 60); 
         g.fillOval(70, 100, 60, 60);         
                  
          g.setColor(Color.RED);          
         g.fillOval(96, 180, 90, 100);
          g.setColor(Color.BLACK); 
         g.drawRect(96,300,40,55);
          g.drawRect(146,300,40,55);
         g.drawRect(196,300,40,55);
            g.drawRect(46,300,40,55);
            
            g.drawRect(46,380,40,55);
             g.drawRect(196,380,40,55);
             g.drawRect(146,380,40,55);
              g.drawRect(96,380,40,55);
              
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("BumBumBum");
        BUATJEPAPE panel = new BUATJEPAPE();
        frame.add(panel);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        
        
    }
}