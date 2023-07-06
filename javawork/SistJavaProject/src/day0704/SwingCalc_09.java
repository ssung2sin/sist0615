package day0704;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SwingCalc_09 extends JFrame{
	
	Container cp;
	JLabel lblResult,lbl1,lbl2; //결과 나오는곳,숫자1제목,숫자2제목
	JTextField tfSu1,tfSu2; //입력하는곳
	JButton btnadd; //이벤트발생버튼
	
	public SwingCalc_09(String title) {
		super(title);
		cp=this.getContentPane();
		this.setBounds(200, 200, 300, 400);
		cp.setBackground(new Color(255,255,200));
		setDesign();
		setVisible(true);
	}
	
	public void setDesign() {
		this.setLayout(null);
		
		lbl1=new JLabel("숫자1");
		lbl2=new JLabel("숫자2");
		
		lbl1.setBounds(20, 20, 50, 30);
		this.add(lbl1);
		lbl2.setBounds(20, 60, 50, 30);
		this.add(lbl2);
		
		tfSu1=new JTextField();
		tfSu1.setBounds(70, 20, 60, 30);
		this.add(tfSu1);
		
		tfSu2=new JTextField();
		tfSu2.setBounds(70, 60, 60, 30);
		this.add(tfSu2);
		
		btnadd=new JButton("숫자더하기");
		btnadd.setBounds(30, 110, 120, 30);
		this.add(btnadd);
		
		lblResult=new JLabel("결과 나오는곳");
		lblResult.setBounds(20, 150, 250, 60);
		this.add(lblResult);
		
		//버튼 이벤트인데 익명내부 클래스 형식으로 만들기
		btnadd.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//String a1=tfSu1.toString();
				//String a2=tfSu2.toString();
				String b1=tfSu1.getText();
				String b2=tfSu2.getText();
				
				int sum;
				sum=Integer.parseInt(b1)+Integer.parseInt(b2);
				lblResult.setText(sum+"");
			}
		});
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SwingCalc_09("간단계산 연습");

	}

}
