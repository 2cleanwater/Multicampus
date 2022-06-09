package com.mydb.boot.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.mydb.boot.domain.User;

public interface UserDao {

	public int insertOne(User user) throws DataAccessException;
	
	public User selectOne(String userId) throws DataAccessException;
	
	public List<User> selectMany() throws DataAccessException;
	
	public int updateOne(User user) throws DataAccessException;
	
	public int deleteOne(String userId) throws DataAccessException;
}
