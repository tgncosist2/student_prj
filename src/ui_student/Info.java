package ui_student;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.*;

import ui_student_evt.InfoEvt;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Info extends JDialog {

	private JButton jbtnPassChange;
	private JTextField jtfTel;
	private JLabel jlblIDSet;
	private JLabel jlblNameSet;
	

	public Info(mainWindow mw) {
		super(mw, "개인정보", true);
		setSize(450, 490);
		getContentPane().setLayout(new BorderLayout());
		JPanel contentPanel = new JPanel();
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel jlblTitle = new JLabel("개인정보");
		jlblTitle.setBounds(165, 10, 100, 30);
		contentPanel.add(jlblTitle);
		jlblTitle.setFont(new Font("Gulim 12",1,20));
		jlblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel jlblID = new JLabel("아이디");
		jlblID.setBounds(60, 60, 80, 15);
		contentPanel.add(jlblID);
		
		JLabel jlblPassword = new JLabel("비밀번호");
		jlblPassword.setBounds(60, 90, 80, 15);
		contentPanel.add(jlblPassword);
		
		JLabel jlblName = new JLabel("학생명");
		jlblName.setBounds(60, 120, 80, 15);
		contentPanel.add(jlblName);
		
		JLabel jlblBirth = new JLabel("생년월일");
		jlblBirth.setBounds(60, 150, 80, 15);
		contentPanel.add(jlblBirth);
		
		JLabel jlblTel = new JLabel("전화번호");
		jlblTel.setBounds(60, 180, 80, 15);
		contentPanel.add(jlblTel);
		
		JLabel jlblAddress = new JLabel("주소");
		jlblAddress.setBounds(60, 210, 80, 15);
		contentPanel.add(jlblAddress);
		
		JLabel jlblCourseName = new JLabel("과정명");
		jlblCourseName.setBounds(60, 290, 80, 15);
		contentPanel.add(jlblCourseName);
		
		JLabel jlblTeacherName = new JLabel("담당강사");
		jlblTeacherName.setBounds(60, 330, 80, 15);
		contentPanel.add(jlblTeacherName);
		
		JLabel jlblTrainingPeriod = new JLabel("교육기간");
		jlblTrainingPeriod.setBounds(60, 360, 80, 15);
		contentPanel.add(jlblTrainingPeriod);
		
		jlblIDSet = new JLabel("20250001");
		jlblIDSet.setBounds(178, 60, 200, 15);
		contentPanel.add(jlblIDSet);
		
		jbtnPassChange = new JButton("비밀번호 변경");
		jbtnPassChange.setBounds(175, 87, 120, 20);
		contentPanel.add(jbtnPassChange);
		
		jlblNameSet = new JLabel("홍길동");
		jlblNameSet.setBounds(178, 120, 200, 15);
		contentPanel.add(jlblNameSet);
		
		JLabel jlblBirthSet = new JLabel("1996-04-02");
		jlblBirthSet.setBounds(178, 150, 200, 15);
		contentPanel.add(jlblBirthSet);
		
		JTextArea jtaAddress = new JTextArea();
		jtaAddress.setText("제주특별자치도 애월읍 하소로 18 킹스톤 A동 202호");
		jtaAddress.setBounds(178, 210, 200, 70);
		jtaAddress.setLineWrap(true);
		contentPanel.add(jtaAddress);
		
		JLabel jlblCourseNameSet = new JLabel("<html>AWS와 Docker&Kuberneter활용한<br>Java Full-Stack 개발자 양성과정</html>");
		jlblCourseNameSet.setBounds(178, 290, 200, 30);
		contentPanel.add(jlblCourseNameSet);
		
		jtfTel = new JTextField();
		jtfTel.setText("010-5745-1853");
		jtfTel.setBounds(178, 175, 200, 20);
		jtfTel.setColumns(10);
		contentPanel.add(jtfTel);
		
		JLabel jlblTeacherNameSet = new JLabel("아무개");
		jlblTeacherNameSet.setBounds(178, 330, 200, 15);
		contentPanel.add(jlblTeacherNameSet);
		
		JLabel jlblTrainingPeriodSet = new JLabel("2025-07-24");
		jlblTrainingPeriodSet.setBounds(178, 360, 200, 15);
		contentPanel.add(jlblTrainingPeriodSet);
		
		JButton jbtnOk = new JButton("수정");
		jbtnOk.setBounds(110, 400, 100, 30);
		contentPanel.add(jbtnOk);
		
		JButton jbtnCancel = new JButton("닫기");
		jbtnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}// actionPerformed
		});// 닫기버튼 종료처리
		jbtnCancel.setBounds(240, 400, 100, 30);
		contentPanel.add(jbtnCancel);
		
		// #. 이벤트 추가
		InfoEvt ie = new InfoEvt(this);
		jbtnPassChange.addActionListener(ie);
		
		// 부모창에서 켜지기
		setLocationRelativeTo(mw);
		
		// 가시화
		setVisible(true);
	}

	public JButton getJbtnPassChange() {
		return jbtnPassChange;
	}// getJbtnPassChange
	
}// class
