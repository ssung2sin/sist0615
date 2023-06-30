package day0630;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingLayOut_08 extends JFrame{
	
	Container cp;
	JButton btn1;
	
	public SwingLayOut_08(String title) {
		super(title);
		
		this.setBounds(200, 100, 300, 500);
		cp=this.getContentPane();
		
		cp.setBackground(new Color(255,255,255));
		
		//버튼생성
		btn1=new JButton("Hello It's me.");
		//Frame에 버튼을 추가
		//Frame 기본 레이아웃이 BorderLayout
		//BorderLayout추가시 위치 지정
		//this.add(btn1, BorderLayout.NORTH);
		//this.add(btn1, BorderLayout.SOUTH);
		this.add("North",btn1); //첫글자 대문자로
		
		//생성과 동시에 프레임 추가 위치지정까지
		this.add("South",new JButton("아래쪽"));
		this.add("West",new JButton("왼쪽"));
		this.add("East",new JButton("오른쪽"));
		this.add("Center",new JButton("중앙"));
		
		//버튼1에 속성
		btn1.setBackground(Color.cyan);
		btn1.setForeground(Color.black);
		
		this.setVisible(true);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new SwingLayOut_08("스윙 레이아웃 연습");

	}

}
