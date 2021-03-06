package com.mydb.boot.service;
//View -> Controller -> Biz -> Dao

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mydb.boot.dao.UserDao;
import com.mydb.boot.domain.User;

@Transactional
@Service
public class UserService {
	
	@Autowired
	@Qualifier("UserDaoJdbc") //후손의 객체명을 컴포넌트 명으로 지정해준다.
	UserDao dao;
	
	public boolean insertOne(User user) {
		int res = dao.insertOne(user);
		if(res>0) {
			return true;
		}else {
			return false;
		}
	}
	
	//커밋과 롤백이 필요없는 select구문은 바로 호출된다.
	public User selectOne(String userId) {
		return dao.selectOne(userId);
	}
	
	public List<User> selectMany() {
		return dao.selectMany();
	}
	public boolean updateOne(User user) {
		int res = dao.updateOne(user);
		if(res>0) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean deleteOne(String userId) {
		int res = dao.deleteOne(userId);
		if(res>0) {
			return true;
		}else {
			return false;
		}
	}
}
