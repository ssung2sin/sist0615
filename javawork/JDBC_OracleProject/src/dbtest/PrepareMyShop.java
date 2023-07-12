package dbtest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PrepareMyShop {
	DBConnect db=new DBConnect();
	Scanner sc=new Scanner(System.in);
		
		//insert
	public void insertMyShop() {
		//Connection
		Connection conn=db.getConnection();
		PreparedStatement pstmt=null;
		
		System.out.println("상품명은?");
		String sang=sc.nextLine();
		System.out.println("수량?");
		int su=Integer.parseInt(sc.nextLine());
		System.out.println("가격?");
		int dan=Integer.parseInt(sc.nextLine());
		
		//sql..PrepareStatement는 미완의 sql문을작성
		String sql="insert into myshop values (seq1.nextval,?,?,?,sysdate)";
		
		try {
			pstmt=conn.prepareStatement(sql);
			
			//?를 순서대로 바인딩
			pstmt.setString(1, sang);
			pstmt.setInt(2, su);
			pstmt.setInt(3, dan);
			
			//업데이트
			int a= pstmt.executeUpdate();
			
			if(a==1) {
				System.out.println("인서트 성공!!");
			}
			else {
				System.out.println("인서트 실패!!");
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(pstmt, conn);
		}
	}
	
	public void selectShop() {
		Connection conn=db.getConnection();
		Statement stmt=null;
		ResultSet rs=null;
		String sql="select * from myshop order by sangpum";
		System.out.println("상품번호\t상품명\t수량\t가격\t입고날짜");
		System.out.println("-------------------------------------------------");
		try {
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			
			while(rs.next()) {
				System.out.println(rs.getInt("shopnum")+"\t"+rs.getString("sangpum")
				+"\t"+rs.getInt("su")+"\t"+rs.getInt("price")+"\t"+rs.getString("ipgo"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(rs, stmt, conn);
		}
		
	}
	public void deleteShop() {
		Connection conn=db.getConnection();
		PreparedStatement pstmt=null;
		System.out.println("삭제하실 시퀀스를 입력하세요.");
		int n=Integer.parseInt(sc.nextLine());
		
		String sql="delete from myshop where shopnum="+n;
		
		try {
			pstmt=conn.prepareStatement(sql);
			// ?에 값 넣어주기 ! 바인딩
			pstmt.setInt(1, n);
			int a=pstmt.executeUpdate();
			
			if(a==0) {
				System.out.println("해당번호는 존재하지 않습니다.");
			}
			else {
				System.out.println("삭제하였습니다.");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(pstmt, conn);
		}
	}
	
	public void updateShop() {
		System.out.println("수정할 시퀀스는?");
		int num=Integer.parseInt(sc.nextLine());
		if(!isDataShop(num)) {
			System.out.println("입력하신 시퀀스에 값이 존재하지 않습니다.");
			return;
		}
		System.out.println("수정할 상품명은?");
		String name=sc.nextLine();
		
		System.out.println("수정할 수량은?");
		int su=Integer.parseInt(sc.nextLine());
		
		System.out.println("수정할 가격은?");
		int price=Integer.parseInt(sc.nextLine());
		
		Connection conn=db.getConnection();
		PreparedStatement pstmt=null;
		
		String sql="update myshop set sangpum=?,su=?,price=?"
				+" where shopnum="+num;
		
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setInt(2, su);
			pstmt.setInt(3, price);
			
			//업데이트
			pstmt.execute();
			
			System.out.println("수정완료");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(pstmt, conn);
		}
	}
	
	
	public boolean isDataShop(int num) {
		Connection conn=db.getConnection();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		boolean flag=false;
		String sql="select * from myshop where shopnum=?";
		
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			
			rs=pstmt.executeQuery();
			
			if(rs.next()) {
				flag=true;
			}
			else {
				flag=false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(rs, pstmt, conn);
		}
		
		
		
		return flag;
		
	}
	
	//검색
	public void searchSangpum() {
		
		System.out.println("검색할 상품명(일부)");
		String sang=sc.nextLine();
		
		String sql="select * from myshop where sangpum like ?";
		
		System.out.println("시컨스\t상품명\t수량\t단가\t날짜");
		System.out.println("---------------------------------------------");
		
		Connection conn = db.getConnection();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, "%"+sang+"%"); //입력한 값이 들어가는 부분 검색
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getInt("shopnum")+"\t"+rs.getString("sangpum")
				+"\t"+rs.getInt("su")+"\t"+rs.getInt("price")+"\t"+rs.getString("ipgo"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(rs, pstmt, conn);
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrepareMyShop shop=new PrepareMyShop();
		Scanner sc=new Scanner(System.in);
		
		int n;
		
		while(true) {
			System.out.println("****상품입고****");
			System.out.println("1.상품추가	 2.상품삭제 3.상품수정 4.상품전체출력 5.상품검색 9.종료");
			n=Integer.parseInt(sc.nextLine());
			
			if(n==1) {
				shop.insertMyShop();
			}
			else if(n==2) {
				shop.deleteShop();
			}
			else if(n==3) {
				shop.updateShop();
			}
			else if(n==4) {
				shop.selectShop();
			}
			else if(n==5) {
				shop.searchSangpum();
			}
			else if(n==9) {
				System.out.println("종료합니다.");
				break;
			}
		}
		

	}

}
