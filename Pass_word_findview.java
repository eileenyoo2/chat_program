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

public class Pass_word_findview extends JFrame{
   private JPanel MainPanel;
   
   protected JTextField Id2_Input;
   protected JTextField Phone_num_Input;
   protected JTextField Pass_Output;
   
   protected JLabel viewLabel;
   protected JLabel MainLabel;
   protected JLabel ID2;
   protected JLabel Phone_num;
   protected JLabel Pass_founded;
   
   protected JButton login_back;
   protected JButton OK;
   
   protected Find_Pass fp = new Find_Pass();
   
   
   private Font f1, f2, f3;
   
   public Pass_word_findview() {
      super("::PASSWORD find::");
      
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
        viewLabel = new JLabel("PASSWORD find");
        viewLabel.setFont(f1);
        
        //이름 입력
      ID2 = new JLabel("Input ID");
      ID2.setFont(f2);
      Id2_Input = new JTextField(15);
      Id2_Input.setFont(f2);
      //학번 입력
      Phone_num = new JLabel("Input mobile number");
      Phone_num.setFont(f2);
      Phone_num_Input = new JTextField(15);
      Phone_num_Input.setFont(f2);
      //아이디 알려주는 창
      Pass_founded = new JLabel("PASSWORD");
      Pass_founded.setFont(f2);
      Pass_Output = new JTextField(15);
      Pass_Output.setFont(f2);
      Pass_Output.setEditable(false);
      
      login_back = new JButton("Login");
      login_back.setFont(f2);
      OK = new JButton("OK");
      OK.setFont(f2);
      
      viewLabel.setBounds(150, 35, 300, 50);
      ID2.setBounds(60, 120, 200, 30);
      Id2_Input.setBounds(230, 120, 200, 30);
      Phone_num.setBounds(60, 190, 200, 30);
      Phone_num_Input.setBounds(230, 190, 200, 30);
      Pass_founded.setBounds(90, 270, 100 , 30);
      Pass_Output.setBounds(230, 270, 200, 30);
      login_back.setBounds(135,350,100,40);
      OK.setBounds(265,350,100,40);
      
      
      MainPanel.add(viewLabel);
      MainPanel.add(ID2);
      MainPanel.add(Id2_Input);
      MainPanel.add(Phone_num);
      MainPanel.add(Phone_num_Input);
      MainPanel.add(Pass_founded);
      MainPanel.add(Pass_Output);
      MainPanel.add(login_back);
      MainPanel.add(OK);
      
      setResizable(false);
      add(layeredPane);
       setSize(500,600);
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
			String confirm = fp.find_if(Id2_Input.getText(), Phone_num_Input.getText());
			Pass_Output.setText(confirm);
		}
   	
   });
   }
}
