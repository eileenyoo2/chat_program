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

public class Id_confirm extends JFrame{
	 private JPanel MainPanel1;
	   private JLabel lbFail;
	   private   Font f2,f3;
	   private JButton butSubmit;
	   
	   public Id_confirm() {
		   super("::ID confirm::");
	   }
	   
	   public void ID_confirm() {
		      
		      f3 = new Font("210 골목길R", Font.PLAIN, 20);
		      f2 = new Font("210 골목길R", Font.PLAIN, 15);
		      
		      lbFail = new JLabel("Usable ID !");
		      butSubmit = new JButton("OK");
		      MainPanel1 = new JPanel();
		      MainPanel1.setBorder(new EmptyBorder(5, 5, 5, 5));
		       
		      setContentPane(MainPanel1);
		       MainPanel1.setLayout(null);
		       
		      lbFail.setBounds(130,90,470,40);
		      butSubmit.setBounds(330,180,80,35);
		      
		      lbFail.setFont(f3);
		      butSubmit.setFont(f2);
		      
		      MainPanel1.add(lbFail);
		      MainPanel1.add(butSubmit);
		      
		      MainPanel1.setBackground(Color.pink);
		       
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
		       //layeredPane.add(MainPanel1);
		       setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}
