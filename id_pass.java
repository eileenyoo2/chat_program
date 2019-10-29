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

public class id_pass extends JFrame {

	private JPanel MainPanel2;
	private JLabel lbFail;
	private Font f2, f3;
	private JButton butSubmit;

	/*
	 * public id_pass() { super("::�븘�씠�뵒 ::"); }
	 */

	public void ID_restart() {
		f3 = new Font("210 怨⑤ぉ湲� R", Font.PLAIN, 20);
		f2 = new Font("210 怨⑤ぉ湲� R", Font.PLAIN, 15);

		lbFail = new JLabel("a");
		butSubmit = new JButton("�솗�씤");
		MainPanel2 = new JPanel();
		MainPanel2.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(MainPanel2);
		MainPanel2.setLayout(null);

		lbFail.setBounds(130, 90, 470, 40);
		butSubmit.setBounds(330, 180, 80, 35);

		lbFail.setFont(f3);
		butSubmit.setFont(f2);

		MainPanel2.add(lbFail);
		MainPanel2.add(butSubmit);

		MainPanel2.setBackground(Color.pink);

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
		//layeredPane.add(MainPanel2);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}
