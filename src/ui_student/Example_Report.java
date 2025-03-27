package ui_student;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;

public class Example_Report extends JDialog {

	private JLabel jlblNameSet;
	private JLabel jlblTeacherSet;
	private JLabel jlblTrainingPeriodSet;
	private JLabel jlblGradeSet;
	private JLabel jlblAnswerSet;
	private JLabel jlblAverageSet;
	private JComboBox jcbSubjectSet;
	
	public Example_Report(Example e) {
		super(e,"성적표",true);
		JPanel contentPanel = new JPanel();
		getContentPane().setLayout(new BorderLayout());
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		JLabel jlblTitle = new JLabel("성적표");
		jlblTitle.setBounds(150, 5, 100, 30);
		contentPanel.add(jlblTitle);
		jlblTitle.setFont(new Font("Gulim 12",1,20));
		jlblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel jlblName = new JLabel("학생명");
		jlblName.setBounds(110, 40, 70, 20);
		jlblName.setHorizontalAlignment(SwingConstants.CENTER);
		contentPanel.add(jlblName);
		
		jlblNameSet = new JLabel("홍길동");
		jlblNameSet.setHorizontalAlignment(SwingConstants.CENTER);
		jlblNameSet.setBounds(220, 40, 70, 20);
		contentPanel.add(jlblNameSet);
		
		JLabel jlblTeacher = new JLabel("담당강사");
		jlblTeacher.setHorizontalAlignment(SwingConstants.CENTER);
		jlblTeacher.setBounds(110, 70, 70, 20);
		contentPanel.add(jlblTeacher);
		
		jlblTeacherSet = new JLabel("아무개");
		jlblTeacherSet.setHorizontalAlignment(SwingConstants.CENTER);
		jlblTeacherSet.setBounds(220, 70, 70, 20);
		contentPanel.add(jlblTeacherSet);
		
		JLabel jlblTrainingPeriod = new JLabel("교육기간");
		jlblTrainingPeriod.setHorizontalAlignment(SwingConstants.CENTER);
		jlblTrainingPeriod.setBounds(110, 100, 70, 20);
		contentPanel.add(jlblTrainingPeriod);
		
		jlblTrainingPeriodSet = new JLabel("2025-07-25");
		jlblTrainingPeriodSet.setHorizontalAlignment(SwingConstants.CENTER);
		jlblTrainingPeriodSet.setBounds(220, 100, 70, 20);
		contentPanel.add(jlblTrainingPeriodSet);
		
		JLabel jlblSubject = new JLabel("과목");
		jlblSubject.setHorizontalAlignment(SwingConstants.CENTER);
		jlblSubject.setBounds(110, 130, 70, 20);
		contentPanel.add(jlblSubject);
		
		jcbSubjectSet = new JComboBox();
		jcbSubjectSet.setModel(new DefaultComboBoxModel(new String[] {"Java", "Oracle"}));
		jcbSubjectSet.setBounds(220, 130, 70, 20);
		contentPanel.add(jcbSubjectSet);
		
		JLabel jlblGrade = new JLabel("성적");
		jlblGrade.setHorizontalAlignment(SwingConstants.CENTER);
		jlblGrade.setBounds(110, 160, 70, 20);
		contentPanel.add(jlblGrade);
		
		jlblGradeSet = new JLabel("A");
		jlblGradeSet.setHorizontalAlignment(SwingConstants.CENTER);
		jlblGradeSet.setBounds(220, 160, 70, 20);
		contentPanel.add(jlblGradeSet);
		
		JLabel jlblAnswer = new JLabel("정답수");
		jlblAnswer.setHorizontalAlignment(SwingConstants.CENTER);
		jlblAnswer.setBounds(110, 190, 70, 20);
		contentPanel.add(jlblAnswer);
		
		jlblAnswerSet = new JLabel("8/10");
		jlblAnswerSet.setHorizontalAlignment(SwingConstants.CENTER);
		jlblAnswerSet.setBounds(220, 190, 70, 20);
		contentPanel.add(jlblAnswerSet);
		
		JLabel jlblAverage = new JLabel("평균");
		jlblAverage.setHorizontalAlignment(SwingConstants.CENTER);
		jlblAverage.setBounds(110, 220, 70, 20);
		contentPanel.add(jlblAverage);
		
		jlblAverageSet = new JLabel("9/10");
		jlblAverageSet.setHorizontalAlignment(SwingConstants.CENTER);
		jlblAverageSet.setBounds(220, 223, 70, 20);
		contentPanel.add(jlblAverageSet);
		
		JButton btnNewButton = new JButton("닫기");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}// actionPerformed
		});
		btnNewButton.setBounds(155, 270, 100, 25);
		contentPanel.add(btnNewButton);
		
		setBounds(100, 100, 440, 350);
		setLocationRelativeTo(e);
		setVisible(true);
	}// Example_Report

	public JLabel getJlblNameSet() {
		return jlblNameSet;
	}

	public JLabel getJlblTeacherSet() {
		return jlblTeacherSet;
	}

	public JLabel getJlblTrainingPeriodSet() {
		return jlblTrainingPeriodSet;
	}

	public JLabel getJlblGradeSet() {
		return jlblGradeSet;
	}

	public JLabel getJlblAnswerSet() {
		return jlblAnswerSet;
	}

	public JLabel getJlblAverageSet() {
		return jlblAverageSet;
	}

	public JComboBox getJcbSubjectSet() {
		return jcbSubjectSet;
	}

	
	
}
