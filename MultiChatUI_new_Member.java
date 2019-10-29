package test;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class MultiChatUI_new_Member extends JFrame {
	
	Member mb = new Member();
	String ary1, ary2, ary3, ary4, ary5;
	int number=0, number2=0;
	Confirm_Id ci = new Confirm_Id();
	ID_PASS_Confirm id = new ID_PASS_Confirm();
	Id_confirm ic = new Id_confirm();
	id_pass ip = new id_pass();
	
	
   private   JPanel MainPanel;
   private   JLabel lblId, lblPwd, lblName, lblHp, lblGen;
   private 	 JLabel  lblHobby,lblJob,lblAddr,lblAge, lbview ;
   private 	 JTextField txtId;
   private   JTextField txtPwd, txtName;
   private   JTextField txtHp1, txtHp2, txtHp3;
   private   Checkbox cbMale,cbFeMale;
   private   Checkbox cbHobby1, cbHobby2, cbHobby3;
   private   Choice chJob;
   private   JTextField txtAddr,txtAge;
   protected JButton btnId_confirm, btnSubmit, btnCancel;
   private   Font f1, f2, f3; 
   
   
   
     public MultiChatUI_new_Member() {
        super("::Member Registration::");
          
        f1 = new Font("210 골목길 R", Font.PLAIN, 40);
        f2 = new Font("210 골목길 R", Font.PLAIN, 18);
        f3 = new Font("210 골목길 R", Font.PLAIN, 15);
      
        lbview = new JLabel("Registration");
        lblId =new JLabel("ID");
        lblPwd=new JLabel("PASSWORD");
        lblName=new JLabel("NAME");
        lblHp=new JLabel("MOBILE");
        lblGen=new JLabel("SEX");
        lblJob=new JLabel("JOB");
        lblAddr=new JLabel("ADDRESS");
        lblAge =new JLabel("AGE");
          
        Panel panGen = new Panel(new FlowLayout(FlowLayout.LEFT));
        Panel panHobby = new Panel(new FlowLayout(FlowLayout.LEFT));
        MainPanel = new JPanel();
        Panel paButton = new Panel(); 
        MainPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(MainPanel);
        MainPanel.setLayout(null);
          
        lbview.setFont(f1);  
        lblId.setFont(f3);
        lblPwd.setFont(f3);
        lblName.setFont(f3);
        lblHp.setFont(f3);
        lblGen.setFont(f3);
        lblJob.setFont(f3);
        lblAddr.setFont(f3);
        lblAge.setFont(f3);
         
        
        lbview.setBounds(180, 20, 300, 60);
        lblId.setBounds(70, 100, 100, 30);
        lblPwd.setBounds(70, 140, 100, 30);
        lblName.setBounds(70, 180, 100, 30);
        lblHp.setBounds(70, 220, 100 , 30);
        lblGen.setBounds(70, 260, 100, 30);
        lblJob.setBounds(70, 290, 100, 30);
        lblAddr.setBounds(70, 325, 100, 30);
        lblAge.setBounds(70, 360, 100, 30);
        
        MainPanel.add(lbview);
        MainPanel.add(lblId);
        MainPanel.add(lblPwd);
        MainPanel.add(lblName);
        MainPanel.add(lblHp);
        MainPanel.add(lblGen);
        MainPanel.add(lblJob);
        MainPanel.add(lblAddr);
        MainPanel.add(lblAge);
         
        txtId =new JTextField(20);
        txtPwd =new JTextField(20);
        txtName= new JTextField(20);
        Label lblhipen1 = new Label("-");
        Label lblhipen2 = new Label("-");
        txtHp1 = new JTextField();
        txtHp2 = new JTextField();
        txtHp3 = new JTextField();
         
        CheckboxGroup group = new CheckboxGroup();
        cbMale = new Checkbox("Male",group,true);
        cbFeMale = new Checkbox("Female",group,true);
       
        panGen.add(cbMale);
        panGen.add(cbFeMale);
        panGen.setBackground(Color.pink);
         
        chJob = new Choice();
        chJob.add("Student");
        chJob.add("Professor");
        chJob.add("Faculty");
        chJob.add("etc");
         
        txtAddr = new JTextField();
        txtAge = new JTextField();
       
        btnId_confirm = new JButton("check");
        btnCancel = new JButton("cancel");       
        btnSubmit = new JButton("submit");
        btnCancel.setFont(f3);
        btnSubmit.setFont(f3);
        btnId_confirm.setFont(f3);
        
        txtId.setBounds(170, 100, 170, 30);
        btnId_confirm.setBounds(350, 100, 100, 30);
        txtPwd.setBounds(170, 140, 170, 30);
        txtName.setBounds(170, 180, 170, 30);
        txtHp1.setBounds(170, 220, 70, 30);
        lblhipen1.setBounds(250, 220, 10, 30);
        txtHp2.setBounds(270, 220, 70, 30);
        lblhipen2.setBounds(350, 220, 10, 30);
        txtHp3.setBounds(370, 220, 70, 30);
        panGen.setBounds(170, 257, 180, 30); 
        chJob.setBounds(170, 290, 170, 30);
        txtAddr.setBounds(170, 325, 270, 30);
        txtAge.setBounds(170, 365, 170, 30);
        btnSubmit.setBounds(160, 430, 90, 35);
        btnCancel.setBounds(260, 430, 90, 35);

    
         
        MainPanel.add(txtId);
        MainPanel.add(btnId_confirm);
        MainPanel.add(txtPwd);
        MainPanel.add(txtName);
        MainPanel.add(txtHp1);
        MainPanel.add(lblhipen1);
        MainPanel.add(txtHp2);
        MainPanel.add(lblhipen2);
        MainPanel.add(txtHp3);
        MainPanel.add(panGen);
        MainPanel.add(chJob);
        MainPanel.add(txtAddr);
        MainPanel.add(txtAge);
        MainPanel.add(btnSubmit);
        MainPanel.add(btnCancel);
          
        MainPanel.setBackground(Color.pink);
          
        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setLayout(null);
          
        setSize(500, 600);
        setResizable(false);
        add(layeredPane);
        setVisible(true);
        //layeredPane.add(MainPanel);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
      
     btnId_confirm.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			number=0;
			int num = ci.Confirm(txtId.getText());
			if(num==1 || txtId.getText().equals("")) {
				id.ID_PASS_Confirm();
			}
			else {
				number++;
				ic.ID_confirm();
			}
		}
    	 
     });
        

     btnSubmit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				ary1 = txtId.getText();
				ary2 = txtPwd.getText();
				ary3 = txtName.getText();
				ary4 = (txtHp1.getText() + txtHp2.getText() + txtHp3.getText());
				ary5 = txtAddr.getText();
				
				
				number2=0;
				
				if((ary1.equals("")) || (ary2.equals("")) || (ary3.equals("")) || (ary4.equals("")) || (ary5.equals(""))) {
					System.out.println("빈칸을 채워주세요.");
				}
				else {
					number2++;
				}
				
				if((number>=1) && (number2>=1)) {
					mb.setid(ary1);
					mb.setphone_num(ary2);
					mb.setpass(ary3);
					mb.setname(ary4);
					mb.setstudent_id(ary5);
					mb.setschool_name(ary5);
					mb.setHash();
					System.out.println(mb.set_map);
					dispose();
				}
				else {
					ip.ID_restart();
					//빈칸을 채워주세요... 채워넣기
				}
			}
       	
       });
    
     btnCancel.addActionListener(new ActionListener() {
   	  
   	  @Override
   	  public void actionPerformed(ActionEvent arg0) {
   		  dispose();
   	  }
   	  
     });
	}

}
