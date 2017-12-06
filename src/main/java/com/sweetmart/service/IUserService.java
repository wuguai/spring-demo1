package com.sweetmart.service;

import com.sweetmart.domain.User;

public interface IUserService {

	
	public boolean saveUser(User user);
	
	public User findByName(String name);
}
