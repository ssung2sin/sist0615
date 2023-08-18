package myschool.model;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;

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
		String sql="select myname from myschool where myid=?";
		
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, id);
			
			rs=pstmt.executeQuery();
			
			if(rs.next()) {
				name=rs.getString("myname");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(rs, pstmt, conn);
		}
		return name;
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
				dto.setMyimg(rs.getString("myimg"));
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
				dto.setMyimg(rs.getString("myimg"));
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
	
	public MyschoolDto getSubjectScore(String num) {
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
				dto.setMyimg(rs.getString("myimg"));
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
	
	public MyschoolDto getNumSchool(String num) { // 선생용 seq 가져오기 
	      
	      MyschoolDto dto=new MyschoolDto();
	      
	      Connection conn=db.getConnection();
	      PreparedStatement pstmt=null;
	      ResultSet rs=null;
	      
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
	            dto.setMyimg(rs.getString("myimg"));
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
	      } finally {
	         db.dbClose(pstmt, conn);
	      }
	      return dto;
	   }
	
	public MyschoolDto getNumSubject(String num) { // 과목용 seq 가져오기 
		
		MyschoolDto dto=new MyschoolDto();
		
		Connection conn=db.getConnection();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		String sql="select * from mysubject where num=?";
		
		try {
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setString(1, num);
			rs=pstmt.executeQuery();
			
			if(rs.next())
			{
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
		} finally {
			db.dbClose(pstmt, conn);
		}
		return dto;
	}
	
	public void updateMyschool_admin(MyschoolDto dto) { // 교사용 개인정보 update
		
		Connection conn=db.getConnection();
		PreparedStatement pstmt=null;
		
		String sql="update myschool set mygrade=?,myclass=? where num=?";
		
		try {
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setString(1, dto.getMygrade());
			pstmt.setString(2, dto.getMyclass());
			pstmt.setString(3, dto.getNum());
			
			pstmt.execute();
					
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(pstmt, conn);
		}
		
	}
	
	public void updateMyschool_stu(MyschoolDto dto) { // 학생용 개인정보 update
		
		Connection conn=db.getConnection();
		PreparedStatement pstmt=null;
		
		String sql="update myschool set mypass=?,myhp=?,myaddr=? where num=?";
		
		try {
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setString(1, dto.getMypass());
			pstmt.setString(2, dto.getMyhp());
			pstmt.setString(3, dto.getMyaddr());
			pstmt.setString(4, dto.getNum());
			
			pstmt.execute();
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(pstmt, conn);
		}
	}
	
	public void updateSubject(MyschoolDto dto) { // 선생님용 과목점수 update 
		
		Connection conn=db.getConnection();
		PreparedStatement pstmt=null;
		
		String sql="update mysubject set korean=?,english=?,math=?,society=?,science=?,music=?,art=?,pe=? where num=?";
		
		try {
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setString(1, dto.getKorean());
			pstmt.setString(2, dto.getEnglish());
			pstmt.setString(3, dto.getMath());
			pstmt.setString(4, dto.getSociety());
			pstmt.setString(5, dto.getScience());
			pstmt.setString(6, dto.getMusic());
			pstmt.setString(7, dto.getArt());
			pstmt.setString(8, dto.getPe());
			pstmt.setString(9, dto.getNum());
			
			pstmt.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(pstmt, conn);
		}
	}
	
	public ArrayList<MyschoolDto> searchFromName(String name) {
		
		ArrayList<MyschoolDto> list=new ArrayList<MyschoolDto>();
		
		Connection conn=db.getConnection();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		String sql="select * from myschool where myname like ?";
		
		try {
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setString(1, "%"+name+"%");
			rs=pstmt.executeQuery();
			
			while(rs.next())
			{
				MyschoolDto dto=new MyschoolDto();
				
				dto.setNum(rs.getString("num"));
				dto.setMyname(rs.getString("myname"));
				
				list.add(dto);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
	
	public void deleteMyschool(String num) {
		
		Connection conn=db.getConnection();
		PreparedStatement pstmt=null;
		
		String sql="delete from myschool where num=?";
		
		try {
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setString(1, num);
			pstmt.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(pstmt, conn);
		}
	}
	
	public double gradeAvgSubject(String sub) {
	      int sumScore = 0;
	      double avg=0;
	      int cnt=0;
	      Connection conn=db.getConnection();
	      Statement stmt=null;
	      ResultSet rs=null;
	      
	      String sql="select "+sub+" from mysubject";
	      
	      try {
	         stmt=conn.createStatement();
	         rs=stmt.executeQuery(sql);
	      
	         while(rs.next()) {
	            cnt++;
	            sumScore+=Integer.parseInt(rs.getString(sub));
	         }
	         avg=(double)sumScore/cnt;
	      } catch (SQLException e) {
	      // TODO Auto-generated catch block
	      e.printStackTrace();
	      }finally {
	         db.dbClose(rs, stmt, conn);
	      }
	      return avg;
	      }
	
	   public double avgSubject(String num) {
	      int sumScore = 0;
	      double avg=0;
	      Connection conn=db.getConnection();
	      Statement stmt=null;
	      ResultSet rs=null;
	      
	      String sql="select * from mysubject where num="+num;
	      
	      try {
	         stmt=conn.createStatement();
	         rs=stmt.executeQuery(sql);
	      
	         while(rs.next()) {
	            sumScore+=Integer.parseInt(rs.getString("korean"));
	            sumScore+=Integer.parseInt(rs.getString("english"));
	            sumScore+=Integer.parseInt(rs.getString("math"));
	            sumScore+=Integer.parseInt(rs.getString("society"));
	            sumScore+=Integer.parseInt(rs.getString("science"));
	            sumScore+=Integer.parseInt(rs.getString("music"));
	            sumScore+=Integer.parseInt(rs.getString("art"));
	            sumScore+=Integer.parseInt(rs.getString("pe"));
	         }
	         avg=(double)sumScore/8;
	      } catch (SQLException e) {
	      // TODO Auto-generated catch block
	      e.printStackTrace();
	      }finally {
	         db.dbClose(rs, stmt, conn);
	      }
	      return avg;
	      }
	   
	   public int sortSubject(String sub,int tot,String score) {
	      int rank = 0; //ㅂ
	      int[] subject=new int[tot];
	      int cnt=0;
	      int i=0;
	      Connection conn=db.getConnection();
	      Statement stmt=null;
	      ResultSet rs=null;
	      
	      String sql="select "+sub+" from mysubject";
	      
	      try {
	      stmt=conn.createStatement();
	      rs=stmt.executeQuery(sql);
	      
	      while(rs.next()) {
	         subject[cnt]=Integer.parseInt(rs.getString(sub));
	         cnt++;
	      }
	      Arrays.sort(subject);
	  
	      for(i=0;i<tot;i++) {
	         if(subject[i]==Integer.parseInt(score)) {
	        	 if(i==tot-1) {
	        		 break;
	        	 }
	        	 else if(subject[i]==subject[i+1]) {
	        		 continue;
	        	 }else {
	        		 break;
	        	 }
	         }
	      }
	      rank=tot-i;
	      
	   } catch (SQLException e) {
	      // TODO Auto-generated catch block
	      e.printStackTrace();
	   }finally {
	      db.dbClose(rs, stmt, conn);
	   }
	      return rank;
	   }
	   
	   public int totStudent() {
	      Connection conn=db.getConnection();
	      Statement stmt=null;
	      ResultSet rs=null;
	      int cnt=0;
	      
	      String sql="select korean from mysubject";
	      
	      try {
	      stmt=conn.createStatement();
	      rs=stmt.executeQuery(sql);
	      
	      while(rs.next()) {
	         cnt++;
	      }
	   } catch (SQLException e) {
	      // TODO Auto-generated catch block
	      e.printStackTrace();
	   }finally {
	      db.dbClose(rs, stmt, conn);
	   }
	      return cnt;
	   }
}
