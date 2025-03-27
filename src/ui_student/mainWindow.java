package ui_student;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import ui_student_evt.mainWindowEvt;

public class mainWindow extends JFrame {

	private JButton jbtnInfo;
	private JButton jbtnExample;
	private JButton jbtnBoard;
	private JLabel jlblNameSet;
	private JLabel jlblTeacherNameSet;

	public mainWindow() {
		Login loginDialog = new Login(this);
		loginDialog.setVisible(true);

		// 로그인창 종료시 프로그램 종료
		if (!loginDialog.isLoginSuccess()) {
			System.exit(3);
			return;
		} // end if

		JPanel contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel jlblTitle = new JLabel("베스트캠퍼스");
		jlblTitle.setBounds(120, 10, 200, 40);
		contentPane.add(jlblTitle);
		jlblTitle.setFont(new Font("Gulim 12", 1, 20));
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

		jbtnBoard = new JButton("1:1 문의");
		jbtnBoard.setBounds(300, 135, 100, 40);
		contentPane.add(jbtnBoard);

		jlblNameSet = new JLabel("홍길동");
		jlblNameSet.setBounds(170, 60, 70, 15);
		contentPane.add(jlblNameSet);

		jlblTeacherNameSet = new JLabel("아무개");
		jlblTeacherNameSet.setBounds(170, 90, 70, 15);
		contentPane.add(jlblTeacherNameSet);

		// # 이벤트 추가
		mainWindowEvt mwe = new mainWindowEvt(this);
		jbtnInfo.addActionListener(mwe);
		jbtnExample.addActionListener(mwe);
		jbtnBoard.addActionListener(mwe);

		// 사이즈
		setBounds(800, 300, 450, 230);

		// 가시화
		setVisible(true);

		// 종료 처리
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}// mainWindow

	public JButton getJbtnBoard() {
		return jbtnBoard;
	}// getJbtnBoard

	public JButton getJbtnInfo() {
		return jbtnInfo;
	}// getJbtnInfo

	public JButton getJbtnExample() {
		return jbtnExample;
	}// getJbtnExample

}// class
