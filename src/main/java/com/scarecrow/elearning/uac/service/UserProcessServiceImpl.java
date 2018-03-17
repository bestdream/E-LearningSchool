package com.scarecrow.elearning.uac.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scarecrow.elearning.uac.dao.UserMapper;
import com.scarecrow.elearning.uac.entity.User;

@Service
public class UserProcessServiceImpl implements UserProcessService {

	@Autowired
	private UserMapper userDao;

	public boolean login(User userParam) {
		
		User user = userDao.getUserById(userParam.getId());
		boolean loginSuccess = user==null?false:true;
		return loginSuccess;
	}
	

}
