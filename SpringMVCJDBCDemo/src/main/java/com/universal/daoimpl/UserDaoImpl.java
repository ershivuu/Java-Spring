package com.universal.daoimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.universal.dao.UserDao;
import com.universal.pojo.User;

@Service 
public class UserDaoImpl implements UserDao {

	@Autowired
	private JdbcTemplate JdbcTemplate;
	
	@Override
	public boolean checkUserCredentials(User user) {
		try {
			User u = JdbcTemplate.queryForObject(
					"SELECT * FROM userdata WHERE username = ?"
					+ " AND password = ?", 
					new BeanPropertyRowMapper<User>(User.class),
					new Object[] {user.getUsername() , 
					user.getPassword()});
			
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean addNewUser(User user) {
		try {

			int count = JdbcTemplate.update("INSERT INTO userdata"
					+ " VALUES(?,?)",
					new Object[] {user.getUsername() ,
							user.getPassword()});
			
			if(count > 0)
				return true;
			else
				return false;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}




