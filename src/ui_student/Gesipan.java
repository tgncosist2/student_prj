package ui_student;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import ui_student_evt.GesipanEvt;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Gesipan extends JDialog {

	private JTable table;
	private JButton jbtnWrite;
	
	
	public JButton getJbtnWrite() {
		return jbtnWrite;
	}
	
	public JTable getTable() {
		return table;
	}

	public Gesipan(mainWindow mw) {
		super(mw,"1:1문의",true);
		setBounds(100, 100, 675, 550);
		getContentPane().setLayout(new BorderLayout());
		JPanel contentPanel = new JPanel();
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel jlblTitle = new JLabel("1:1문의");
		jlblTitle.setBounds(280, 5, 100, 30);
		contentPanel.add(jlblTitle);
		jlblTitle.setFont(new Font("Gulim 12",1,20));
		jlblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		
		DefaultTableModel dtm = new DefaultTableModel();
		dtm.addColumn("번호");
		dtm.addColumn("제목");
		dtm.addColumn("작성자");
		dtm.addColumn("작성일");
		dtm.addColumn("상태");
		dtm.addRow(new Object[] {"1","시험 관련 문의","홍길동","2025-03-24","답변 완료"});
		dtm.addRow(new Object[] {"2","연차 문의","홍길동","2025-03-24","진행 중"});
		
		
		JButton jbtnCancel = new JButton("닫기");
		jbtnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		jbtnCancel.setBounds(555, 455, 70, 20);
		contentPanel.add(jbtnCancel);
		
		table = new JTable(dtm);
		table.setDefaultEditor(Object.class, null);
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(25,40,600,400);
		contentPanel.add(scrollPane);
		
		jbtnWrite = new JButton("작성");		
		jbtnWrite.setBounds(280, 450, 100, 30);
		contentPanel.add(jbtnWrite);
		
		// #. 이벤트 작성
		GesipanEvt ge = new GesipanEvt(this);
		jbtnWrite.addActionListener(ge);
		table.addMouseListener(ge);;
		
		
		setLocationRelativeTo(mw);
		setVisible(true);
	}
}
