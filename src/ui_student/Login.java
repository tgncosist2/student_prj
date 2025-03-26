package ui_student;

import java.awt.Font;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JDialog {

	private JTextField jtfID;
	private JPasswordField jpfPassword;
	private boolean successLogin = false;

	public Login(mainWindow mw) {
		super(mw,"로그인",true);
		JPanel contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel jlbID = new JLabel("ID");
		jlbID.setBounds(50, 70, 80, 15);
		contentPane.add(jlbID);
		jlbID.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setBounds(50, 110, 80, 15);
		contentPane.add(lblPassword);
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		
		jtfID = new JTextField();
		jtfID.setBounds(142, 65, 120, 20);
		contentPane.add(jtfID);
		jtfID.setColumns(10);
		
		jpfPassword = new JPasswordField();
		jpfPassword.setBounds(142, 105, 120, 20);
		contentPane.add(jpfPassword);
		
		JButton jbtnLogin = new JButton("로그인");
		jbtnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(jtfID.getText().equals("")) {
					JOptionPane.showMessageDialog(mw, "로그인 되었습니다.");
					successLogin = true;
					dispose();
				} else {
					JOptionPane.showMessageDialog(mw, "로그인 실패\n비밀번호가 틀립니다.");
				}
				
			}
		});
		jbtnLogin.setBounds(280, 60, 97, 63);
		contentPane.add(jbtnLogin);
		
		JLabel jlblTitle = new JLabel("베스트캠퍼스");
		jlblTitle.setBounds(119, 10, 200, 40);
		contentPane.add(jlblTitle);
		jlblTitle.setFont(new Font("Gulim 12",1,20));
		jlblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel jlblSubtitle = new JLabel("학생용");
		jlblSubtitle.setBounds(0, 5, 57, 15);
		contentPane.add(jlblSubtitle);
		jlblSubtitle.setHorizontalAlignment(SwingConstants.CENTER);
		
		setBounds(100, 100, 450, 200);
		setLocationRelativeTo(mw);
		
	}// loginDialog
	
	public boolean isLoginSuccess() {
		return successLogin;
	}
	
}// class
