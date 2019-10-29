package test;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class MultiChatUI2 extends JFrame{
    
	private JPanel loginPanel1;
    private JPanel loginPanel2;
    private JPanel MainPanel;
    
    private JPanel logoutPanel;
    private JPanel loginButtonPanel;
    private JPanel MainviewPanel;
    private JPanel viewPanel;
    
    private JLabel inLabel;
    protected JLabel MainLabel;
    protected JLabel outLabel;
    protected JLabel ID;
    protected JLabel PASS;
    protected JLabel SCHOOL;
    
    protected JTextField idInput;
    protected JTextField schoolInput;
    protected JTextField passworldInput;
    
    protected JButton loginButton;
    protected JButton idfindButton;
    protected JButton passfindButton;
    protected JButton newMember;
    
    private Font f1,f2,f3;
    
    protected JButton logoutButton;
    private JPanel msgPanel;
    protected JTextField msgInput;
    protected JButton exitButton;
    protected JTextArea msgOut;
    protected Container tab;
    protected CardLayout cardLayout;
    protected String id;
	private JTextField passwordInput;
	
	protected Login lo = new Login();
    //static music mu = new music("2.mp3", true);
    
    // �깮�꽦�옄
    public MultiChatUI2() {
        // 硫붿씤 �봽�젅�엫 援ъ꽦
        super("::Chat Program::");
        //�룿�듃 援ъ꽦
        f1 = new Font("210 골목길R", Font.PLAIN, 40);
        f2 = new Font("210 골목길R", Font.PLAIN, 18);
        f3 = new Font("210 골목길R", Font.PLAIN, 15);
        // �쐵 �솕硫� 援ъ꽦
        viewPanel = new JPanel();
        viewPanel.setBounds(50, 50, 400, 80);
        MainLabel = new JLabel("Tok Tok Tok");
        viewPanel.add(MainLabel);
        MainLabel.setFont(f1);
        viewPanel.setBackground(Color.pink);

        // 濡쒓렇�씤 �뙣�꼸 �솕硫� 援ъ꽦, �젅�씠�븘�썐 �꽕�젙
        loginPanel1 = new JPanel();
        loginPanel1.setBounds(40, 120, 200, 150);
        loginPanel1.setLayout(null);

        loginPanel2 = new JPanel();
        loginPanel2.setBounds(220, 120, 250, 150);
        loginPanel2.setLayout(null);

        // �븘�씠�뵒 �븰援먮챸 鍮꾨�踰덊샇 �엯�젰 李�
        idInput = new JTextField(30);
        idInput.setBounds(20, 70, 200, 30);
        
        schoolInput = new JTextField(30);
        schoolInput.setBounds(20, 20, 200, 30);
        
        passwordInput = new JTextField(30);
        passwordInput.setBounds(20, 120, 200, 30);
        
        ID = new JLabel("ID ");
        ID.setBounds(10, 70, 200, 30);       
        ID.setFont(f2);
        
        SCHOOL = new JLabel("SCHOOL");
        SCHOOL.setBounds(10, 18, 200, 30);        
        SCHOOL.setFont(f2);
           
        PASS =new JLabel("PASSWORD");
        PASS.setBounds(10, 120, 200, 30);
        PASS.setFont(f2);

        // 濡쒓렇�씤 �뙣�꼸�뿉 �쐞�젽 援ъ꽦
        loginPanel2.add(idInput);
        loginPanel2.add(passwordInput);
        loginPanel2.add(schoolInput);
        loginPanel2.setBackground(Color.pink);
        
        loginPanel1.add(ID);
        loginPanel1.add(PASS);
        loginPanel1.add(SCHOOL);
        loginPanel1.setBackground(Color.pink);
        
        //濡쒓렇�씤, �쉶�썝媛��엯, �븘�씠�뵒/鍮꾨쾲李얘린 踰꾪듉
        loginButton = new JButton("Login"); 
        loginButton.setFont(f3);
        idfindButton = new JButton("ID find");
        idfindButton.setFont(f3);
        passfindButton = new JButton("PASS find");
        passfindButton.setFont(f3);
        newMember = new JButton("Registration");
        newMember.setFont(f3);

        //濡쒓렇�씤 踰꾪듉 �뙣�꼸�뿉 �젅�씠�븘�썐 �꽕�젙
        loginButtonPanel = new JPanel();
        loginButtonPanel.setBounds(15, 305, 450, 50);
        loginButtonPanel.setLayout(new FlowLayout());

        // 濡쒓렇�씤 踰꾪듉 �뙣�꼸�뿉 �쐞�젽 援ъ꽦
        loginButtonPanel.add(loginButton);
        loginButtonPanel.add(newMember);
        loginButtonPanel.add(idfindButton);
        loginButtonPanel.add(passfindButton);
        loginButtonPanel.setBackground(Color.pink);
        
        //硫붿씤 �뙋�꽟�뿉 遺숈씠湲�
        MainPanel = new JPanel();
        MainPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
     	setContentPane(MainPanel);
     	MainPanel.setLayout(null);
       
        MainPanel.add(viewPanel,BorderLayout.NORTH);
        MainPanel.add(loginButtonPanel, BorderLayout.SOUTH);
        MainPanel.add(loginPanel1, BorderLayout.WEST);
        MainPanel.add(loginPanel2, BorderLayout.EAST);
        
        MainPanel.setBackground(Color.pink);
          JLayeredPane layeredPane = new JLayeredPane();
          layeredPane.setLayout(null);


        pack();
        setResizable(false);
        setSize(500,600);
        add(layeredPane);
        setVisible(true);

        loginButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				int num = lo.login(idInput.getText(), passwordInput.getText(), schoolInput.getText());
				
				if(num == 1) {
					MultiChatController app = new MultiChatController(new MultiChatData(),new MultiChatUI());
					app.appMain();
					//mu.close();
				}
				else if(num == 2) {
					System.out.println("password try again");
				}
				else if(num == 4){
					System.out.println("Not correct school name");
				}
				else {
					System.out.println("Not exist name");
				}
			}
        });

        newMember.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent arg0) {
        		MultiChatUI_new_Member mr = new MultiChatUI_new_Member();
        	}
        	
        });
        
        idfindButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				ID_findview id = new ID_findview();
			}
        	
        });
        
        passfindButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Pass_word_findview pass = new Pass_word_findview();
			}
        	
        });
        
    }
	public void addButtonActionListener(ActionListener listener) {
        // �씠踰ㅽ듃 由ъ뒪�꼫 �벑濡�
		loginButton.addActionListener(listener);
        exitButton.addActionListener(listener);
        msgInput.addActionListener(listener);
        
        newMember.addActionListener(listener);
        idfindButton.addActionListener(listener);
        passfindButton.addActionListener(listener);
    }
}
