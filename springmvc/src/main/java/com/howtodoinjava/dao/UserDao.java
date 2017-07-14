package com.howtodoinjava.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import yu.maven.vo.YuserVO;

@Repository
public interface UserDao {
	
	public List<YuserVO> getAllUsers();

}
