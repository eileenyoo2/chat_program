package test;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ID_PASS_Confirm extends JFrame {
   
   private JPanel MainPanel;
   private JLabel lbFail;
   private   Font f2,f3;
   private JButton butSubmit;
   
   /*public ID_PASS_Confirm() {
	   super("::�븘�씠�뵒 以묐났::");
   }*/
   
   public void ID_PASS_Confirm() {
      
      f3 = new Font("210 골목길R", Font.PLAIN, 20);
      f2 = new Font("210 골목길R", Font.PLAIN, 15);
      
      lbFail = new JLabel("already use ID");
      butSubmit = new JButton("OK");
      MainPanel = new JPanel();
      MainPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
       
      setContentPane(MainPanel);
       MainPanel.setLayout(null);
       
      lbFail.setBounds(20,90,470,40);
      butSubmit.setBounds(330,180,80,35);
      
      lbFail.setFont(f3);
      butSubmit.setFont(f2);
      
      MainPanel.add(lbFail);
      MainPanel.add(butSubmit);
      
      MainPanel.setBackground(Color.pink);
       
       JLayeredPane layeredPane = new JLayeredPane();
       layeredPane.setLayout(null);
       
       butSubmit.addActionListener(new ActionListener() {

   		@Override
   		public void actionPerformed(ActionEvent arg0) {
   			dispose();
   		}
       	 
        });
       
       setSize(500, 300);
       setResizable(false);
       add(layeredPane);
       setVisible(true);
       //layeredPane.add(MainPanel);
       setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
   }
}
