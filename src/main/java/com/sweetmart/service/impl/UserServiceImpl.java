package com.sweetmart.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.sweetmart.domain.User;
import com.sweetmart.domain.UserRepository;
import com.sweetmart.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private UserRepository userRepository;
	
	public boolean saveUser(User user){
		userRepository.save(user);
		return true;
	}
	
	@Cacheable(value="userCache" ,key = "'user:'+#name" ,unless="#result==null")
	@Override
	public User findByName(String name) {
		// TODO Auto-generated method stub
		return userRepository.findByName(name);
	}

}
