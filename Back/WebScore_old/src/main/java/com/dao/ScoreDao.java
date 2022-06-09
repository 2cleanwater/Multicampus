package com.dao;
import java.sql.Connection;
import com.entity.*;
import java.util.*;
import java.sql.*;
//JdbcTemplate의 모든 메소드가 static이기 때문에
//import static을 사용하면 메소드만 호출 된다.

import static com.common.JdbcTemplate.*;

// Insert Delete Update Select Find 메소드
public class ScoreDao implements ScoreSql{

	Connection con;
	
	public ScoreDao(Connection con) {
		this.con=con;
	}
	
	public List<Score> getScoreAll(){
		
		String sql ="select * from Score";
		Score myscore = null; //select의 결과를 한줄씩 담을 객체
		List<Score> all = new ArrayList<Score>();
		
		Statement stmt = null;
		ResultSet rs = null;
		try {
			//select한 결과를 rs로 리턴
			stmt=con.createStatement();
			rs=stmt.executeQuery(Score_selectAll);
			
			while (rs.next()) {
				//entity 객체를 생성해서 데이터 한줄씩 읽어담아 list에 추가
				myscore = new Score();
				myscore.setName(rs.getString(1));
				myscore.setKor(rs.getInt(2));
				myscore.setEng(rs.getInt(3));
				myscore.setMat(rs.getInt(4));
				//myscore = new Score(rs.getString(1), rs.getInt(2), rs.getInt(3), rs.getInt(4));
				//List 객체에 저장
				all.add(myscore);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			close(rs);
			close(stmt);
		}
		
		return all;
	}//getScoreAll()

	public int getScoreInsert(Score my_score) {
		
		PreparedStatement pstm = null;
		int res = 0; // insert 결과 변수
		
		try {
			
			pstm = con.prepareStatement(Score_insert);
			pstm.setString(1, my_score.getName());
			
			pstm.setInt(2, my_score.getKor());
			pstm.setInt(3, my_score.getEng());
			pstm.setInt(4, my_score.getMat());
			
			pstm.setInt(5, my_score.getTot());
			pstm.setDouble(6, my_score.getAvg());
			pstm.setString(7, my_score.getGrade());
			
			res = pstm.executeUpdate();
			
			if(res >0) {
				commit(con);
			}
		}catch(Exception e) {
			rollback(con);
			e.printStackTrace();
		}finally {
			close(pstm);
		}
		return res;
	}

	public int getScoredelete(String name) {

		PreparedStatement pstm = null;
		int res = 0; // insert 결과 변수
		
		try {
			
			pstm = con.prepareStatement(Score_delete);
			pstm.setString(1, name);
			
			res = pstm.executeUpdate();
			
			if(res >0) {
				commit(con);
			}
		}catch(Exception e) {
			rollback(con);
			e.printStackTrace();
		}finally {
			close(pstm);
		}
		return res;
	}
	
	public Score getScoreFind(String name){
		
		Score myscore = null; //select의 결과를 한줄씩 담을 객체
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			//select한 결과를 rs로 리턴
			stmt=con.prepareStatement(Score_find);
			stmt.setString(1, name);
			rs=stmt.executeQuery();
			
			while (rs.next()) {
				//entity 객체를 생성해서 데이터 한줄씩 읽어담아 list에 추가
				myscore = new Score(rs.getString(1), rs.getInt(2), rs.getInt(3), rs.getInt(4));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			close(rs);
			close(stmt);
		}
		
		return myscore;
	}//getScoreFind()

	public int getScoreUpdate(Score my_score) {
		
		PreparedStatement pstm = null;
		int res = 0; // insert 결과 변수
		
		try {
			
			pstm = con.prepareStatement(Score_update);
			pstm.setString(4, my_score.getName());
			
			pstm.setInt(1, my_score.getKor());
			pstm.setInt(2, my_score.getEng());
			pstm.setInt(3, my_score.getMat());
			
			res = pstm.executeUpdate();
			
			if(res >0) {
				commit(con);
			}
		}catch(Exception e) {
			rollback(con);
			e.printStackTrace();
		}finally {
			close(pstm);
		}
		return res;
	}
}//class
