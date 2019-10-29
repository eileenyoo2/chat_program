package test;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Login_Failure extends JFrame {
   private JPanel MainPanel;
   private JLabel lbFail;
   private   Font f2,f3;
   private JButton butSubmit;
   
   public Login_Failure() {
      super("::로그인 실패::");
      
      f3 = new Font("210 골목길 R", Font.PLAIN, 18);
      f2 = new Font("210 골목길 R", Font.PLAIN, 15);
      
      lbFail = new JLabel("일치하는 회원 정보가 없습니다.");
      butSubmit = new JButton("확인");
      MainPanel = new JPanel();
      MainPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
        
      setContentPane(MainPanel);
        MainPanel.setLayout(null);
        
      lbFail.setBounds(143,90,280,40);
      butSubmit.setBounds(330,180,80,35);
      
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
