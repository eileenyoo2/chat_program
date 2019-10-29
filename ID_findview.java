package test;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class ID_findview extends JFrame{
   private JPanel MainPanel;
   
   protected JTextField Name_Input;
   protected JTextField School_num_Input;
   protected JTextField Id_Output;
   
   protected JLabel viewLabel;
   //protected JLabel MainLabel;
   protected JLabel Name;
   protected JLabel School_num;
   protected JLabel Id_founded;
   
   protected JButton login_back;
   protected JButton OK;
   
   protected Find_ID fi = new Find_ID();
   
   private Font f1, f2, f3;
   
   public ID_findview() {
      super("::ID find::");
      
      	f1 = new Font("210 골목길 R", Font.PLAIN, 40);
        f2 = new Font("210 골목길 R", Font.PLAIN, 18);
        f3 = new Font("210 골목길 R", Font.PLAIN, 15);
      
      MainPanel = new JPanel();
      MainPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
      setContentPane(MainPanel);
      MainPanel.setLayout(null);
      MainPanel.setBackground(Color.pink);
      JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setLayout(null);
        //제목
        viewLabel = new JLabel("ID find");
        viewLabel.setFont(f1);
        
      //이름 입력
      Name = new JLabel("Input Name");
      Name.setFont(f2);
      Name_Input = new JTextField(15);
      Name_Input.setFont(f2);
      

      
      //학번 입력
      School_num = new JLabel("Input School number");
      School_num.setFont(f2);
      School_num_Input = new JTextField(15);
      School_num_Input.setFont(f2);
      
      
      //아이디 알려주는 창
      Id_founded = new JLabel("ID");
      Id_founded.setFont(f2);
      Id_Output = new JTextField(15);
      Id_Output.setFont(f2);
      Id_Output.setEditable(false);
      
      login_back = new JButton("Login");
      login_back.setFont(f2);
      OK = new JButton("OK");
      OK.setFont(f2);
      
      MainPanel.add(viewLabel);
      MainPanel.add(Name);
      MainPanel.add(Name_Input);
      MainPanel.add(School_num);
      MainPanel.add(School_num_Input);
      MainPanel.add(Id_founded);
      MainPanel.add(Id_Output);
      MainPanel.add(login_back);
      MainPanel.add(OK);
      
      viewLabel.setBounds(150, 35, 300, 50);
      Name.setBounds(60, 120, 200, 30);
      Name_Input.setBounds(230, 120, 200, 30);
      School_num.setBounds(60, 190, 200, 30);
      School_num_Input.setBounds(230, 190, 200, 30);
      Id_founded.setBounds(90, 270, 100 , 30);
      Id_Output.setBounds(230, 270, 200, 30);
      login_back.setBounds(135,350,100,40);
      OK.setBounds(265,350,100,40);
      
      setResizable(false);
       setSize(500,600);
       add(layeredPane);
       setVisible(true);
       //layeredPane.add(MainPanel);
       
       OK.addActionListener(new ActionListener() {

   		@Override
   		public void actionPerformed(ActionEvent arg0) {
   			dispose();
   		}
      	
      });
      
      login_back.addActionListener(new ActionListener() {

   		@Override
   		public void actionPerformed(ActionEvent arg0) {
   			String confirm = fi.find_if(Name_Input.getText(), School_num_Input.getText());
   			Id_Output.setText(confirm);
   		}
      	
      });  
       
   }
   
   
}
