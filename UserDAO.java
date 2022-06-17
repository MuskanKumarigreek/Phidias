package com.DAO;

import com.entity.User;

public interface UserDAO{
	public boolean userRegister(User us);

	void booleanlogin(String email, String password);
	
	public User login(String email,String password); 
}


