package com.howtodoinjava.runner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.howtodoinjava.mapper.YuserVO;
import com.howtodoinjava.service.YuserService;

public class TestRunner {

	private ApplicationContext ac = null;
	private YuserService userService = null;
	
	public void test(){
		
		ac = new ClassPathXmlApplicationContext("spring-mybatis.xml"); 
		userService = (YuserService) ac.getBean("userService");  
		YuserVO yususer = userService.getUserByName("yu");
		System.out.println(yususer.getUser_emial());
	}
	
	public static void main(String[] args) {
		TestRunner tr = new TestRunner();
		tr.test();
	}
}
