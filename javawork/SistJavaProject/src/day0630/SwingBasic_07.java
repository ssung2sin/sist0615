package day0630;

import java.awt.Color;

import javax.swing.JFrame;

public class SwingBasic_07 extends JFrame{
	
	public SwingBasic_07(String title) {
		super(title);
		
		//시작위치,너비,높이
		this.setBounds(500, 100, 500, 500);
		//종료
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//배경색
		//this.setBackground(Color.magenta);
		//this.setBackground(new Color(190,240,150)); //this로는 안됨. 컨테이너가 하나 가로막고 있다고 생각
		this.getContentPane().setBackground(Color.white);//이렇게 getContentPane().선언 해줘야함
		
		//프레임 보이게
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method
		new SwingBasic_07("스윙기본");

	}

}
