package ui_student;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Example_Test extends JDialog {

	public Example_Test(Example e) {
		super(e, "시험", true);
		getContentPane().setLayout(null);
		
		JLabel jlblTitle = new JLabel("시험");
		jlblTitle.setBounds(195, 10, 170, 25);
		getContentPane().add(jlblTitle);
		jlblTitle.setFont(new Font("Gulim 12",1,20));
		jlblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel jpExam = new JPanel();
		jpExam.setLayout(null);
		jpExam.setPreferredSize(new Dimension(300, 2320));
		JScrollPane jspExam = new JScrollPane(jpExam,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		
		jspExam.setBounds(12, 40, 560, 425);
		getContentPane().add(jspExam);
		
		JPanel jpNo1Exam = new JPanel();
		jpExam.add(jpNo1Exam);
		jpNo1Exam.setBounds(10,10,520,220);
		jpNo1Exam.setBorder(new TitledBorder(""));
		jpNo1Exam.setLayout(null);
		
		JLabel jlblNo1Title = new JLabel("문제 1");
		jlblNo1Title.setBounds(10, 15, 50, 20);
		jpNo1Exam.add(jlblNo1Title);
		jlblNo1Title.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel jlblNo1Sub = new JLabel("<html>JAVA 변수타입 중 정수형이 아닌 것은?</html>");
		jlblNo1Sub.setBounds(70, 10, 430, 30);
		jpNo1Exam.add(jlblNo1Sub);
		
		
		JLabel jlblNo1Option_1 = new JLabel("①");
		jlblNo1Option_1.setBounds(40, 60, 20, 20);
		jpNo1Exam.add(jlblNo1Option_1);
		jlblNo1Option_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel jlblNo1Option_2 = new JLabel("②");
		jlblNo1Option_2.setHorizontalAlignment(SwingConstants.CENTER);
		jlblNo1Option_2.setBounds(40, 90, 20, 20);
		jpNo1Exam.add(jlblNo1Option_2);
		
		JLabel jlblNo1Option_3 = new JLabel("③");
		jlblNo1Option_3.setHorizontalAlignment(SwingConstants.CENTER);
		jlblNo1Option_3.setBounds(40, 120, 20, 20);
		jpNo1Exam.add(jlblNo1Option_3);
		
		JLabel jlblNo1Option_4 = new JLabel("④");
		jlblNo1Option_4.setHorizontalAlignment(SwingConstants.CENTER);
		jlblNo1Option_4.setBounds(40, 150, 20, 20);
		jpNo1Exam.add(jlblNo1Option_4);
		
		JLabel jlblNo1Answer = new JLabel("정답 : ");
		jlblNo1Answer.setBounds(370, 190, 40, 20);
		jpNo1Exam.add(jlblNo1Answer);
		
		JLabel jlblNo1OptionAnw_1 = new JLabel("int");
		jlblNo1OptionAnw_1.setBounds(70, 55, 420, 30);
		jpNo1Exam.add(jlblNo1OptionAnw_1);
		
		JLabel jlblNo1OptionAnw_3 = new JLabel("long");
		jlblNo1OptionAnw_3.setBounds(70, 85, 420, 30);
		jpNo1Exam.add(jlblNo1OptionAnw_3);
		
		JLabel jlblNo1OptionAnw_2 = new JLabel("byte");
		jlblNo1OptionAnw_2.setBounds(70, 115, 420, 30);
		jpNo1Exam.add(jlblNo1OptionAnw_2);
		
		JLabel jlblNo1OptionAnw_4 = new JLabel("float");
		jlblNo1OptionAnw_4.setBounds(70, 145, 420, 30);
		jpNo1Exam.add(jlblNo1OptionAnw_4);
		
		JComboBox jcbNo1Answer = new JComboBox();
		jcbNo1Answer.setModel(new DefaultComboBoxModel(new String[] {" ", "①", "②", "③", "④"}));
		jcbNo1Answer.setBounds(420, 190, 60, 20);
		jpNo1Exam.add(jcbNo1Answer);
		
		JPanel jpNo2Exam = new JPanel();
		jpNo2Exam.setLayout(null);
		jpNo2Exam.setBorder(new TitledBorder(""));
		jpNo2Exam.setBounds(10, 240, 520, 220);
		jpExam.add(jpNo2Exam);
		
		JLabel jlblNo2Title = new JLabel("문제 2");
		jlblNo2Title.setHorizontalAlignment(SwingConstants.CENTER);
		jlblNo2Title.setBounds(10, 15, 50, 20);
		jpNo2Exam.add(jlblNo2Title);
		
		JLabel jlblNo2Sub = new JLabel("<html>메시지 지향 미들웨어(Message-Oriented Middleware, MOM)에 대한 설명으로 틀린 것은?</html>");
		jlblNo2Sub.setBounds(70, 10, 430, 30);
		jpNo2Exam.add(jlblNo2Sub);
		
		JLabel jlblNo2Option_1 = new JLabel("①");
		jlblNo2Option_1.setHorizontalAlignment(SwingConstants.CENTER);
		jlblNo2Option_1.setBounds(40, 60, 20, 20);
		jpNo2Exam.add(jlblNo2Option_1);
		
		JLabel jlblNo2Option_2 = new JLabel("②");
		jlblNo2Option_2.setHorizontalAlignment(SwingConstants.CENTER);
		jlblNo2Option_2.setBounds(40, 90, 20, 20);
		jpNo2Exam.add(jlblNo2Option_2);
		
		JLabel jlblNo2Option_3 = new JLabel("③");
		jlblNo2Option_3.setHorizontalAlignment(SwingConstants.CENTER);
		jlblNo2Option_3.setBounds(40, 120, 20, 20);
		jpNo2Exam.add(jlblNo2Option_3);
		
		JLabel jlblNo2Option_4 = new JLabel("④");
		jlblNo2Option_4.setHorizontalAlignment(SwingConstants.CENTER);
		jlblNo2Option_4.setBounds(40, 150, 20, 20);
		jpNo2Exam.add(jlblNo2Option_4);
		
		JLabel jlblNo2Answer = new JLabel("정답 : ");
		jlblNo2Answer.setBounds(370, 190, 40, 20);
		jpNo2Exam.add(jlblNo2Answer);
		
		JLabel jlblNo2OptionAnw_1 = new JLabel("<html>느리고 안정적인 응답보다는 즉각적인 응답이 필요한 온라인 업무에 적합하다.</html>");
		jlblNo2OptionAnw_1.setBounds(70, 55, 420, 30);
		jpNo2Exam.add(jlblNo2OptionAnw_1);
		
		JLabel jlblNo2OptionAnw_3 = new JLabel("<html>독립적인 애플리케이션을 하나의 통합된 시스템으로 묶기 위한 역할을 한다.</html>");
		jlblNo2OptionAnw_3.setBounds(70, 85, 420, 30);
		jpNo2Exam.add(jlblNo2OptionAnw_3);
		
		JLabel jlblNo2OptionAnw_2 = new JLabel("<html>송신측과 수신측의 연결 시 메시지 큐를 활용하는 방법이 있다.</html>");
		jlblNo2OptionAnw_2.setBounds(70, 115, 420, 30);
		jpNo2Exam.add(jlblNo2OptionAnw_2);
		
		JLabel jlblNo2OptionAnw_4 = new JLabel("<html>상이한 애플리케이션 간 통신을 비동기 방식으로 지원한다.</html>");
		jlblNo2OptionAnw_4.setBounds(70, 145, 420, 30);
		jpNo2Exam.add(jlblNo2OptionAnw_4);
		
		JComboBox jcbNo2Answer = new JComboBox();
		jcbNo2Answer.setModel(new DefaultComboBoxModel(new String[] {" ", "①", "②", "③", "④"}));
		jcbNo2Answer.setBounds(420, 190, 60, 20);
		jpNo2Exam.add(jcbNo2Answer);
		
		JPanel jpNo3Exam = new JPanel();
		jpNo3Exam.setLayout(null);
		jpNo3Exam.setBorder(new TitledBorder(""));
		jpNo3Exam.setBounds(10, 470, 520, 220);
		jpExam.add(jpNo3Exam);
		
		JLabel jlblNo3Title = new JLabel("문제 3");
		jlblNo3Title.setHorizontalAlignment(SwingConstants.CENTER);
		jlblNo3Title.setBounds(10, 15, 50, 20);
		jpNo3Exam.add(jlblNo3Title);
		
		JLabel jlblNo3Sub = new JLabel("<html></html>");
		jlblNo3Sub.setBounds(70, 10, 430, 30);
		jpNo3Exam.add(jlblNo3Sub);
		
		JLabel jlblNo3Option_1 = new JLabel("①");
		jlblNo3Option_1.setHorizontalAlignment(SwingConstants.CENTER);
		jlblNo3Option_1.setBounds(40, 60, 20, 20);
		jpNo3Exam.add(jlblNo3Option_1);
		
		JLabel jlblNo3Option_2 = new JLabel("②");
		jlblNo3Option_2.setHorizontalAlignment(SwingConstants.CENTER);
		jlblNo3Option_2.setBounds(40, 90, 20, 20);
		jpNo3Exam.add(jlblNo3Option_2);
		
		JLabel jlblNo3Option_3 = new JLabel("③");
		jlblNo3Option_3.setHorizontalAlignment(SwingConstants.CENTER);
		jlblNo3Option_3.setBounds(40, 120, 20, 20);
		jpNo3Exam.add(jlblNo3Option_3);
		
		JLabel jlblNo3Option_4 = new JLabel("④");
		jlblNo3Option_4.setHorizontalAlignment(SwingConstants.CENTER);
		jlblNo3Option_4.setBounds(40, 150, 20, 20);
		jpNo3Exam.add(jlblNo3Option_4);
		
		JLabel jlblNo3Answer = new JLabel("정답 : ");
		jlblNo3Answer.setBounds(370, 190, 40, 20);
		jpNo3Exam.add(jlblNo3Answer);
		
		JLabel jlblNo3OptionAnw_1 = new JLabel("");
		jlblNo3OptionAnw_1.setBounds(70, 55, 420, 30);
		jpNo3Exam.add(jlblNo3OptionAnw_1);
		
		JLabel jlblNo3OptionAnw_3 = new JLabel("");
		jlblNo3OptionAnw_3.setBounds(70, 85, 420, 30);
		jpNo3Exam.add(jlblNo3OptionAnw_3);
		
		JLabel jlblNo3OptionAnw_2 = new JLabel("");
		jlblNo3OptionAnw_2.setBounds(70, 115, 420, 30);
		jpNo3Exam.add(jlblNo3OptionAnw_2);
		
		JLabel jlblNo3OptionAnw_4 = new JLabel("");
		jlblNo3OptionAnw_4.setBounds(70, 145, 420, 30);
		jpNo3Exam.add(jlblNo3OptionAnw_4);
		
		JComboBox jcbNo3Answer = new JComboBox();
		jcbNo3Answer.setModel(new DefaultComboBoxModel(new String[] {" ", "①", "②", "③", "④"}));
		jcbNo3Answer.setBounds(420, 190, 60, 20);
		jpNo3Exam.add(jcbNo3Answer);
		
		JPanel jpNo4Exam = new JPanel();
		jpNo4Exam.setLayout(null);
		jpNo4Exam.setBorder(new TitledBorder(""));
		jpNo4Exam.setBounds(10, 700, 520, 220);
		jpExam.add(jpNo4Exam);
		
		JLabel jlblNo4Title = new JLabel("문제 4");
		jlblNo4Title.setHorizontalAlignment(SwingConstants.CENTER);
		jlblNo4Title.setBounds(10, 15, 50, 20);
		jpNo4Exam.add(jlblNo4Title);
		
		JLabel jlblNo4Sub = new JLabel("<html></html>");
		jlblNo4Sub.setBounds(70, 10, 430, 30);
		jpNo4Exam.add(jlblNo4Sub);
		
		JLabel jlblNo4Option_1 = new JLabel("①");
		jlblNo4Option_1.setHorizontalAlignment(SwingConstants.CENTER);
		jlblNo4Option_1.setBounds(40, 60, 20, 20);
		jpNo4Exam.add(jlblNo4Option_1);
		
		JLabel jlblNo4Option_2 = new JLabel("②");
		jlblNo4Option_2.setHorizontalAlignment(SwingConstants.CENTER);
		jlblNo4Option_2.setBounds(40, 90, 20, 20);
		jpNo4Exam.add(jlblNo4Option_2);
		
		JLabel jlblNo4Option_3 = new JLabel("③");
		jlblNo4Option_3.setHorizontalAlignment(SwingConstants.CENTER);
		jlblNo4Option_3.setBounds(40, 120, 20, 20);
		jpNo4Exam.add(jlblNo4Option_3);
		
		JLabel jlblNo4Option_4 = new JLabel("④");
		jlblNo4Option_4.setHorizontalAlignment(SwingConstants.CENTER);
		jlblNo4Option_4.setBounds(40, 150, 20, 20);
		jpNo4Exam.add(jlblNo4Option_4);
		
		JLabel jlblNo4Answer = new JLabel("정답 : ");
		jlblNo4Answer.setBounds(370, 190, 40, 20);
		jpNo4Exam.add(jlblNo4Answer);
		
		JLabel jlblNo4OptionAnw_1 = new JLabel("");
		jlblNo4OptionAnw_1.setBounds(70, 55, 420, 30);
		jpNo4Exam.add(jlblNo4OptionAnw_1);
		
		JLabel jlblNo4OptionAnw_3 = new JLabel("");
		jlblNo4OptionAnw_3.setBounds(70, 85, 420, 30);
		jpNo4Exam.add(jlblNo4OptionAnw_3);
		
		JLabel jlblNo4OptionAnw_2 = new JLabel("");
		jlblNo4OptionAnw_2.setBounds(70, 115, 420, 30);
		jpNo4Exam.add(jlblNo4OptionAnw_2);
		
		JLabel jlblNo4OptionAnw_4 = new JLabel("");
		jlblNo4OptionAnw_4.setBounds(70, 145, 420, 30);
		jpNo4Exam.add(jlblNo4OptionAnw_4);
		
		JComboBox jcbNo4Answer = new JComboBox();
		jcbNo4Answer.setModel(new DefaultComboBoxModel(new String[] {" ", "①", "②", "③", "④"}));
		jcbNo4Answer.setBounds(420, 190, 60, 20);
		jpNo4Exam.add(jcbNo4Answer);
		
		JPanel jpNo5Exam = new JPanel();
		jpNo5Exam.setLayout(null);
		jpNo5Exam.setBorder(new TitledBorder(""));
		jpNo5Exam.setBounds(10, 930, 520, 220);
		jpExam.add(jpNo5Exam);
		
		JLabel jlblNo5Title = new JLabel("문제 5");
		jlblNo5Title.setHorizontalAlignment(SwingConstants.CENTER);
		jlblNo5Title.setBounds(10, 15, 50, 20);
		jpNo5Exam.add(jlblNo5Title);
		
		JLabel jlblNo5Sub = new JLabel("<html></html>");
		jlblNo5Sub.setBounds(70, 10, 430, 30);
		jpNo5Exam.add(jlblNo5Sub);
		
		JLabel jlblNo5Option_1 = new JLabel("①");
		jlblNo5Option_1.setHorizontalAlignment(SwingConstants.CENTER);
		jlblNo5Option_1.setBounds(40, 60, 20, 20);
		jpNo5Exam.add(jlblNo5Option_1);
		
		JLabel jlblNo5Option_2 = new JLabel("②");
		jlblNo5Option_2.setHorizontalAlignment(SwingConstants.CENTER);
		jlblNo5Option_2.setBounds(40, 90, 20, 20);
		jpNo5Exam.add(jlblNo5Option_2);
		
		JLabel jlblNo5Option_3 = new JLabel("③");
		jlblNo5Option_3.setHorizontalAlignment(SwingConstants.CENTER);
		jlblNo5Option_3.setBounds(40, 120, 20, 20);
		jpNo5Exam.add(jlblNo5Option_3);
		
		JLabel jlblNo5Option_4 = new JLabel("④");
		jlblNo5Option_4.setHorizontalAlignment(SwingConstants.CENTER);
		jlblNo5Option_4.setBounds(40, 150, 20, 20);
		jpNo5Exam.add(jlblNo5Option_4);
		
		JLabel jlblNo5Answer = new JLabel("정답 : ");
		jlblNo5Answer.setBounds(370, 190, 40, 20);
		jpNo5Exam.add(jlblNo5Answer);
		
		JLabel jlblNo5OptionAnw_1 = new JLabel("");
		jlblNo5OptionAnw_1.setBounds(70, 55, 420, 30);
		jpNo5Exam.add(jlblNo5OptionAnw_1);
		
		JLabel jlblNo5OptionAnw_3 = new JLabel("");
		jlblNo5OptionAnw_3.setBounds(70, 85, 420, 30);
		jpNo5Exam.add(jlblNo5OptionAnw_3);
		
		JLabel jlblNo5OptionAnw_2 = new JLabel("");
		jlblNo5OptionAnw_2.setBounds(70, 115, 420, 30);
		jpNo5Exam.add(jlblNo5OptionAnw_2);
		
		JLabel jlblNo5OptionAnw_4 = new JLabel("");
		jlblNo5OptionAnw_4.setBounds(70, 145, 420, 30);
		jpNo5Exam.add(jlblNo5OptionAnw_4);
		
		JComboBox jcbNo5Answer = new JComboBox();
		jcbNo5Answer.setModel(new DefaultComboBoxModel(new String[] {" ", "①", "②", "③", "④"}));
		jcbNo5Answer.setBounds(420, 190, 60, 20);
		jpNo5Exam.add(jcbNo5Answer);
		
		JPanel jpNo6Exam = new JPanel();
		jpNo6Exam.setLayout(null);
		jpNo6Exam.setBorder(new TitledBorder(""));
		jpNo6Exam.setBounds(10, 1160, 520, 220);
		jpExam.add(jpNo6Exam);
		
		JLabel jlblNo6Title = new JLabel("문제 6");
		jlblNo6Title.setHorizontalAlignment(SwingConstants.CENTER);
		jlblNo6Title.setBounds(10, 15, 50, 20);
		jpNo6Exam.add(jlblNo6Title);
		
		JLabel jlblNo6Sub = new JLabel("<html></html>");
		jlblNo6Sub.setBounds(70, 10, 430, 30);
		jpNo6Exam.add(jlblNo6Sub);
		
		JLabel jlblNo6Option_1 = new JLabel("①");
		jlblNo6Option_1.setHorizontalAlignment(SwingConstants.CENTER);
		jlblNo6Option_1.setBounds(40, 60, 20, 20);
		jpNo6Exam.add(jlblNo6Option_1);
		
		JLabel jlblNo6Option_2 = new JLabel("②");
		jlblNo6Option_2.setHorizontalAlignment(SwingConstants.CENTER);
		jlblNo6Option_2.setBounds(40, 90, 20, 20);
		jpNo6Exam.add(jlblNo6Option_2);
		
		JLabel jlblNo6Option_3 = new JLabel("③");
		jlblNo6Option_3.setHorizontalAlignment(SwingConstants.CENTER);
		jlblNo6Option_3.setBounds(40, 120, 20, 20);
		jpNo6Exam.add(jlblNo6Option_3);
		
		JLabel jlblNo6Option_4 = new JLabel("④");
		jlblNo6Option_4.setHorizontalAlignment(SwingConstants.CENTER);
		jlblNo6Option_4.setBounds(40, 150, 20, 20);
		jpNo6Exam.add(jlblNo6Option_4);
		
		JLabel jlblNo6Answer = new JLabel("정답 : ");
		jlblNo6Answer.setBounds(370, 190, 40, 20);
		jpNo6Exam.add(jlblNo6Answer);
		
		JLabel jlblNo6OptionAnw_1 = new JLabel("");
		jlblNo6OptionAnw_1.setBounds(70, 55, 420, 30);
		jpNo6Exam.add(jlblNo6OptionAnw_1);
		
		JLabel jlblNo6OptionAnw_3 = new JLabel("");
		jlblNo6OptionAnw_3.setBounds(70, 85, 420, 30);
		jpNo6Exam.add(jlblNo6OptionAnw_3);
		
		JLabel jlblNo6OptionAnw_2 = new JLabel("");
		jlblNo6OptionAnw_2.setBounds(70, 115, 420, 30);
		jpNo6Exam.add(jlblNo6OptionAnw_2);
		
		JLabel jlblNo6OptionAnw_4 = new JLabel("");
		jlblNo6OptionAnw_4.setBounds(70, 145, 420, 30);
		jpNo6Exam.add(jlblNo6OptionAnw_4);
		
		JComboBox jcbNo6Answer = new JComboBox();
		jcbNo6Answer.setModel(new DefaultComboBoxModel(new String[] {" ", "①", "②", "③", "④"}));
		jcbNo6Answer.setBounds(420, 190, 60, 20);
		jpNo6Exam.add(jcbNo6Answer);
		
		JPanel jpNo7Exam = new JPanel();
		jpNo7Exam.setLayout(null);
		jpNo7Exam.setBorder(new TitledBorder(""));
		jpNo7Exam.setBounds(10, 1390, 520, 220);
		jpExam.add(jpNo7Exam);
		
		JLabel jlblNo7Title = new JLabel("문제 7");
		jlblNo7Title.setHorizontalAlignment(SwingConstants.CENTER);
		jlblNo7Title.setBounds(10, 15, 50, 20);
		jpNo7Exam.add(jlblNo7Title);
		
		JLabel jlblNo7Sub = new JLabel("<html></html>");
		jlblNo7Sub.setBounds(70, 10, 430, 30);
		jpNo7Exam.add(jlblNo7Sub);
		
		JLabel jlblNo7Option_1 = new JLabel("①");
		jlblNo7Option_1.setHorizontalAlignment(SwingConstants.CENTER);
		jlblNo7Option_1.setBounds(40, 60, 20, 20);
		jpNo7Exam.add(jlblNo7Option_1);
		
		JLabel jlblNo7Option_2 = new JLabel("②");
		jlblNo7Option_2.setHorizontalAlignment(SwingConstants.CENTER);
		jlblNo7Option_2.setBounds(40, 90, 20, 20);
		jpNo7Exam.add(jlblNo7Option_2);
		
		JLabel jlblNo7Option_3 = new JLabel("③");
		jlblNo7Option_3.setHorizontalAlignment(SwingConstants.CENTER);
		jlblNo7Option_3.setBounds(40, 120, 20, 20);
		jpNo7Exam.add(jlblNo7Option_3);
		
		JLabel jlblNo7Option_4 = new JLabel("④");
		jlblNo7Option_4.setHorizontalAlignment(SwingConstants.CENTER);
		jlblNo7Option_4.setBounds(40, 150, 20, 20);
		jpNo7Exam.add(jlblNo7Option_4);
		
		JLabel jlblNo7Answer = new JLabel("정답 : ");
		jlblNo7Answer.setBounds(370, 190, 40, 20);
		jpNo7Exam.add(jlblNo7Answer);
		
		JLabel jlblNo7OptionAnw_1 = new JLabel("");
		jlblNo7OptionAnw_1.setBounds(70, 55, 420, 30);
		jpNo7Exam.add(jlblNo7OptionAnw_1);
		
		JLabel jlblNo7OptionAnw_3 = new JLabel("");
		jlblNo7OptionAnw_3.setBounds(70, 85, 420, 30);
		jpNo7Exam.add(jlblNo7OptionAnw_3);
		
		JLabel jlblNo7OptionAnw_2 = new JLabel("");
		jlblNo7OptionAnw_2.setBounds(70, 115, 420, 30);
		jpNo7Exam.add(jlblNo7OptionAnw_2);
		
		JLabel jlblNo7OptionAnw_4 = new JLabel("");
		jlblNo7OptionAnw_4.setBounds(70, 145, 420, 30);
		jpNo7Exam.add(jlblNo7OptionAnw_4);
		
		JComboBox jcbNo7Answer = new JComboBox();
		jcbNo7Answer.setModel(new DefaultComboBoxModel(new String[] {" ", "①", "②", "③", "④"}));
		jcbNo7Answer.setBounds(420, 190, 60, 20);
		jpNo7Exam.add(jcbNo7Answer);
		
		JPanel jpNo8Exam = new JPanel();
		jpNo8Exam.setLayout(null);
		jpNo8Exam.setBorder(new TitledBorder(""));
		jpNo8Exam.setBounds(10, 1620, 520, 220);
		jpExam.add(jpNo8Exam);
		
		JLabel jlblNo8Title = new JLabel("문제 8");
		jlblNo8Title.setHorizontalAlignment(SwingConstants.CENTER);
		jlblNo8Title.setBounds(10, 15, 50, 20);
		jpNo8Exam.add(jlblNo8Title);
		
		JLabel jlblNo8Sub = new JLabel("<html></html>");
		jlblNo8Sub.setBounds(70, 10, 430, 30);
		jpNo8Exam.add(jlblNo8Sub);
		
		JLabel jlblNo8Option_1 = new JLabel("①");
		jlblNo8Option_1.setHorizontalAlignment(SwingConstants.CENTER);
		jlblNo8Option_1.setBounds(40, 60, 20, 20);
		jpNo8Exam.add(jlblNo8Option_1);
		
		JLabel jlblNo8Option_2 = new JLabel("②");
		jlblNo8Option_2.setHorizontalAlignment(SwingConstants.CENTER);
		jlblNo8Option_2.setBounds(40, 90, 20, 20);
		jpNo8Exam.add(jlblNo8Option_2);
		
		JLabel jlblNo8Option_3 = new JLabel("③");
		jlblNo8Option_3.setHorizontalAlignment(SwingConstants.CENTER);
		jlblNo8Option_3.setBounds(40, 120, 20, 20);
		jpNo8Exam.add(jlblNo8Option_3);
		
		JLabel jlblNo8Option_4 = new JLabel("④");
		jlblNo8Option_4.setHorizontalAlignment(SwingConstants.CENTER);
		jlblNo8Option_4.setBounds(40, 150, 20, 20);
		jpNo8Exam.add(jlblNo8Option_4);
		
		JLabel jlblNo8Answer = new JLabel("정답 : ");
		jlblNo8Answer.setBounds(370, 190, 40, 20);
		jpNo8Exam.add(jlblNo8Answer);
		
		JLabel jlblNo8OptionAnw_1 = new JLabel("");
		jlblNo8OptionAnw_1.setBounds(70, 55, 420, 30);
		jpNo8Exam.add(jlblNo8OptionAnw_1);
		
		JLabel jlblNo8OptionAnw_3 = new JLabel("");
		jlblNo8OptionAnw_3.setBounds(70, 85, 420, 30);
		jpNo8Exam.add(jlblNo8OptionAnw_3);
		
		JLabel jlblNo8OptionAnw_2 = new JLabel("");
		jlblNo8OptionAnw_2.setBounds(70, 115, 420, 30);
		jpNo8Exam.add(jlblNo8OptionAnw_2);
		
		JLabel jlblNo8OptionAnw_4 = new JLabel("");
		jlblNo8OptionAnw_4.setBounds(70, 145, 420, 30);
		jpNo8Exam.add(jlblNo8OptionAnw_4);
		
		JComboBox jcbNo8Answer = new JComboBox();
		jcbNo8Answer.setModel(new DefaultComboBoxModel(new String[] {" ", "①", "②", "③", "④"}));
		jcbNo8Answer.setBounds(420, 190, 60, 20);
		jpNo8Exam.add(jcbNo8Answer);
		
		JPanel jpNo9Exam = new JPanel();
		jpNo9Exam.setLayout(null);
		jpNo9Exam.setBorder(new TitledBorder(""));
		jpNo9Exam.setBounds(10, 1850, 520, 220);
		jpExam.add(jpNo9Exam);
		
		JLabel jlblNo9Title = new JLabel("문제 9");
		jlblNo9Title.setHorizontalAlignment(SwingConstants.CENTER);
		jlblNo9Title.setBounds(10, 15, 50, 20);
		jpNo9Exam.add(jlblNo9Title);
		
		JLabel jlblNo9Sub = new JLabel("<html></html>");
		jlblNo9Sub.setBounds(70, 10, 430, 30);
		jpNo9Exam.add(jlblNo9Sub);
		
		JLabel jlblNo9Option_1 = new JLabel("①");
		jlblNo9Option_1.setHorizontalAlignment(SwingConstants.CENTER);
		jlblNo9Option_1.setBounds(40, 60, 20, 20);
		jpNo9Exam.add(jlblNo9Option_1);
		
		JLabel jlblNo9Option_2 = new JLabel("②");
		jlblNo9Option_2.setHorizontalAlignment(SwingConstants.CENTER);
		jlblNo9Option_2.setBounds(40, 90, 20, 20);
		jpNo9Exam.add(jlblNo9Option_2);
		
		JLabel jlblNo9Option_3 = new JLabel("③");
		jlblNo9Option_3.setHorizontalAlignment(SwingConstants.CENTER);
		jlblNo9Option_3.setBounds(40, 120, 20, 20);
		jpNo9Exam.add(jlblNo9Option_3);
		
		JLabel jlblNo9Option_4 = new JLabel("④");
		jlblNo9Option_4.setHorizontalAlignment(SwingConstants.CENTER);
		jlblNo9Option_4.setBounds(40, 150, 20, 20);
		jpNo9Exam.add(jlblNo9Option_4);
		
		JLabel jlblNo9Answer = new JLabel("정답 : ");
		jlblNo9Answer.setBounds(370, 190, 40, 20);
		jpNo9Exam.add(jlblNo9Answer);
		
		JLabel jlblNo9OptionAnw_1 = new JLabel("");
		jlblNo9OptionAnw_1.setBounds(70, 55, 420, 30);
		jpNo9Exam.add(jlblNo9OptionAnw_1);
		
		JLabel jlblNo9OptionAnw_3 = new JLabel("");
		jlblNo9OptionAnw_3.setBounds(70, 85, 420, 30);
		jpNo9Exam.add(jlblNo9OptionAnw_3);
		
		JLabel jlblNo9OptionAnw_2 = new JLabel("");
		jlblNo9OptionAnw_2.setBounds(70, 115, 420, 30);
		jpNo9Exam.add(jlblNo9OptionAnw_2);
		
		JLabel jlblNo9OptionAnw_4 = new JLabel("");
		jlblNo9OptionAnw_4.setBounds(70, 145, 420, 30);
		jpNo9Exam.add(jlblNo9OptionAnw_4);
		
		JComboBox jcbNo9Answer = new JComboBox();
		jcbNo9Answer.setModel(new DefaultComboBoxModel(new String[] {" ", "①", "②", "③", "④"}));
		jcbNo9Answer.setBounds(420, 190, 60, 20);
		jpNo9Exam.add(jcbNo9Answer);
		
		JPanel jpNo10Exam = new JPanel();
		jpNo10Exam.setLayout(null);
		jpNo10Exam.setBorder(new TitledBorder(""));
		jpNo10Exam.setBounds(10, 2080, 520, 220);
		jpExam.add(jpNo10Exam);
		
		JLabel jlblNo10Title = new JLabel("문제 10");
		jlblNo10Title.setHorizontalAlignment(SwingConstants.CENTER);
		jlblNo10Title.setBounds(10, 15, 50, 20);
		jpNo10Exam.add(jlblNo10Title);
		
		JLabel jlblNo10Sub = new JLabel("<html></html>");
		jlblNo10Sub.setBounds(70, 10, 430, 30);
		jpNo10Exam.add(jlblNo10Sub);
		
		JLabel jlblNo10Option_1 = new JLabel("①");
		jlblNo10Option_1.setHorizontalAlignment(SwingConstants.CENTER);
		jlblNo10Option_1.setBounds(40, 60, 20, 20);
		jpNo10Exam.add(jlblNo10Option_1);
		
		JLabel jlblNo10Option_2 = new JLabel("②");
		jlblNo10Option_2.setHorizontalAlignment(SwingConstants.CENTER);
		jlblNo10Option_2.setBounds(40, 90, 20, 20);
		jpNo10Exam.add(jlblNo10Option_2);
		
		JLabel jlblNo10Option_3 = new JLabel("③");
		jlblNo10Option_3.setHorizontalAlignment(SwingConstants.CENTER);
		jlblNo10Option_3.setBounds(40, 120, 20, 20);
		jpNo10Exam.add(jlblNo10Option_3);
		
		JLabel jlblNo10Option_4 = new JLabel("④");
		jlblNo10Option_4.setHorizontalAlignment(SwingConstants.CENTER);
		jlblNo10Option_4.setBounds(40, 150, 20, 20);
		jpNo10Exam.add(jlblNo10Option_4);
		
		JLabel jlblNo10Answer = new JLabel("정답 : ");
		jlblNo10Answer.setBounds(370, 190, 40, 20);
		jpNo10Exam.add(jlblNo10Answer);
		
		JLabel jlblNo10OptionAnw_1 = new JLabel("");
		jlblNo10OptionAnw_1.setBounds(70, 55, 420, 30);
		jpNo10Exam.add(jlblNo10OptionAnw_1);
		
		JLabel jlblNo10OptionAnw_3 = new JLabel("");
		jlblNo10OptionAnw_3.setBounds(70, 85, 420, 30);
		jpNo10Exam.add(jlblNo10OptionAnw_3);
		
		JLabel jlblNo10OptionAnw_2 = new JLabel("");
		jlblNo10OptionAnw_2.setBounds(70, 115, 420, 30);
		jpNo10Exam.add(jlblNo10OptionAnw_2);
		
		JLabel jlblNo10OptionAnw_4 = new JLabel("");
		jlblNo10OptionAnw_4.setBounds(70, 145, 420, 30);
		jpNo10Exam.add(jlblNo10OptionAnw_4);
		
		JComboBox jcbNo10Answer = new JComboBox();
		jcbNo10Answer.setModel(new DefaultComboBoxModel(new String[] {" ", "①", "②", "③", "④"}));
		jcbNo10Answer.setBounds(420, 190, 60, 20);
		jpNo10Exam.add(jcbNo10Answer);
		
		JButton jbtnSend = new JButton("제출");
		jbtnSend.setBounds(160, 475, 100, 35);
		getContentPane().add(jbtnSend);
		
		JButton jbtnExit = new JButton("종료");
		jbtnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		jbtnExit.setBounds(300, 475, 100, 35);
		getContentPane().add(jbtnExit);
		
		setBounds(100, 100, 600, 567);
		setLocationRelativeTo(e);
		setVisible(true);
		
	}
}
