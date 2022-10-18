package com.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.RLL.models.Users;
import com.RLL.repositories.UsersRepo;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MovieAppApplicationTests {

	@Autowired
	UsersRepo eRepo;
	@Test
	public void testcreate() {
		Users u = new Users();
		u.setId(2);
		u.setEmail("Test@User.com");
		u.setPassword("test");
		u.setUserName("Test User");
		u.setRole(false);
		eRepo.save(u);
		assertNotNull(eRepo.findById(2).get());
		
	}
}
