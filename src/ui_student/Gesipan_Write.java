package ui_student;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Gesipan_Write extends JDialog {

	private JTextField jtfTitle;

	public Gesipan_Write(Gesipan ges) {
		super(ges,"작성",true);
		setBounds(100, 100, 675, 550);
		getContentPane().setLayout(new BorderLayout());
		JPanel contentPanel = new JPanel();
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel jlblTitle = new JLabel("제목");
		jlblTitle.setBounds(10, 10, 50, 20);
		contentPanel.add(jlblTitle);
		jlblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		
		jtfTitle = new JTextField();
		jtfTitle.setBounds(72, 10, 575, 21);
		contentPanel.add(jtfTitle);
		jtfTitle.setColumns(10);
		
		JTextArea jtaBoard = new JTextArea();
		jtaBoard.setBounds(10, 37, 637, 410);
		contentPanel.add(jtaBoard);
		
		JButton jbtnWrite = new JButton("등록");
		jbtnWrite.setBounds(200, 460, 90, 30);
		contentPanel.add(jbtnWrite);
		
		JButton jbtnExit = new JButton("닫기");
		jbtnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		jbtnExit.setBounds(350, 460, 90, 30);
		contentPanel.add(jbtnExit);
		setLocationRelativeTo(ges);
		setVisible(true);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
	}

}
