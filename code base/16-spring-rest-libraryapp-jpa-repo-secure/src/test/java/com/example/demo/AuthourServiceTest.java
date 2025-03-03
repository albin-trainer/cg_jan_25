package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.entity.Authour;
import com.example.exception.AuthourNotFoundException;
import com.example.repo.AuthourRepository;
import com.example.service.AuthourServiceImpl;

@SpringBootTest
public class AuthourServiceTest {
    @Mock //for making mock objects
	private AuthourRepository repo;
        
    @InjectMocks //for injecting mock objs in the service
	private AuthourServiceImpl service;
    
    
    @Test
	public void searchId() {
		Authour a=new Authour();
		a.setAuthourId(789);
		a.setName("TestAuthour");
		//PRE-CONDITION
		when(repo.findById(789)).thenReturn(Optional.of(a));
		Authour actual= service.searchByIdService(789);
		assertEquals(a.getName(), actual.getName());
		//verify(repo,times(1)).findById(789);
	}
    @Test
   	public void searchIdNegative() {
    	when(repo.findById(789)).thenReturn(Optional.empty());
    	Exception e=
    			assertThrows(AuthourNotFoundException.class,
    					()->service.searchByIdService(789));
    			assertEquals("The authour 789 Not Found", e.getMessage());
    }
}
