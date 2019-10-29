package test;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ID_Complete extends JFrame {
   private JPanel MainPanel;
   private JLabel lbFail;
   private   Font f2,f3;
   private JButton butSubmit;
   
   
   public ID_Complete() {
      super("::ID confirm::");
     
      f3 = new Font("210 골목길 R", Font.PLAIN, 20);
      f2 = new Font("210 골목길 R", Font.PLAIN, 15);
      
      lbFail = new JLabel("Usable ID !");
      butSubmit = new JButton("OK");
      MainPanel = new JPanel();
      MainPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
       
      setContentPane(MainPanel);
       MainPanel.setLayout(null);
       
      lbFail.setBounds(145,90,450,40);
      butSubmit.setBounds(300,180,100,35);
      
      lbFail.setFont(f3);
      butSubmit.setFont(f2);
      
      MainPanel.add(lbFail);
      MainPanel.add(butSubmit);
      
      MainPanel.setBackground(Color.pink);
       
       JLayeredPane layeredPane = new JLayeredPane();
       layeredPane.setLayout(null);
       
       setSize(500, 300);
       setResizable(false);
       add(layeredPane);
       setVisible(true);
       layeredPane.add(MainPanel);
       setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
   }

}
