package com.howtodoinjava.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.howtodoinjava.dao.YuserDao;
import com.howtodoinjava.mapper.YuserVO;

@Service
public class YuserServiceImpl implements  YuserService{
	@Autowired
	private YuserDao yuserDao;

	public YuserVO getUserByName(String name) {
		// TODO Auto-generated method stub
		return this.yuserDao.selectUserByName(name);
	}

}

