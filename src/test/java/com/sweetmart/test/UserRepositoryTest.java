package com.sweetmart.test;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sweetmart.domain.User;
import com.sweetmart.domain.UserRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest()
public class UserRepositoryTest {

	@Autowired
	UserRepository userRepository;

	@Test
	public void proxy() throws Exception {
		System.out.println(userRepository.getClass());
	}

	@Test
	public void save() throws Exception {
		for (int i = 0; i < 10; i++) {
			User user = new User("admin" + i, 25 + i);
			userRepository.save(user);
		}
	}

	@Test
	public void all() throws Exception {
		save();
		assertThat(userRepository.findAll()).hasSize(10);
	}
	
	@Test
	public void findByName() throws Exception{
		save();
		assertThat(userRepository.findByNameLike("admin%")).hasSize(10);
	}
	
	@After
	public void destroy() throws Exception{
		userRepository.deleteAll();
	}

}
