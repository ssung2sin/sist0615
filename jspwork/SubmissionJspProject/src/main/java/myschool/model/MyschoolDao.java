package myschool.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import oracle.db.DBConnect;

public class MyschoolDao {
	
	DBConnect db=new DBConnect();
	
	public boolean isLoginCheck(String id,String pass) {
		boolean flag=false;
		
		Connection conn=db.getConnection();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		String sql="select * from myschool where myid=? and mypass=?";
		
		try {
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setString(1, id);
			pstmt.setString(2, pass);
			
			rs=pstmt.executeQuery();
			
			if(rs.next()) {
				flag=true;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}
	public String getName(String id) {
		Connection conn=db.getConnection();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String name="";
		String sql="select name from myschool where myid=?";
		
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, id);
			
			rs=pstmt.executeQuery();
			
			if(rs.next()) {
				name=rs.getString("name");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(rs, pstmt, conn);
		}
		return name;
	}
	
	public MyschoolDto getDataNum(String num) {
		Connection conn=db.getConnection();
		
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		MyschoolDto dto=new MyschoolDto();
		
		String sql="select * from myschool where num=?";
		
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, num);
			
			
			rs=pstmt.executeQuery();
			
			if(rs.next()) {
				
				dto.setNum(rs.getString("num"));
				dto.setMyid(rs.getString("myid"));
				dto.setMypass(rs.getString("mypass"));
				dto.setMyname(rs.getString("myname"));
				dto.setMyadmin(rs.getString("myadmin"));
				dto.setMyhp(rs.getString("myhp"));
				dto.setMyaddr(rs.getString("myaddr"));
				dto.setMybirthday(rs.getTimestamp("mybirthday"));
				dto.setMygrade(rs.getString("mygrade"));
				dto.setMyclass(rs.getString("myclass"));
				dto.setWriteday(rs.getTimestamp("writeday"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}db.dbClose(rs, pstmt, conn);
		
		return dto;
	}
	
	public MyschoolDto getData(String id) {
		Connection conn=db.getConnection();
		
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		MyschoolDto dto=new MyschoolDto();
		
		String sql="select * from myschool where myid=?";
		
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, id);
			
			
			rs=pstmt.executeQuery();
			
			if(rs.next()) {
				
				dto.setNum(rs.getString("num"));
				dto.setMyid(rs.getString("myid"));
				dto.setMypass(rs.getString("mypass"));
				dto.setMyname(rs.getString("myname"));
				dto.setMyadmin(rs.getString("myadmin"));
				dto.setMyhp(rs.getString("myhp"));
				dto.setMyaddr(rs.getString("myaddr"));
				dto.setMybirthday(rs.getTimestamp("mybirthday"));
				dto.setMygrade(rs.getString("mygrade"));
				dto.setMyclass(rs.getString("myclass"));
				dto.setWriteday(rs.getTimestamp("writeday"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}db.dbClose(rs, pstmt, conn);
		
		return dto;
	}
	
	public ArrayList<MyschoolDto> getAllDatas() {
	      
	      ArrayList<MyschoolDto> list=new ArrayList<MyschoolDto>();
	      
	      Connection conn=db.getConnection();
	      Statement stmt=null;
	      ResultSet rs=null;
	      
	      String sql="select * from myschool order by num";
	      
	      try {
	         stmt=conn.createStatement();
	         rs=stmt.executeQuery(sql);
	         
	         while(rs.next())
	         {
	            MyschoolDto dto=new MyschoolDto();
	            
	            dto.setNum(rs.getString("num"));
	            dto.setMyid(rs.getString("myid"));
	            dto.setMypass(rs.getString("mypass"));
	            dto.setMyname(rs.getString("myname"));
	            dto.setMyadmin(rs.getString("myadmin"));
	            dto.setMyhp(rs.getString("myhp"));
	            dto.setMyaddr(rs.getString("myaddr"));
	            dto.setMybirthday(rs.getTimestamp("mybirthday"));
	            dto.setMygrade(rs.getString("mygrade"));
	            dto.setMyclass(rs.getString("myclass"));
	            dto.setWriteday(rs.getTimestamp("writeday"));
	            
	            list.add(dto);
	         }
	      } catch (SQLException e) {
	         // TODO Auto-generated catch block
	         e.printStackTrace();
	      } finally {
	         db.dbClose(rs, stmt, conn);
	      }
	      
	      return list;
	   }
	
	public MyschoolDto getSubject(String num) {
		Connection conn=db.getConnection();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		MyschoolDto dto=new MyschoolDto();
		
		String sql="select * from mysubject where num=?";
		
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, num);
			
			rs=pstmt.executeQuery();
			
			if(rs.next()) {
				dto.setNum(rs.getString("num"));
				dto.setKorean(rs.getString("korean"));
				dto.setEnglish(rs.getString("english"));
				dto.setMath(rs.getString("math"));
				dto.setSociety(rs.getString("society"));
				dto.setScience(rs.getString("science"));
				dto.setMusic(rs.getString("music"));
				dto.setArt(rs.getString("art"));
				dto.setPe(rs.getString("pe"));
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(rs, pstmt, conn);
		}
		
		return dto;
	}
	
	

}
