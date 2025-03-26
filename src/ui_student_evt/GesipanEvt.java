package ui_student_evt;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import ui_student.Gesipan;
import ui_student.Gesipan_Read;
import ui_student.Gesipan_Write;

public class GesipanEvt extends MouseAdapter implements ActionListener{

	Gesipan gesipan;

	public GesipanEvt(Gesipan gesipan) {
		this.gesipan = gesipan;
	}// GesipanEvt
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == gesipan.getJbtnWrite()) {
			new Gesipan_Write(gesipan);
		}
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		int clickNum = gesipan.getTable().getSelectedRow();
		
		new Gesipan_Read(gesipan, clickNum);
	}
	
}
