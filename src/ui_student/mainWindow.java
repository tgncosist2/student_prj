package ui_student;

import java.awt.Font;

import javax.swing.*;

import ui_student_evt.mainWindowEvt;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class mainWindow extends JFrame {

	
	private JButton jbtnInfo;
	private JButton jbtnExample;
	private JButton jbtnGesipan;
	
	public JButton getJbtnGesipan() {
		return jbtnGesipan;
	}

	public JButton getJbtnInfo() {
		return jbtnInfo;
	}
	
	public JButton getJbtnExample() {
		return jbtnExample;
	}

	public mainWindow() {
		Login loginDialog = new Login(this);
		loginDialog.setVisible(true);
		
		if(!loginDialog.isLoginSuccess()) {
			System.exit(3);
			return;
		}
		
		JPanel contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel jlblTitle = new JLabel("베스트캠퍼스");
		jlblTitle.setBounds(120, 10, 200, 40);
		contentPane.add(jlblTitle);
		jlblTitle.setFont(new Font("Gulim 12",1,20));
		jlblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel jlblName = new JLabel("학생명");
		jlblName.setBounds(60, 60, 70, 15);
		contentPane.add(jlblName);
		
		JLabel jlblTeacherName = new JLabel("담당강사");
		jlblTeacherName.setBounds(60, 90, 70, 15);
		contentPane.add(jlblTeacherName);
		
		jbtnInfo = new JButton("개인정보");
		jbtnInfo.setBounds(40, 135, 100, 40);
		contentPane.add(jbtnInfo);
		
		jbtnExample = new JButton("시험");
		jbtnExample.setBounds(170, 135, 100, 40);
		contentPane.add(jbtnExample);
		
		jbtnGesipan = new JButton("1:1 문의");
		jbtnGesipan.setBounds(300, 135, 100, 40);
		contentPane.add(jbtnGesipan);
		
		// # 이벤트 추가
		mainWindowEvt mwe = new mainWindowEvt(this);
		jbtnInfo.addActionListener(mwe);
		jbtnExample.addActionListener(mwe);
		jbtnGesipan.addActionListener(mwe);
		
		
		JLabel jlblName_1 = new JLabel("홍길동");
		jlblName_1.setBounds(170, 60, 70, 15);
		contentPane.add(jlblName_1);
		
		JLabel jlblTeacherName_1 = new JLabel("아무개");
		jlblTeacherName_1.setBounds(170, 90, 70, 15);
		contentPane.add(jlblTeacherName_1);
		
		setBounds(800, 300, 450, 230);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
