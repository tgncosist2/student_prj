package ui_student_evt;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import ui_student.Example;
import ui_student.Gesipan;
import ui_student.Info;
import ui_student.mainWindow;

public class mainWindowEvt implements ActionListener {

	public mainWindow mw;
	
	public mainWindowEvt(mainWindow mw) {
		this.mw = mw;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == mw.getJbtnInfo()) {
			new Info(mw);
		}// 개인정보 버튼
		if(e.getSource() == mw.getJbtnExample()) {
			new Example(mw);
		}// 시험 버튼
		if(e.getSource() == mw.getJbtnGesipan()) {
			new Gesipan(mw);
		}// 1:1문의 버튼
	}// actionPerformed

}// class
