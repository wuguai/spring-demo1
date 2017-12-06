package com.sweetmart.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sweetmart.domain.User;
import com.sweetmart.service.IUserService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest()
public class UserServiceTest {

	@Autowired
	private IUserService userService;
	
	@Test
	public void test() throws Exception{
		User user = new User("test", 111);
		userService.saveUser(user);
//		Assert.assertEquals(111, userService.findByName("test").getAge().longValue());
	}
	
}
