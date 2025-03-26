package ui_student_evt;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import ui_student.Example;
import ui_student.Example_Report;
import ui_student.Example_Test;

public class ExampleEvt implements ActionListener {

	Example exam;
	
	public ExampleEvt(Example exam) {
		this.exam = exam;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == exam.getJbtnReport()) {
			new Example_Report(exam);
		}// 성적표 버튼
		if(e.getSource() == exam.getJbtnGoTest()) {
			new Example_Test(exam);
		}// 성적표 버튼
	}// actionPerformed

}
