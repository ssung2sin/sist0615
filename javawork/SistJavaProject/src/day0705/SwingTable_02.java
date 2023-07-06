package day0705;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class SwingTable_02 extends JFrame{

	Container cp;
	JTable table;
	JLabel lblTitle;
	JLabel lblOut;//출력
	
	public SwingTable_02(String title) {
		super(title);
		cp=this.getContentPane();
		this.setBounds(400, 400, 500, 500);
		cp.setBackground(new Color(255,255,255));
		setDesign();
		setVisible(true);
	}
	
	public void setDesign() {
		String[][] data= {{"김영준","서울","010-222-4444"},
				{"최성현","경기","010-111-2222"},
				{"장미란","인천","010444-8888"},
				{"박세리","제주","010-7777-9999"}
				};
		String[] title= {"이름","주소","연락처"};
		
		lblTitle=new JLabel("JTable 연습",JLabel.CENTER);
		lblOut=new JLabel("결과출력...",JLabel.CENTER);
		
		table=new JTable(data, title);
		JScrollPane pane=new JScrollPane(table);
		
		table.addMouseListener(new TableEvent());
		
		this.add("North",lblTitle);
		this.add("Center",pane);
		this.add("South",lblOut);
			
	}
	 
	//테이블클릭시 발생하는 마우스 이벤트
	class TableEvent extends MouseAdapter{
		
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			super.mouseClicked(e);
			
			//System.out.println("테이블 클릭!!");
			//선택한  행번호 얻기
			int rowNum=table.getSelectedRow();
			
			String str="이름: "+table.getValueAt(rowNum, 0)
						+", 주소: "+table.getValueAt(rowNum, 1)
						+", 연락처: "+table.getValueAt(rowNum, 2);
			
			lblOut.setText(str);
			
		}
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SwingTable_02("테이블연습");

	}

}
