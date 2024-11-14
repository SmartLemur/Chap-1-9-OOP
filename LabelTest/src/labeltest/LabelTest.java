/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labeltest;

/**
 *
 * @author Daniel
 */

 import java.awt.*;
//import java.awt.event.*;
import javax.swing.*;

public class LabelTest extends JFrame {
    private JLabel label1;
     private JLabel label2;
     private JTextField textField1;
     private JButton button3;
      private JButton button2;
      private JButton button1;
     private JButton fancyButton;
     private JTextField TextA;    
     private JTextField TextB;
     private JTextArea Textbox1;
     private JRadioButton b1, b2, b3;
     private JCheckBox cb1, cb2 ;
     private JComboBox Combobox;
     
    public LabelTest(){
       super("testing JLabel");
       Container container = getContentPane();
       container.setLayout(new FlowLayout());
       label1 = new JLabel("Liquid ID JUARA MPL SEASON 14");
      // label1.setToolTipText("this is label1");
       container.add(label1);
       setSize(275,200);
       setVisible(true);
       Icon rabbit = new ImageIcon("capy.jpg");
label2 = new JLabel("Label with text and icon", rabbit,SwingConstants.LEFT);
label2.setToolTipText("This is an animated rabbit");
container.add(label2);
textField1 = new JTextField(10);
container.add(textField1);
button1 = new JButton("button ini");
container.add(button1);
Icon capy1 = new ImageIcon("capy.jpg");
fancyButton = new JButton("button capybara ni oi", capy1);
fancyButton.setSize(10,10);
//fancyButton.setLocation(50,30);
container.add(fancyButton);

Icon drink1 = new ImageIcon("capy.jpg");
button2 = new JButton("Milo", drink1);
button3 = new JButton("Nescafe");
button2.setSize(10,10); button3.setSize(7,4);
//button2.setLocation(50,30); button3.setLocation(20,80);

add(button2); add(button3);
TextA = new JTextField ("Key in here");
TextA.setSize(100,20);
TextA.setLocation(20,20);
TextA.setBackground(Color.black);
TextA.setForeground(Color.white);
TextA.setFont(new Font("Courier",Font.ITALIC,40));
add(TextA);

TextB = new JTextField ("Sini rakan");
TextB.setSize(100,20);
TextB.setLocation(20,20);
TextB.setBackground(Color.BLUE);
TextB.setForeground(Color.white);
TextB.setFont(new Font("Courier",Font.ITALIC,40));
add(TextB);

Textbox1 = new JTextArea ("Multiple line:");
Textbox1.setSize(100,200);
Textbox1.setLocation(20,20);
Textbox1.setBackground(Color.PINK);
Textbox1.setForeground(Color.DARK_GRAY);
Textbox1.setFont(new
Font("Bookman",Font.TRUETYPE_FONT,16));
add(Textbox1);

b1 = new JRadioButton("Hagen Dazz");
b2 = new JRadioButton("Basken Robin");
b3 = new JRadioButton("Walls");
b1.setBounds(20,20,200,50);
b2.setBounds(20,70,200,50);
b3.setBounds(20,110,200,50);
container.add(b1);
container.add(b2);
container.add(b3);

cb1 = new JCheckBox("C");
cb2 = new JCheckBox("JAVA");
cb1.setBounds(20,20,200,50);
cb2.setBounds(20,70,200,50);
add(cb1);
add(cb2);

String names[]={"itik","daging","ayam"};
Combobox = new JComboBox(names);
Combobox.setMaximumRowCount(3);
Combobox.setBounds(50,50,100,20);
add(Combobox);




    }
    public static void main(String[] args) {
        LabelTest application = new LabelTest();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

