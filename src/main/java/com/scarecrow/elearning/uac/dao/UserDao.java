package com.scarecrow.elearning.uac.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.scarecrow.elearning.uac.entity.User;

public class UserDao extends SqlSessionDaoSupport {
	
	public List<User> getAll(){
		
		SqlSession session = this.getSqlSession();
		
		List<User> userList = session.selectList("mapper.UserMapper.getAll", User.class);
		return userList;
		
	}
}
