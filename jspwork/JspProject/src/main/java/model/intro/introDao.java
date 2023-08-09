package model.intro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import oracle.db.DBConnect;

public class introDao {
	DBConnect db=new DBConnect();
	
	public void insertIntro(introDto dto) {
		Connection conn=db.getConnection();
		PreparedStatement pstmt=null;
		
		String sql="insert into intro values(seq1.nextval,?,?,?,?,sysdate)";
		
		try {
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setString(1, dto.getIntro_name());
			pstmt.setString(2, dto.getIntro_blood());
			pstmt.setString(3, dto.getIntro_hp());
			pstmt.setString(4, dto.getIntro_city());
			
			pstmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(pstmt, conn);
		}
	}
	
	public ArrayList<introDto> getAllIntro(){
		ArrayList<introDto> list=new ArrayList<introDto>();
		Connection conn=db.getConnection();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		String sql="select * from intro order by intro_num";
		
		try {
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				introDto dto=new introDto();
				dto.setIntro_num(rs.getString("intro_num"));
				dto.setIntro_name(rs.getString("intro_name"));
				dto.setIntro_blood(rs.getString("intro_blood"));
				dto.setIntro_hp(rs.getString("intro_hp"));
				dto.setIntro_city(rs.getString("intro_city"));
				dto.setGaipday(rs.getTimestamp("gaipday"));
				
				list.add(dto);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(rs, pstmt, conn);
		}
		
		
		return list;
	}
	public void deleteIntro(String num) {
		Connection conn=db.getConnection();
		PreparedStatement pstmt=null;
			
		String sql="delete from intro where intro_num=?";
		
		try {
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setString(1, num);
			
			pstmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public introDto getData(String num) {
		introDto dto=new introDto();
		Connection conn=db.getConnection();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		String sql="select * from intro where intro_num=?";
		
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, num);
			
			rs=pstmt.executeQuery();
			
			if(rs.next()) {
				dto.setIntro_num(rs.getString("intro_num"));
				dto.setIntro_name(rs.getString("intro_name"));
				dto.setIntro_blood(rs.getString("intro_blood"));
				dto.setIntro_hp(rs.getString("intro_hp"));
				dto.setIntro_city(rs.getString("intro_city"));
				dto.setGaipday(rs.getTimestamp("gaipday"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return dto;
	}
	
	public String[] separateHp(String hp) {
		String hp_num[] = new String[3];
		if(hp.length()==13) {
			hp_num[0]=hp.substring(0,3);
			hp_num[1]=hp.substring(4,8);
			hp_num[2]=hp.substring(9,13);
			return hp_num;
		}
		else {
			hp_num[0]=hp.substring(0,3);
			hp_num[1]=hp.substring(4,7);
			hp_num[2]=hp.substring(8,12);
			return hp_num;
			
		}
	}
	
	public void updateIntro(introDto dto) {
		Connection conn=db.getConnection();
		PreparedStatement pstmt=null;
		
		String sql="update intro set intro_name=?,intro_blood=?,intro_hp=?,intro_city=? where intro_num=?" ;
		
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, dto.getIntro_name());
			pstmt.setString(2, dto.getIntro_blood());
			pstmt.setString(3, dto.getIntro_hp());
			pstmt.setString(4, dto.getIntro_city());
			pstmt.setString(5, dto.getIntro_num());
			
			pstmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
