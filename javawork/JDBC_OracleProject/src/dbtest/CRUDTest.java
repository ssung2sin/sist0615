package dbtest;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CRUDTest {
	
	DBConnect db=new DBConnect();
	
	//insert
	public void insert() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("이름입력");
		String name=sc.nextLine();
		System.out.println("주소입력");
		String addr=sc.nextLine();
		
		String sql="insert into myinfo values "
				+ "(seq1.nextval,'"+name+"','"+addr+"'"
				+ ",sysdate)";
		
		//1.db연결
		Connection conn=db.getConnection();
		//2.statement
		Statement stmt=null;
		try {
			stmt=conn.createStatement();
			stmt.execute(sql);
			
			System.out.println("***정보가 추가되었습니다***");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("insert error: "+e.getMessage());
		}finally {
			db.dbClose(stmt, conn);
		}
		
	}
	
	public void select() {
		Connection conn=db.getConnection();
		Statement stmt=null;
		ResultSet rs=null;
		System.out.println("번호\t|이름\t|\t주소\t|\t입력시간");
		System.out.println("--------------------------------------------");
		String sql="select num,name,addr,sdate from myinfo order by 1 asc";
	
		
		try {
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			while(rs.next()) {
				int num=rs.getInt("num");
				String name=rs.getString("name");
				String addr=rs.getString("addr");
				String sd=rs.getString("sdate");
				
				System.out.println(num+"\t|"+name+"\t|"+addr+"\t|"+sd);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			db.dbClose(rs, stmt, conn);
		}
	}
	
	//delete
	public void delete() {
		int n;
		
		Scanner sc=new Scanner(System.in);
		System.out.print("삭제할 번호를 입력하세요 : ");
		n=Integer.parseInt(sc.nextLine()); //여기서 n은 String이든 int든 상관없음
		
		String sql="delete from myinfo where num ="+n;
		Connection conn=db.getConnection();
		Statement stmt=null; //닫아줄때 try catch에 갇히기 때문에 불러올 수가 없다!!
		try {
			stmt=conn.createStatement();
			int a=stmt.executeUpdate(sql);
			
			if(a==0) { //없는 번호 입력시 실제 삭제가 되지 않으므로 0 반환!
				System.out.println("없는 데이터 번호입니다.");
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
	
	//update
	public void update() {
		Scanner sc=new Scanner(System.in);
		String num;
		System.out.println("수정할 시퀀스는?");
		num=sc.nextLine();
		//위에 boolean 메서드 가져와서 실행
		if(!this.isData(num)) {
			System.out.println("해당번호는 존재하지 않습니다.");
			return;
		}
		System.out.println("수정할 이름은?");
		String name=sc.nextLine();
		
		System.out.println("수정할 주소는?");
		String addr=sc.nextLine();
		
		//sql
		String sql="update myinfo set name='"+name
				+"',addr='"+addr+"' where num="+num; //where은 한칸띄어야함!
		
		System.out.println(sql);
		
		Connection conn=db.getConnection();
		Statement stmt=null;
		
		try {
			stmt=conn.createStatement();
			stmt.execute(sql);
			
			System.out.println("수정되었습니다.");
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Update error :"+e.getMessage());
		}finally {
			db.dbClose(null, stmt, conn);
		}
	}
	
	//update 할때 없는 번호인지 있는 번호인지 찾아주기
	
	public boolean isData(String num) {
		boolean flag=false;
		
		String sql="select * from myinfo where num="+num;
		
		Connection conn=db.getConnection();
		Statement stmt=null;
		ResultSet rs=null; //셀렉트기 때문에 리저트셋 필요
		
		try {
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			//1개일 경우 if문
			if(rs.next()) { //데이터가 있는 경우
				flag=true;
			}
			else { //데이터가 없는 경우
				flag=false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(rs, stmt, conn);
		}
		
		return flag;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CRUDTest crud=new CRUDTest();
		Scanner sc=new Scanner(System.in);
		int n;
		
		while(true) {
			System.out.println("***Oracle DB 연습_myinfo***");
			System.out.println("1.insert 2.select 3.delete 4.update 9.quit");
			n=Integer.parseInt(sc.nextLine());
			
			if(n==1) {
				crud.insert();
			}
			else if(n==2) {
				crud.select();
			}
			else if(n==3) {
				crud.delete();
			}
			else if(n==4) {
				crud.update();
			}
			else if(n==9) {
				System.out.println("종료합니다.");
				break;
			}
		}
	}

}
