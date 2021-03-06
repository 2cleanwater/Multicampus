package com.mydb.boot.dao;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mydb.boot.domain.User;

@Repository("UserDaoJdbc")
public class UserDaoJdbc implements  UserDao{
   
	@Autowired
	 JdbcTemplate jdbc;
	
	@Override
	public int insertOne(User user) throws DataAccessException {
		String insert_sql ="insert  into m_user values(?,?,?,?,?)";
	    int res  = jdbc.update(insert_sql, user.getUserId(), user.getPassword(), user.getUserName(),
	    		user.getAge(), user.getRole());		
		return res;
	}
	

	@Override
	public User selectOne(String userId) throws DataAccessException {
	    User u  = new User();
	    Map<String , Object> map 
	           = jdbc.queryForMap("select * from m_user where user_id =?", userId);
		
	    u.setUserId((Integer)map.get("user_id"));
	    u.setPassword((String)map.get("password"));
	    u.setUserName((String)map.get("user_name"));
	    u.setRole((String) map.get("role"));
	    u.setAge((Integer)map.get("age"));
		return u;
	}
	

	@Override
	public List<User> selectMany() throws DataAccessException {
		List<Map<String, Object>> getList = jdbc.queryForList("SELECT * FROM m_user");       
        List<User> userList = new ArrayList<>();
               
        for (Map<String, Object> map : getList) {
        	User u  = new User(); 
            u.setUserId((Integer)map.get("user_id"));
     	    u.setPassword((String)map.get("password"));
     	    u.setUserName((String)map.get("user_name"));
     	    u.setRole((String) map.get("role"));
     	    u.setAge((Integer)map.get("age"));
            userList.add(u);
        }
        return userList;
	}

	@Override
	public int updateOne(User user) throws DataAccessException {
		  int res = jdbc.update(
	                "UPDATE m_user   SET  password = ? , user_name = ? , age = ?  WHERE user_id = ?",
	                user.getPassword(), user.getUserName(), user.getAge(), user.getUserId());
	        return res;
	}

	@Override
	public int deleteOne(String userId) throws DataAccessException {
		  int res = jdbc.update(
	                "delete  from m_user where user_id =?" ,userId); 
	        return res;
	}

}
