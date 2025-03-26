package ui_student;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Info_ChangePass extends JDialog {

	private JTextField jtfNowPass;
	private JTextField textField;
	private JTextField textField_1;

	public Info_ChangePass(Info info) {
		super(info, "비밀번호 변경", true);
		JPanel contentPanel = new JPanel();
		
		JLabel jlblTitle = new JLabel("비밀번호 변경");
		jlblTitle.setBounds(110, 5, 200, 30);
		contentPanel.add(jlblTitle);
		jlblTitle.setFont(new Font("Gulim 12",1,20));
		jlblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		
		setBounds(100, 100, 450, 240);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel jlblNowPass = new JLabel("현재 비밀번호");
		jlblNowPass.setBounds(50, 45, 120, 20);
		contentPanel.add(jlblNowPass);
		jlblNowPass.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel jlblChangePass = new JLabel("변경 비밀번호");
		jlblChangePass.setHorizontalAlignment(SwingConstants.CENTER);
		jlblChangePass.setBounds(50, 75, 120, 20);
		contentPanel.add(jlblChangePass);
		
		JLabel jlblChangePass_1 = new JLabel("변경 비밀번호 확인");
		jlblChangePass_1.setHorizontalAlignment(SwingConstants.CENTER);
		jlblChangePass_1.setBounds(50, 105, 120, 20);
		contentPanel.add(jlblChangePass_1);
		
		jtfNowPass = new JTextField();
		jtfNowPass.setBounds(240, 45, 120, 20);
		contentPanel.add(jtfNowPass);
		jtfNowPass.setColumns(10);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(240, 75, 120, 20);
		contentPanel.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(240, 105, 120, 20);
		contentPanel.add(textField_1);
		
		JButton jbtnOk = new JButton("변경");
		jbtnOk.setBounds(100, 150, 100, 30);
		contentPanel.add(jbtnOk);
		
		JButton jbtnCancel = new JButton("닫기");
		jbtnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		jbtnCancel.setBounds(230, 150, 100, 30);
		contentPanel.add(jbtnCancel);
		
		setLocationRelativeTo(info);
		setVisible(true);
	}
}
