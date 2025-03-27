package ui_student;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Example_Test extends JDialog {

    private JLabel jlblNo1TitleSet;
    private JLabel jlblNo1OptionAnw_1;
    private JLabel jlblNo1OptionAnw_3;
    private JLabel jlblNo1OptionAnw_2;
    private JLabel jlblNo1OptionAnw_4;
    private JLabel jlblNo2TitleSet;
    private JLabel jlblNo2OptionAnw_1;
    private JLabel jlblNo2OptionAnw_3;
    private JLabel jlblNo2OptionAnw_2;
    private JLabel jlblNo2OptionAnw_4;
    private JLabel jlblNo3TitleSet;
    private JLabel jlblNo3OptionAnw_1;
    private JLabel jlblNo3OptionAnw_3;
    private JLabel jlblNo3OptionAnw_2;
    private JLabel jlblNo3OptionAnw_4;
    private JLabel jlblNo4TitleSet;
    private JLabel jlblNo4OptionAnw_1;
    private JLabel jlblNo4OptionAnw_3;
    private JLabel jlblNo4OptionAnw_2;
    private JLabel jlblNo4OptionAnw_4;
    private JLabel jlblNo5TitleSet;
    private JLabel jlblNo5OptionAnw_1;
    private JLabel jlblNo5OptionAnw_3;
    private JLabel jlblNo5OptionAnw_2;
    private JLabel jlblNo5OptionAnw_4;
    private JLabel jlblNo6TitleSet;
    private JLabel jlblNo6OptionAnw_1;
    private JLabel jlblNo6OptionAnw_3;
    private JLabel jlblNo6OptionAnw_2;
    private JLabel jlblNo6OptionAnw_4;
    private JLabel jlblNo7TitleSet;
    private JLabel jlblNo7OptionAnw_1;
    private JLabel jlblNo7OptionAnw_3;
    private JLabel jlblNo7OptionAnw_2;
    private JLabel jlblNo7OptionAnw_4;
    private JLabel jlblNo8TitleSet;
    private JLabel jlblNo8OptionAnw_1;
    private JLabel jlblNo8OptionAnw_3;
    private JLabel jlblNo8OptionAnw_2;
    private JLabel jlblNo8OptionAnw_4;
    private JLabel jlblNo9TitleSet;
    private JLabel jlblNo9OptionAnw_1;
    private JLabel jlblNo9OptionAnw_3;
    private JLabel jlblNo9OptionAnw_2;
    private JLabel jlblNo9OptionAnw_4;
    private JLabel jlblNo10TitleSet;
    private JLabel jlblNo10OptionAnw_1;
    private JLabel jlblNo10OptionAnw_3;
    private JLabel jlblNo10OptionAnw_2;
    private JLabel jlblNo10OptionAnw_4;

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
		
		jlblNo1TitleSet = new JLabel("<html>JAVA 변수타입 중 정수형이 아닌 것은?</html>");
		jlblNo1TitleSet.setBounds(70, 10, 430, 30);
		jpNo1Exam.add(jlblNo1TitleSet);
		
		
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
		
		jlblNo1OptionAnw_1 = new JLabel("int");
		jlblNo1OptionAnw_1.setBounds(70, 55, 420, 30);
		jpNo1Exam.add(jlblNo1OptionAnw_1);
		
		jlblNo1OptionAnw_3 = new JLabel("long");
		jlblNo1OptionAnw_3.setBounds(70, 85, 420, 30);
		jpNo1Exam.add(jlblNo1OptionAnw_3);
		
		jlblNo1OptionAnw_2 = new JLabel("byte");
		jlblNo1OptionAnw_2.setBounds(70, 115, 420, 30);
		jpNo1Exam.add(jlblNo1OptionAnw_2);
		
		jlblNo1OptionAnw_4 = new JLabel("float");
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
		
		jlblNo2TitleSet = new JLabel("<html>메시지 지향 미들웨어(Message-Oriented Middleware, MOM)에 대한 설명으로 틀린 것은?</html>");
		jlblNo2TitleSet.setBounds(70, 10, 430, 30);
		jpNo2Exam.add(jlblNo2TitleSet);
		
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
		
		jlblNo2OptionAnw_1 = new JLabel("<html>느리고 안정적인 응답보다는 즉각적인 응답이 필요한 온라인 업무에 적합하다.</html>");
		jlblNo2OptionAnw_1.setBounds(70, 55, 420, 30);
		jpNo2Exam.add(jlblNo2OptionAnw_1);
		
		jlblNo2OptionAnw_3 = new JLabel("<html>독립적인 애플리케이션을 하나의 통합된 시스템으로 묶기 위한 역할을 한다.</html>");
		jlblNo2OptionAnw_3.setBounds(70, 85, 420, 30);
		jpNo2Exam.add(jlblNo2OptionAnw_3);
		
		jlblNo2OptionAnw_2 = new JLabel("<html>송신측과 수신측의 연결 시 메시지 큐를 활용하는 방법이 있다.</html>");
		jlblNo2OptionAnw_2.setBounds(70, 115, 420, 30);
		jpNo2Exam.add(jlblNo2OptionAnw_2);
		
		jlblNo2OptionAnw_4 = new JLabel("<html>상이한 애플리케이션 간 통신을 비동기 방식으로 지원한다.</html>");
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
		
		jlblNo3TitleSet = new JLabel("<html></html>");
		jlblNo3TitleSet.setBounds(70, 10, 430, 30);
		jpNo3Exam.add(jlblNo3TitleSet);
		
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
		
		jlblNo3OptionAnw_1 = new JLabel("");
		jlblNo3OptionAnw_1.setBounds(70, 55, 420, 30);
		jpNo3Exam.add(jlblNo3OptionAnw_1);
		
		jlblNo3OptionAnw_3 = new JLabel("");
		jlblNo3OptionAnw_3.setBounds(70, 85, 420, 30);
		jpNo3Exam.add(jlblNo3OptionAnw_3);
		
		jlblNo3OptionAnw_2 = new JLabel("");
		jlblNo3OptionAnw_2.setBounds(70, 115, 420, 30);
		jpNo3Exam.add(jlblNo3OptionAnw_2);
		
		jlblNo3OptionAnw_4 = new JLabel("");
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
		
		jlblNo4TitleSet = new JLabel("<html></html>");
		jlblNo4TitleSet.setBounds(70, 10, 430, 30);
		jpNo4Exam.add(jlblNo4TitleSet);
		
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
		
		jlblNo4OptionAnw_1 = new JLabel("");
		jlblNo4OptionAnw_1.setBounds(70, 55, 420, 30);
		jpNo4Exam.add(jlblNo4OptionAnw_1);
		
		jlblNo4OptionAnw_3 = new JLabel("");
		jlblNo4OptionAnw_3.setBounds(70, 85, 420, 30);
		jpNo4Exam.add(jlblNo4OptionAnw_3);
		
		jlblNo4OptionAnw_2 = new JLabel("");
		jlblNo4OptionAnw_2.setBounds(70, 115, 420, 30);
		jpNo4Exam.add(jlblNo4OptionAnw_2);
		
		jlblNo4OptionAnw_4 = new JLabel("");
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
		
		jlblNo5TitleSet = new JLabel("<html></html>");
		jlblNo5TitleSet.setBounds(70, 10, 430, 30);
		jpNo5Exam.add(jlblNo5TitleSet);
		
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
		
		jlblNo5OptionAnw_1 = new JLabel("");
		jlblNo5OptionAnw_1.setBounds(70, 55, 420, 30);
		jpNo5Exam.add(jlblNo5OptionAnw_1);
		
		jlblNo5OptionAnw_3 = new JLabel("");
		jlblNo5OptionAnw_3.setBounds(70, 85, 420, 30);
		jpNo5Exam.add(jlblNo5OptionAnw_3);
		
		jlblNo5OptionAnw_2 = new JLabel("");
		jlblNo5OptionAnw_2.setBounds(70, 115, 420, 30);
		jpNo5Exam.add(jlblNo5OptionAnw_2);
		
		jlblNo5OptionAnw_4 = new JLabel("");
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
		
		jlblNo6TitleSet = new JLabel("<html></html>");
		jlblNo6TitleSet.setBounds(70, 10, 430, 30);
		jpNo6Exam.add(jlblNo6TitleSet);
		
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
		
		jlblNo6OptionAnw_1 = new JLabel("");
		jlblNo6OptionAnw_1.setBounds(70, 55, 420, 30);
		jpNo6Exam.add(jlblNo6OptionAnw_1);
		
		jlblNo6OptionAnw_3 = new JLabel("");
		jlblNo6OptionAnw_3.setBounds(70, 85, 420, 30);
		jpNo6Exam.add(jlblNo6OptionAnw_3);
		
		jlblNo6OptionAnw_2 = new JLabel("");
		jlblNo6OptionAnw_2.setBounds(70, 115, 420, 30);
		jpNo6Exam.add(jlblNo6OptionAnw_2);
		
		jlblNo6OptionAnw_4 = new JLabel("");
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
		
		jlblNo7TitleSet = new JLabel("<html></html>");
		jlblNo7TitleSet.setBounds(70, 10, 430, 30);
		jpNo7Exam.add(jlblNo7TitleSet);
		
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
		
		jlblNo7OptionAnw_1 = new JLabel("");
		jlblNo7OptionAnw_1.setBounds(70, 55, 420, 30);
		jpNo7Exam.add(jlblNo7OptionAnw_1);
		
		jlblNo7OptionAnw_3 = new JLabel("");
		jlblNo7OptionAnw_3.setBounds(70, 85, 420, 30);
		jpNo7Exam.add(jlblNo7OptionAnw_3);
		
		jlblNo7OptionAnw_2 = new JLabel("");
		jlblNo7OptionAnw_2.setBounds(70, 115, 420, 30);
		jpNo7Exam.add(jlblNo7OptionAnw_2);
		
		jlblNo7OptionAnw_4 = new JLabel("");
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
		
		jlblNo8TitleSet = new JLabel("<html></html>");
		jlblNo8TitleSet.setBounds(70, 10, 430, 30);
		jpNo8Exam.add(jlblNo8TitleSet);
		
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
		
		jlblNo8OptionAnw_1 = new JLabel("");
		jlblNo8OptionAnw_1.setBounds(70, 55, 420, 30);
		jpNo8Exam.add(jlblNo8OptionAnw_1);
		
		jlblNo8OptionAnw_3 = new JLabel("");
		jlblNo8OptionAnw_3.setBounds(70, 85, 420, 30);
		jpNo8Exam.add(jlblNo8OptionAnw_3);
		
		jlblNo8OptionAnw_2 = new JLabel("");
		jlblNo8OptionAnw_2.setBounds(70, 115, 420, 30);
		jpNo8Exam.add(jlblNo8OptionAnw_2);
		
		jlblNo8OptionAnw_4 = new JLabel("");
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
		
		jlblNo9TitleSet = new JLabel("<html></html>");
		jlblNo9TitleSet.setBounds(70, 10, 430, 30);
		jpNo9Exam.add(jlblNo9TitleSet);
		
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
		
		jlblNo9OptionAnw_1 = new JLabel("");
		jlblNo9OptionAnw_1.setBounds(70, 55, 420, 30);
		jpNo9Exam.add(jlblNo9OptionAnw_1);
		
		jlblNo9OptionAnw_3 = new JLabel("");
		jlblNo9OptionAnw_3.setBounds(70, 85, 420, 30);
		jpNo9Exam.add(jlblNo9OptionAnw_3);
		
		jlblNo9OptionAnw_2 = new JLabel("");
		jlblNo9OptionAnw_2.setBounds(70, 115, 420, 30);
		jpNo9Exam.add(jlblNo9OptionAnw_2);
		
		jlblNo9OptionAnw_4 = new JLabel("");
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
		
		jlblNo10TitleSet = new JLabel("<html></html>");
		jlblNo10TitleSet.setBounds(70, 10, 430, 30);
		jpNo10Exam.add(jlblNo10TitleSet);
		
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
		
		jlblNo10OptionAnw_1 = new JLabel("");
		jlblNo10OptionAnw_1.setBounds(70, 55, 420, 30);
		jpNo10Exam.add(jlblNo10OptionAnw_1);
		
		jlblNo10OptionAnw_3 = new JLabel("");
		jlblNo10OptionAnw_3.setBounds(70, 85, 420, 30);
		jpNo10Exam.add(jlblNo10OptionAnw_3);
		
		jlblNo10OptionAnw_2 = new JLabel("");
		jlblNo10OptionAnw_2.setBounds(70, 115, 420, 30);
		jpNo10Exam.add(jlblNo10OptionAnw_2);
		
		jlblNo10OptionAnw_4 = new JLabel("");
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
		
	}// Example_Test

	public JLabel getJlblNo1TitleSet() {
		return jlblNo1TitleSet;
	}// getJlblNo1TitleSet

	public JLabel getJlblNo1OptionAnw_1() {
		return jlblNo1OptionAnw_1;
	}// getJlblNo1OptionAnw_1

	public JLabel getJlblNo1OptionAnw_3() {
		return jlblNo1OptionAnw_3;
	}// getJlblNo1OptionAnw_3

	public JLabel getJlblNo1OptionAnw_2() {
		return jlblNo1OptionAnw_2;
	}// getJlblNo1OptionAnw_2

	public JLabel getJlblNo1OptionAnw_4() {
		return jlblNo1OptionAnw_4;
	}// getJlblNo1OptionAnw_4

	public JLabel getJlblNo2TitleSet() {
		return jlblNo2TitleSet;
	}// getJlblNo2TitleSet

	public JLabel getJlblNo2OptionAnw_1() {
		return jlblNo2OptionAnw_1;
	}// getJlblNo2OptionAnw_1

	public JLabel getJlblNo2OptionAnw_3() {
		return jlblNo2OptionAnw_3;
	}// getJlblNo2OptionAnw_3

	public JLabel getJlblNo2OptionAnw_2() {
		return jlblNo2OptionAnw_2;
	}// getJlblNo2OptionAnw_2

	public JLabel getJlblNo2OptionAnw_4() {
		return jlblNo2OptionAnw_4;
	}

	public JLabel getJlblNo3TitleSet() {
		return jlblNo3TitleSet;
	}

	public JLabel getJlblNo3OptionAnw_1() {
		return jlblNo3OptionAnw_1;
	}

	public JLabel getJlblNo3OptionAnw_3() {
		return jlblNo3OptionAnw_3;
	}

	public JLabel getJlblNo3OptionAnw_2() {
		return jlblNo3OptionAnw_2;
	}

	public JLabel getJlblNo3OptionAnw_4() {
		return jlblNo3OptionAnw_4;
	}

	public JLabel getJlblNo4TitleSet() {
		return jlblNo4TitleSet;
	}

	public JLabel getJlblNo4OptionAnw_1() {
		return jlblNo4OptionAnw_1;
	}

	public JLabel getJlblNo4OptionAnw_3() {
		return jlblNo4OptionAnw_3;
	}

	public JLabel getJlblNo4OptionAnw_2() {
		return jlblNo4OptionAnw_2;
	}

	public JLabel getJlblNo4OptionAnw_4() {
		return jlblNo4OptionAnw_4;
	}

	public JLabel getJlblNo5TitleSet() {
		return jlblNo5TitleSet;
	}

	public JLabel getJlblNo5OptionAnw_1() {
		return jlblNo5OptionAnw_1;
	}

	public JLabel getJlblNo5OptionAnw_3() {
		return jlblNo5OptionAnw_3;
	}

	public JLabel getJlblNo5OptionAnw_2() {
		return jlblNo5OptionAnw_2;
	}

	public JLabel getJlblNo5OptionAnw_4() {
		return jlblNo5OptionAnw_4;
	}

	public JLabel getJlblNo6TitleSet() {
		return jlblNo6TitleSet;
	}

	public JLabel getJlblNo6OptionAnw_1() {
		return jlblNo6OptionAnw_1;
	}

	public JLabel getJlblNo6OptionAnw_3() {
		return jlblNo6OptionAnw_3;
	}

	public JLabel getJlblNo6OptionAnw_2() {
		return jlblNo6OptionAnw_2;
	}

	public JLabel getJlblNo6OptionAnw_4() {
		return jlblNo6OptionAnw_4;
	}

	public JLabel getJlblNo7TitleSet() {
		return jlblNo7TitleSet;
	}

	public JLabel getJlblNo7OptionAnw_1() {
		return jlblNo7OptionAnw_1;
	}

	public JLabel getJlblNo7OptionAnw_3() {
		return jlblNo7OptionAnw_3;
	}

	public JLabel getJlblNo7OptionAnw_2() {
		return jlblNo7OptionAnw_2;
	}

	public JLabel getJlblNo7OptionAnw_4() {
		return jlblNo7OptionAnw_4;
	}

	public JLabel getJlblNo8TitleSet() {
		return jlblNo8TitleSet;
	}

	public JLabel getJlblNo8OptionAnw_1() {
		return jlblNo8OptionAnw_1;
	}

	public JLabel getJlblNo8OptionAnw_3() {
		return jlblNo8OptionAnw_3;
	}

	public JLabel getJlblNo8OptionAnw_2() {
		return jlblNo8OptionAnw_2;
	}

	public JLabel getJlblNo8OptionAnw_4() {
		return jlblNo8OptionAnw_4;
	}

	public JLabel getJlblNo9TitleSet() {
		return jlblNo9TitleSet;
	}

	public JLabel getJlblNo9OptionAnw_1() {
		return jlblNo9OptionAnw_1;
	}

	public JLabel getJlblNo9OptionAnw_3() {
		return jlblNo9OptionAnw_3;
	}

	public JLabel getJlblNo9OptionAnw_2() {
		return jlblNo9OptionAnw_2;
	}

	public JLabel getJlblNo9OptionAnw_4() {
		return jlblNo9OptionAnw_4;
	}

	public JLabel getJlblNo10TitleSet() {
		return jlblNo10TitleSet;
	}

	public JLabel getJlblNo10OptionAnw_1() {
		return jlblNo10OptionAnw_1;
	}

	public JLabel getJlblNo10OptionAnw_3() {
		return jlblNo10OptionAnw_3;
	}

	public JLabel getJlblNo10OptionAnw_2() {
		return jlblNo10OptionAnw_2;
	}

	public JLabel getJlblNo10OptionAnw_4() {
		return jlblNo10OptionAnw_4;
	}
	
	
}
