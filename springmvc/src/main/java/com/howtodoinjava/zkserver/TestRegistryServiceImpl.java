package com.howtodoinjava.zkserver;



import org.springframework.stereotype.Service;

import yu.maven.testapi.TestRegistryService;

@Service("testRegistryService")
public class TestRegistryServiceImpl implements TestRegistryService{

	public String hello(String name) {
		// TODO Auto-generated method stub
		System.out.println(name);
		return name;
	}

}
