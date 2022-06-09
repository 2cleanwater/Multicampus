package com.biz;

import com.dao.*;
import java.sql.*;
import java.util.*;
import com.entity.*;
import static com.common.JdbcTemplate.*;

// view -> controller -> biz -> dao
public class ScoreBiz {

	// biz 연산한 결과를 db에 보내거나 연산이 없이 db만 호출
	// db의 C&C
	public List<Score> getScoreAll() {
		// TODO Auto-generated method stub
		Connection conn = getConnection();
		List<Score> all = new ScoreDao(conn).getScoreAll();
		close(conn);
		return all;
	}

	public int getScoreInsert(Score my_score) {

		Connection conn = getConnection();
		int res = new ScoreDao(conn).getScoreInsert(my_score);
		close(conn);
		return res;
	}
	
	public int getScoredelete(String name) {

		Connection conn = getConnection();
		int res = new ScoreDao(conn).getScoredelete(name);
		close(conn);
		return res;
	}
	
	public int getScoreUpadate(Score my_score) {

		Connection conn = getConnection();
		int res = new ScoreDao(conn).getScoreUpdate(my_score);
		close(conn);
		return res;
	}
	
	public Score getScoreFind(String name) {

		Connection conn = getConnection();
		Score res = new ScoreDao(conn).getScoreFind(name);
		close(conn);
		return res;
	}


}
