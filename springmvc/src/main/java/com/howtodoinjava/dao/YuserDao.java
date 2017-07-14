package com.howtodoinjava.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.howtodoinjava.mapper.YuserVO;


@Repository
public interface YuserDao {
	
	public YuserVO selectUserByName(String name);
	public List<YuserVO> selectAllUserBy(String name);
	public void addUser(YuserVO user); 

}
