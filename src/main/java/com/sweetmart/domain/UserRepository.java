package com.sweetmart.domain;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

	public User findByName(String name);
	
	public List<User> findByNameLike(String name);
}
