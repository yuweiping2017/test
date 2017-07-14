package com.howtodoinjava.zkserver;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.howtodoinjava.dao.UserDao;
import com.howtodoinjava.dao.YuserDao;

import yu.maven.testapi.GetUsers;
import yu.maven.vo.YuserVO;

@Service("getUsers")
public class GetUsersImpl implements GetUsers{
	
	@Autowired
	private UserDao userDao;

	public List<YuserVO> getAllUsers() {
		// TODO Auto-generated method stub
		List<YuserVO> list = null;
			try {
				list = userDao.getAllUsers();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("get users failed ..................................");
				return null;
			}
		return list;
	}

}
