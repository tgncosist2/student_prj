package ui_student;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Gesipan_Read extends JDialog {

	public Gesipan_Read(Gesipan ges, int num) {
		super(ges, "읽기", true);
		JPanel contentPanel = new JPanel();
		setBounds(100, 100, 675, 551);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JPanel jpTitle = new JPanel();
		jpTitle.setBounds(10, 10, 635, 54);
		contentPanel.add(jpTitle);
		jpTitle.setLayout(null);
		jpTitle.setBorder(new TitledBorder(""));
		
		JLabel jlblTitle = new JLabel("제목");
		jlblTitle.setBounds(15, 20, 50, 15);
		jlblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		jpTitle.add(jlblTitle);
		
		JLabel jlblTitleSet = new JLabel("<html></html>");
		jlblTitleSet.setBounds(50, 10, 550, 30);
		jpTitle.add(jlblTitleSet);
		
		JPanel jpBoard = new JPanel();
		jpBoard.setBounds(10, 70, 635, 344);
		jpBoard.setBorder(new TitledBorder(""));
		contentPanel.add(jpBoard);
		jpBoard.setLayout(new BorderLayout(0, 0));
		
		JTextArea textArea = new JTextArea();
		jpBoard.add(textArea, BorderLayout.CENTER);
		
		JPanel jpComment = new JPanel();
		jpComment.setBounds(10, 413, 635, 64);
		jpComment.setBorder(new TitledBorder("답글"));
		contentPanel.add(jpComment);
		jpComment.setLayout(new BorderLayout(0, 0));
		
		JTextArea textArea_1 = new JTextArea();
		jpComment.add(textArea_1, BorderLayout.CENTER);
		
		JButton jbtnExit = new JButton("닫기");
		jbtnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		jbtnExit.setBounds(570, 485, 70, 20);
		contentPanel.add(jbtnExit);
		
		
		setLocationRelativeTo(ges);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setVisible(true);
	}
}
