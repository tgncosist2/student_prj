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
		
		JLabel jlblName_1 = new JLabel("홍길동");
		jlblName_1.setHorizontalAlignment(SwingConstants.CENTER);
		jlblName_1.setBounds(220, 40, 70, 20);
		contentPanel.add(jlblName_1);
		
		JLabel jlblTeacher = new JLabel("담당강사");
		jlblTeacher.setHorizontalAlignment(SwingConstants.CENTER);
		jlblTeacher.setBounds(110, 70, 70, 20);
		contentPanel.add(jlblTeacher);
		
		JLabel jlblTeacher_1 = new JLabel("아무개");
		jlblTeacher_1.setHorizontalAlignment(SwingConstants.CENTER);
		jlblTeacher_1.setBounds(220, 70, 70, 20);
		contentPanel.add(jlblTeacher_1);
		
		JLabel jlblTrainingPeriod = new JLabel("교육기간");
		jlblTrainingPeriod.setHorizontalAlignment(SwingConstants.CENTER);
		jlblTrainingPeriod.setBounds(110, 100, 70, 20);
		contentPanel.add(jlblTrainingPeriod);
		
		JLabel jlblTrainingPeriod_1 = new JLabel("2025-07-25");
		jlblTrainingPeriod_1.setHorizontalAlignment(SwingConstants.CENTER);
		jlblTrainingPeriod_1.setBounds(220, 100, 70, 20);
		contentPanel.add(jlblTrainingPeriod_1);
		
		JLabel jlblSubject = new JLabel("과목");
		jlblSubject.setHorizontalAlignment(SwingConstants.CENTER);
		jlblSubject.setBounds(110, 130, 70, 20);
		contentPanel.add(jlblSubject);
		
		JComboBox jcbSubject = new JComboBox();
		jcbSubject.setModel(new DefaultComboBoxModel(new String[] {"Java", "Oracle"}));
		jcbSubject.setBounds(220, 130, 70, 20);
		contentPanel.add(jcbSubject);
		
		JLabel jlblGrade = new JLabel("성적");
		jlblGrade.setHorizontalAlignment(SwingConstants.CENTER);
		jlblGrade.setBounds(110, 160, 70, 20);
		contentPanel.add(jlblGrade);
		
		JLabel lblA = new JLabel("A");
		lblA.setHorizontalAlignment(SwingConstants.CENTER);
		lblA.setBounds(220, 160, 70, 20);
		contentPanel.add(lblA);
		
		JLabel jlblAnswer = new JLabel("정답수");
		jlblAnswer.setHorizontalAlignment(SwingConstants.CENTER);
		jlblAnswer.setBounds(110, 190, 70, 20);
		contentPanel.add(jlblAnswer);
		
		JLabel jlblAnswer_1 = new JLabel("8/10");
		jlblAnswer_1.setHorizontalAlignment(SwingConstants.CENTER);
		jlblAnswer_1.setBounds(220, 190, 70, 20);
		contentPanel.add(jlblAnswer_1);
		
		JLabel jlblAverage = new JLabel("평균");
		jlblAverage.setHorizontalAlignment(SwingConstants.CENTER);
		jlblAverage.setBounds(110, 220, 70, 20);
		contentPanel.add(jlblAverage);
		
		JLabel jlblAverage_1 = new JLabel("9/10");
		jlblAverage_1.setHorizontalAlignment(SwingConstants.CENTER);
		jlblAverage_1.setBounds(220, 223, 70, 20);
		contentPanel.add(jlblAverage_1);
		
		JButton btnNewButton = new JButton("닫기");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton.setBounds(155, 270, 100, 25);
		contentPanel.add(btnNewButton);
		
		setBounds(100, 100, 440, 350);
		setLocationRelativeTo(e);
		setVisible(true);
	}

}
