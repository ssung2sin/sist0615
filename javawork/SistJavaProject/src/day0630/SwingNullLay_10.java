package day0630;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SwingNullLay_10 extends JFrame implements ActionListener{
	
	Container cp;
	JButton btn1,btn2;
	
	public SwingNullLay_10(String title) {
		super(title);
		cp=this.getContentPane();
		this.setBounds(200, 200, 300, 400);
		cp.setBackground(new Color(255,255,255));
		setDesign1();
		setVisible(true);
		
	}
	
	//디자인
	
	public void setDesign1() {
		//기본 레이아웃 없애기
		this.setLayout(null);
		
		btn1=new JButton("◀");
		btn2=new JButton("▶");
		
		//위치 직접 지정
		btn1.setBounds(50, 100, 80, 30);
		btn2.setBounds(150, 100, 80, 30);
		
		//프레임추가
		this.add(btn1);
		this.add(btn2);
		
		//색상
		btn1.setBackground(Color.blue);
		btn2.setBackground(Color.pink);
		
		//액션
		//btn1.addActionListener(this);
		btn1.addActionListener(this); //내가 쓰는거니까 this
		btn2.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object ob1 = e.getSource();
		
		if(ob1==btn1) {
			JOptionPane.showMessageDialog(this, "왼쪽 버튼");
		}
		else if(ob1==btn2) {
			JOptionPane.showMessageDialog(this, "오른쪽 버튼");
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new SwingNullLay_10("레이아웃 없이 만들기");

	}

}

