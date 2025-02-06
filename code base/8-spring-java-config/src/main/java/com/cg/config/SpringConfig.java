package com.cg.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.cg.AccountRepository;
import com.cg.AccountService;
import com.cg.AccountServiceImpl;
import com.cg.SavingsAccRepoImpl;
@ComponentScan(basePackages = "com.cg")
@Configuration//to create configuration class
public class SpringConfig {
  @Bean("accservice")
	public AccountService getService() {
		return new AccountServiceImpl();
	}
 /* @Bean
   public AccountRepository getRepo() {
	   return new SavingsAccRepoImpl();
   }*/
}
