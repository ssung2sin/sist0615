package jdbc_sawon;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SawonCRUD {
	
	DBConnect db=new DBConnect();
	Scanner sc=new Scanner(System.in); //전역변수 선언해도 메인에서 사용불가능

	public void addSawon() {
	
		System.out.println("***사원 추가하기***");
		
		System.out.println("사원명?");
		String name = sc.nextLine();
		System.out.println("부서명?");
		String buseo = sc.nextLine();
		System.out.println("성별(여자or남자)?");
		String gender = sc.nextLine();
		System.out.println("급여?");
		int pay = Integer.parseInt(sc.nextLine());

		String sql="insert into sawon values(seq_sawon.nextval,'"+name+"','"+gender+"','"+buseo+"',"+pay+")";
		
		System.out.println(sql);
		
		//오라클에 연결
		Connection conn=db.getConnection(); //null로 안한 이유가 이미 dbconnect 클래스에서 try catch처리함
		Statement stmt=null;
		
		try {
			stmt=conn.createStatement();
			stmt.execute(sql); //db에 전달 후 sql문 실행
			
			System.out.println("DB에 추가함");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(stmt, conn);
		}
	}
	
	public void writeSawon() {
		
		String sql="select num,name,gender,buseo,to_char(pay,'L99,999,999') pay  from sawon";
		
		System.out.println("\t\t[전체사원명단]");
		System.out.println();
		
		System.out.println("시퀀스\t사원명\t성별\t부서명\t     월급여");
		System.out.println("---------------------------------------------------");
		
		//db연결
		Connection conn = db.getConnection();
		Statement stmt=null;
		ResultSet rs=null;
		
		try {
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			
			while(rs.next()) {
				System.out.println(rs.getInt("num")+"\t"
						+rs.getString("name")+"\t"
						+rs.getString("gender")+"\t"
						+rs.getString("buseo")
						+rs.getString("pay")); //to_char로 변형
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(rs, stmt, conn);
		}
		
	}
	
	public void deleteSawon() {
		System.out.println("삭제할 사원명?");
		String name=sc.nextLine();
		
		String sql="delete from sawon where name ='"+name+"'";
		
		Connection conn=db.getConnection();
		Statement stmt=null;
		
		try {
			stmt=conn.createStatement();
			int a=stmt.executeUpdate(sql);
			if(a==0) {
				System.out.println("일치하는 이름이 없습니다.");
			}
			else {
				System.out.println("삭제되었습니다.");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(stmt, conn);
		}
	}
	
	public void updateSawon() {
		System.out.println("***사원 정보 수정***");
		System.out.println("바꿀 시퀀스?");
		int seq=Integer.parseInt(sc.nextLine());
		System.out.println("바꿀 부서명(홍보부,교육부,인사부)?");
		String buseo=sc.nextLine();
		System.out.println("급여?");
		int pay=Integer.parseInt(sc.nextLine());
		
		String sql="update sawon set buseo='"+buseo+"',pay="+pay+" where num="+seq;
		
		Connection conn=db.getConnection();
		Statement stmt=null;
		
		try {
			stmt=conn.createStatement();
			stmt.execute(sql);
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(stmt, conn);
		}
	}
	
	public void searchName() {
		System.out.println("검색할 사원명(일부검색가능)");
		String name=sc.nextLine();
		
		String sql="select num,name,gender,buseo,to_char(pay,'L99,999,999') pay from sawon"
				+ " where name like '%"+name+"%'";
		
		System.out.println("\t\t[겸색사원명단]");
		System.out.println();
		
		System.out.println("시퀀스\t사원명\t성별\t부서명\t     월급여");
		System.out.println("---------------------------------------------------");
		
		Connection conn = db.getConnection();
		Statement stmt=null;
		ResultSet rs=null;
		
		try {
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			
			while(rs.next()) {
				System.out.println(rs.getInt("num")+"\t"
						+rs.getString("name")+"\t"
						+rs.getString("gender")+"\t"
						+rs.getString("buseo")
						+rs.getString("pay")); //to_char로 변형
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(rs, stmt, conn);
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SawonCRUD sawon=new SawonCRUD();
		Scanner sc=new Scanner(System.in);
		
		int n;
		
		while(true) {
			System.out.println("Oracle DB_Sawon 문제");
			System.out.println("1.insert 2.select 3.update 4.delete 5.search 9.quit");
			
			n=Integer.parseInt(sc.nextLine());
			
			if(n==1) {
				sawon.addSawon();
			}
			else if(n==2) {
				sawon.writeSawon();
			}
			else if(n==4) {
				sawon.deleteSawon();
			}
			else if(n==5) {
				sawon.searchName();
			}
			else if(n==9) {
				System.out.println("Quit DB Sawon");
				break;
			}
		}
	}

}