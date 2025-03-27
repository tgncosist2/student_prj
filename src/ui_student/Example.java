package ui_student;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.*;

import ui_student_evt.ExampleEvt;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Example extends JDialog {

	private JButton jbtnReport;
	private JButton jbtnGoTest;
	private JLabel jlblTrainingPeriodSet;
	private JLabel jlblNameSet;
	private JLabel jlblTeacherSet;
	private JLabel lblJavaSet;
	
	public Example(mainWindow mw) {
		super(mw,"시험",true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		JPanel contentPanel = new JPanel();
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel jlblTitle = new JLabel("시험");
		jlblTitle.setBounds(150, 5, 100, 30);
		contentPanel.add(jlblTitle);
		jlblTitle.setFont(new Font("Gulim 12",1,20));
		jlblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel jlblName = new JLabel("학생명");
		jlblName.setBounds(100, 50, 70, 15);
		contentPanel.add(jlblName);
		jlblName.setHorizontalAlignment(SwingConstants.CENTER);
		
		jlblNameSet = new JLabel("홍길동");
		jlblNameSet.setBounds(220, 50, 70, 15);
		contentPanel.add(jlblNameSet);
		jlblNameSet.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel jlblSubject = new JLabel("과목명");
		jlblSubject.setHorizontalAlignment(SwingConstants.CENTER);
		jlblSubject.setBounds(100, 80, 70, 15);
		contentPanel.add(jlblSubject);
		
		JLabel jlblTeacher = new JLabel("담당강사");
		jlblTeacher.setHorizontalAlignment(SwingConstants.CENTER);
		jlblTeacher.setBounds(100, 110, 70, 15);
		contentPanel.add(jlblTeacher);
		
		jlblTeacherSet = new JLabel("아무개");
		jlblTeacherSet.setHorizontalAlignment(SwingConstants.CENTER);
		jlblTeacherSet.setBounds(220, 110, 70, 15);
		contentPanel.add(jlblTeacherSet);
		
		JLabel jlblTrainingPeriod = new JLabel("교육기간");
		jlblTrainingPeriod.setHorizontalAlignment(SwingConstants.CENTER);
		jlblTrainingPeriod.setBounds(100, 140, 70, 15);
		contentPanel.add(jlblTrainingPeriod);
		
		jlblTrainingPeriodSet = new JLabel("2025-07-25");
		jlblTrainingPeriodSet.setHorizontalAlignment(SwingConstants.CENTER);
		jlblTrainingPeriodSet.setBounds(220, 140, 70, 15);
		contentPanel.add(jlblTrainingPeriodSet);
		
		jbtnGoTest = new JButton("시험응시");
		jbtnGoTest.setBounds(45, 200, 90, 30);
		contentPanel.add(jbtnGoTest);
		
		jbtnReport = new JButton("성적표");
		jbtnReport.setBounds(175, 200, 90, 30);
		contentPanel.add(jbtnReport);
		
		JButton jbtnCancel = new JButton("닫기");
		jbtnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		jbtnCancel.setBounds(305, 200, 90, 30);
		contentPanel.add(jbtnCancel);
		
		lblJavaSet = new JLabel("Java");
		lblJavaSet.setHorizontalAlignment(SwingConstants.CENTER);
		lblJavaSet.setBounds(220, 80, 70, 15);
		contentPanel.add(lblJavaSet);
		
		// # 이벤트 추가
		ExampleEvt ee = new ExampleEvt(this);
		jbtnReport.addActionListener(ee);
		jbtnGoTest.addActionListener(ee);
		
		setLocationRelativeTo(mw);
		setVisible(true);
	}// Example
	
	public JButton getJbtnReport() {
		return jbtnReport;
	}// getJbtnReport
	
	public JButton getJbtnGoTest() {
		return jbtnGoTest;
	}// getJbtnGoTest

	public JLabel getJlblTrainingPeriodSet() {
		return jlblTrainingPeriodSet;
	}// getJlblTrainingPeriodSet

	public JLabel getJlblNameSet() {
		return jlblNameSet;
	}// getJlblNameSet

	public JLabel getJlblTeacherSet() {
		return jlblTeacherSet;
	}// getJlblTeacherSet

	public JLabel getLblJavaSet() {
		return lblJavaSet;
	}// getLblJavaSet
	
}// class
