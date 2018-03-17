package com.scarecrow.elearning.uac.dao;

import org.springframework.stereotype.Repository;

import com.scarecrow.elearning.uac.entity.User;

@Repository
public interface UserMapper {
	
	public User getUserById(int id);

}
