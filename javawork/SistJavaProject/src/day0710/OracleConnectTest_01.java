package day0710;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OracleConnectTest_01 {
	
	static final String URL="jdbc:oracle:thin:@localhost:1521:XE";
	
	public void connectSawon() {
		
		Connection conn=null; //자바와 오라클 연결
		Statement stmt=null; //crud 전제 sql 전달
		ResultSet rs=null; //출력문을 읽어옴 리스트가 없을때 까지 (select할때)
		
		String sql="Select * from sawon order by name";
		
		try {
			conn=DriverManager.getConnection(URL, "ssung2sin", "a1234");
			System.out.println("클라우드 오라클 서버 연결 성공!!");
			
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			while(rs.next()) { //true값 반환 =>boolean 이라
				//DB로 부터 데이터 가져오기
				int num=rs.getInt("num");//컬럼명
				String name=rs.getString("name");
				String gender=rs.getString("gender");
				String buseo=rs.getString("buseo");
				int pay = rs.getInt("pay");
				
				System.out.println(num+"\t"+name+"\t"+gender+"\t"+buseo+"\t"+pay);
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("오라클 서버 연결 실패"+e.getMessage());
		}
		finally{
			try {
				if(rs!=null) rs.close();
				if(stmt!=null) stmt.close();
				if(conn!=null) conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
		
	public void connectBamin() {
			
		//주문번호 주문자 음식명 가격 상호명 가게위치 주문자주소
		Connection cn=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		String sql="select f.fno,name,m_name,price,"
				+ "shopname,loc,addr  "
				+ "from food f, jumin j "
				+ "where f.fno=j.fno order by 2";

		
		try {
			cn=DriverManager.getConnection(URL, "ssung2sin", "a1234");
			System.out.println("클라우드 오라클 서버 연결 성공!!");
			
			stmt=cn.createStatement();
			rs=stmt.executeQuery(sql);
			System.out.println("주문번호\t주문자명\t음식명\t가격\t상호명\t가게위치\t주문자위치\t");
			while(rs.next()) {
				int fno=rs.getInt("fno");
				String name=rs.getString("name");
				String m_name=rs.getString("m_name");
				String price=rs.getString("price");
				String sN=rs.getString("shopname");
				String loc=rs.getString("loc");
				String addr=rs.getString("addr");
				
				System.out.println(fno+"\t"+name+"\t"+m_name+"\t"+price+"\t"+sN+"\t"
				+loc+"\t"+addr);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("오라클 서버 연결 실패"+e.getMessage());
		}
		finally {
			try {
				rs.close();
				stmt.close();
				cn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void connectSawonGroup() {
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		String sql="select gender, count(*) cnt,to_char(avg(pay),'L999,999,999') avgpay from sawon group by gender";
		
		try {
			conn=DriverManager.getConnection(URL, "ssung2sin", "a1234");
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			
			System.out.println("**성별 인원 및 평균 급여**");
			System.out.println("성별\t인원수\t평균급여");
			System.out.println("---------------------------------------------");
			while(rs.next()) {
				String gd=rs.getString("gender");
				int cnt=rs.getInt("cnt");
				String pay=rs.getString("avgpay");
				
				System.out.println(gd+"\t"+cnt+"\t"+pay);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
		OracleConnectTest_01 oc1 = new OracleConnectTest_01();
		//oc1.connectSawon();
		//oc1.connectBamin();
		oc1.connectSawonGroup();
		

	}

}
