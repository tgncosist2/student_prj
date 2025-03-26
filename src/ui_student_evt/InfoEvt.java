package ui_student_evt;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import ui_student.Info;
import ui_student.Info_ChangePass;

public class InfoEvt implements ActionListener{

	Info info;
	
	public InfoEvt(Info info) {
		this.info = info;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == info.getJbtnPassChange()) {
			new Info_ChangePass(info);
		}
	}

}