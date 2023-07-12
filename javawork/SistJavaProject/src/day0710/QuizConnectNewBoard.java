package day0710;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class QuizConnectNewBoard {
	
	static final String URL="jdbc:oracle:thin:@localhost:1521:XE";
	
	public void connectBoard() {
		Connection conn = null;
		Statement stmt=null;
		ResultSet rs=null;
		
		String sql ="select b_num,nick,subject,content,wday from snsboard";
		
		try {
			conn=DriverManager.getConnection(URL, "ssung2sin", "a1234");
			System.out.println("오라클연결확인!!");
			
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			
			while(rs.next()) {
				int num=rs.getInt("b_num");
				String nick=rs.getString("nick");
				String sj=rs.getString("subject");
				String ct=rs.getString("content");
				String wd=rs.getString("wday");
			
				System.out.println(num+"\t"+nick+"\t"+sj+"\t"+ct+"\t"+wd);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("오라클연결실패"+e.getMessage());
		}finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuizConnectNewBoard qc=new QuizConnectNewBoard();
		qc.connectBoard();

	}

}
