package day0705;


import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class SwingTableShop_03 extends JFrame implements ActionListener{
	
	Container cp;
	JTextField tfSang,tfSu,tfDan;
	JButton btnAdd;
	JTable table;
	DefaultTableModel model;
	
	//저장하고 불러올 파일며
	String FILENAME="C:\\Sist0615\\file\\fruit.txt";
	
	
	public SwingTableShop_03(String title) {
		super(title);
		cp=this.getContentPane();
		this.setBounds(400, 400, 400, 500);
		cp.setBackground(new Color(255,255,200));
		
		//디자인
		setDesign();
		
		//테이블읽는데이터
		tableReadData();
		
		//테이블쓰는데이터
		//tableWriteData();
		
		setVisible(true);
	}
	
	//처음 생성시 테이블에 불러올 메서드
	public void tableReadData() {
		FileReader fr=null;
		BufferedReader br=null;
		
		try {
			fr=new FileReader(FILENAME);
			br=new BufferedReader(fr);
			
			while(true) {
				String s=br.readLine();
				
				if(s==null) {
					break;
				}
				
				String [] data=s.split(",");
				
				model.addRow(data);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			
		}
	}
	/*public void tableWriteData() {
		FileWriter fw=null;
		
		try {
			fw=new FileWriter(FILENAME,true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}*/
	
	public void setDesign() {
		this.setLayout(null); //내 맘대로 레이아웃 만들거야!
		
		JLabel lbl1=new JLabel("상품명");
		JLabel lbl2=new JLabel("수량");
		JLabel lbl3=new JLabel("가격");
		lbl1.setBounds(40, 20, 80, 30);
		this.add(lbl1);
		
		lbl2.setBounds(175, 20, 80, 30);
		this.add(lbl2);
		
		lbl3.setBounds(305, 20, 80, 30);
		this.add(lbl3);
		
		tfSang=new JTextField();
		tfSang.setBounds(20, 60, 80, 30);
		this.add(tfSang);
		
		tfSu=new JTextField();
		tfSu.setBounds(150, 60, 80, 30);
		this.add(tfSu);

		tfDan=new JTextField();
		tfDan.setBounds(280, 60, 80, 30);
		this.add(tfDan);
		
		//버튼
		btnAdd=new JButton("추가하기");
		btnAdd.setBounds(140, 120, 100, 30);
		this.add(btnAdd);
		
		//버튼에 이벤트
		btnAdd.addActionListener(this);
		
		String [] title= {"상품명","수량","가격","총금맥"};
		model=new DefaultTableModel(title, 0); //0은 행갯수
		table=new JTable(model);
		JScrollPane js=new JScrollPane(table);
		js.setBounds(20, 160, 350, 160);
		this.add(js);
		
		//테이블 클릭시 선택한 행번호를 selectRow에 저장
		
		table.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mouseClicked(e);
				
				int selecRow=table.getSelectedRow(); // 행번호 저장
			}
		});
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new SwingTableShop_03("상점");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object ob=e.getSource();
		
		if(ob==btnAdd) {
			String sang=tfSang.getText().trim();
			String su=tfSu.getText().trim();
			String dan=tfDan.getText().trim();
			
			if(sang.length()==0||su.length()==0||dan.length()==0) {
				JOptionPane.showMessageDialog(this, "3개의 값을 모두 입력해주세요.");
				return;
			}
			
			int tot = Integer.parseInt(su)+Integer.parseInt(dan);
			
			NumberFormat nf=NumberFormat.getInstance();
			Vector<String> data=new Vector<String>();
			
			data.add(sang);
			data.add(su);
			data.add(dan);
			data.add(nf.format(tot));
			
			//테이블에 추가
			model.addRow(data);
			tfSang.setText("");
			tfSu.setText("");
			tfDan.setText("");
		
		}
	}

}
