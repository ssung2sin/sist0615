package day0705;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class SwingRadioCheck_01 extends JFrame implements ActionListener{
	
	Container cp;
	JRadioButton [] rb=new JRadioButton[4]; //하나만 선택하고 싶을때
	JCheckBox [] cb=new JCheckBox[4];
	JLabel lblMessage; //라디오버튼이나 체크박스 결과값 출력할 곳
	JPanel pTop,pBottom; //라디오버튼,체크박스 올릴 패널
	Color [] colors= {Color.red,Color.pink,Color.blue,Color.green};
	
	public SwingRadioCheck_01(String title) {
		super(title);
		cp=this.getContentPane();
		this.setBounds(400, 400, 500, 500);
		cp.setBackground(new Color(255,255,255));
		setDesign();
		setVisible(true);
	}
	
	public void setDesign() {
		//상단패널에 보더로감싼 4개의 radio버튼 만들기
		String [] str1= {"빨강","분홍","파랑","초록"};
		pTop = new JPanel();
		pTop.setBorder(new TitledBorder("글자색"));
		this.add("North", pTop);
		
		//라디오버튼 하나만 선택되도록 그룹을 지어줌
		ButtonGroup bg=new ButtonGroup();
		
		for(int i=0;i<rb.length;i++) {
			rb[i]=new JRadioButton(str1[i],i==2?true:false); //라디오버튼 생성 초기에 무조건 1개선택할때 null값 넣어지지 않게 하기위해
			rb[i].addActionListener(this); //라디오 버튼에 액션 추가
			pTop.add(rb[i]); //4개의 버튼은 탑 패널에 추가
			bg.add(rb[i]); //버튼 그룹에 추가
		}
		ImageIcon icon = new ImageIcon("C:\\Sist0615\\swingimage\\icon02.png");
		
		lblMessage=new JLabel("Have a Nice Day!!!",icon,JLabel.CENTER);
		lblMessage.setHorizontalTextPosition(JLabel.LEFT);
		lblMessage.setBorder(new LineBorder(Color.magenta,2)); //라인굵기
		this.add(lblMessage);
		
		//하단패널에 보더로 감싼 4개의 checkbox버튼 만들기
		pBottom = new JPanel();
		pBottom.setBorder(new TitledBorder("지역"));
		this.add("South",pBottom);
		
		String [] str2= {"서울","부산","전주","충주"};
		
		for(int i=0;i<cb.length;i++) {
			cb[i]=new JCheckBox(str2[i]);
			cb[i].addActionListener(this);
			pBottom.add(cb[i]);
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object ob=e.getSource();
		String city ="내가 여행 가본 나라는 ";
		
		//라디오 버튼 호출처리,메세지를 컬러별로 출력
		for(int i=0;i<rb.length;i++) {
			if(ob==rb[i]) {
				lblMessage.setForeground(colors[i]);
				lblMessage.setFont(new Font("", Font.BOLD, 20));
			}
		}
		for(int i=0;i<cb.length;i++) {
				if(cb[i].isSelected()) {
					city+=cb[i].getText()+" ";
			}
		}
		if(ob instanceof JCheckBox) {
			lblMessage.setText(city);
		}
		else if(ob instanceof JRadioButton) {
			lblMessage.setText("Have a Nice Day!!!");
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SwingRadioCheck_01("라디오버튼 실숩");

	}


}
