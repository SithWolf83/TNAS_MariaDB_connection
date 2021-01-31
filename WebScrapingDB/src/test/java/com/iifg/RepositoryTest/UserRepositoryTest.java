package com.iifg.RepositoryTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.iifg.WebScrapingDB.entities.User;
import com.iifg.WebScrapingDB.repositories.UserRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {
	
	@Autowired
	private UserRepository userRepository;
	
	@Before
	public void setUp() throws Exception{
		User user1 = new User("username1", "password1", "username1@emai.com");
		User user2 = new User("username2", "password2", "username2@emai.com");
		
		//save user, verify has ID value fater save
		assertNull(user1.getId());
		assertNull(user2.getId());
		this.userRepository.save(user1);
        this.userRepository.save(user2);
        assertNotNull(user1.getId());
        assertNotNull(user2.getId());
	}
	
	@Test
	public void testFetchData(){
        /*Test data retrieval*/
        User userA = userRepository.findByName("username1");
        assertNotNull(userA);
        assertEquals("password1", userA.getPassword());
        /*Get all products, list should only have two*/
        Iterable<User> users = userRepository.findAll();
        int count = 0;
        for(User p : users){
            count++;
        }
        assertEquals(count, 2);
    }

}
