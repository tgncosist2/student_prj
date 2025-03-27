package ui_student;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Info_ChangePass extends JDialog {

	private JTextField jtfNowPass;
	private JTextField jtfChangePass;
	private JTextField jtfChangePassCheck;

	public Info_ChangePass(Info info) {
		super(info, "비밀번호 변경", true);
		JPanel contentPanel = new JPanel();

		JLabel jlblTitle = new JLabel("비밀번호 변경");
		jlblTitle.setBounds(110, 5, 200, 30);
		contentPanel.add(jlblTitle);
		jlblTitle.setFont(new Font("Gulim 12", 1, 20));
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

		jtfChangePass = new JTextField();
		jtfChangePass.setColumns(10);
		jtfChangePass.setBounds(240, 75, 120, 20);
		contentPanel.add(jtfChangePass);

		jtfChangePassCheck = new JTextField();
		jtfChangePassCheck.setColumns(10);
		jtfChangePassCheck.setBounds(240, 105, 120, 20);
		contentPanel.add(jtfChangePassCheck);

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
	}// Info_ChangePass

	public JTextField getJtfNowPass() {
		return jtfNowPass;
	}// getJtfNowPass

	public JTextField getJtfChangePass() {
		return jtfChangePass;
	}// getJtfChangePass

	public JTextField getJtfChangePassCheck() {
		return jtfChangePassCheck;
	}// getJtfChangePassCheck

}// class
