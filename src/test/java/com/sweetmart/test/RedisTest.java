package com.sweetmart.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sweetmart.domain.User;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest()
public class RedisTest {

	@Autowired
	private RedisTemplate<String, User> redisTemplate;
	
	
	/*@Autowired
	private RedisService redisService;*/
	
	/*@Autowired
	private StringRedisService stringRedisService;*/
	
	
	/*@Test
	public void test1() throws Exception{
		User user = new User("admin1",20);
		redisService.set(user.getName(), user);
		
		user = new User("admin2",30);
		redisService.set(user.getName(), user);
		
		Assert.assertEquals(20, ((User)redisService.get("admin1")).getAge().longValue());
		Assert.assertEquals(30, ((User)redisService.get("admin2")).getAge().longValue());
	}*/
	
	@Test
	public void test1() throws Exception{
		User user = new User("admin3",30);
		user.setId(3l);
		redisTemplate.opsForValue().set(user.getName(), user);
		
//		user = new User("admin2",30);
//		redisTemplate.opsForValue().set(user.getName(), user);
//		redisTemplate.opsForValue().set("test", "testssssss");
		
		System.out.println((redisTemplate.opsForValue().get("admin3")));
//		
//		Assert.assertEquals(20, ((User)redisTemplate.opsForValue().get("admin1")).getAge().longValue());
//		Assert.assertEquals(30, ((User)redisTemplate.opsForValue().get("admin2")).getAge().longValue());
//		System.out.println(((User)redisTemplate.opsForValue().get("admin2")).getAge());
	}
}
