package ui_student_evt;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import ui_student.BoardReadView;
import ui_student.BoardView;
import ui_student.BoardWriteView;

public class BoardEvt extends MouseAdapter implements ActionListener {

	private BoardView board;

	public BoardEvt(BoardView board) {
		this.board = board;
	}// boardEvt

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == board.getJbtnWrite()) {
			new BoardWriteView(board);
		} // 작성 버튼

	}// actionPerformed

	@Override
	public void mouseClicked(MouseEvent e) {
		int clickNum = board.getTable().getSelectedRow();

		new BoardReadView(board, clickNum);

	}// mouseClicked

}// class
