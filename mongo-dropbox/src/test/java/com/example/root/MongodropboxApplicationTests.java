package com.example.root;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.root.repo.UserFileRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MongodropboxApplicationTests {

	@Autowired
    ApplicationContext context;
	
    @Autowired
    UserFileRepository mongoRepository;
	
	@Test
	public void contextLoads() {
	}

}
