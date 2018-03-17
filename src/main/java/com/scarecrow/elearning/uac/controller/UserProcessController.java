package com.scarecrow.elearning.uac.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.scarecrow.elearning.uac.entity.User;
import com.scarecrow.elearning.uac.service.UserProcessService;

@Controller
@RequestMapping("/user")
public class UserProcessController {
	
	@Autowired
	private UserProcessService userProcessService;
	
	@RequestMapping("/index")
    public String index(HttpServletRequest request, HttpServletResponse response){
		User user = new User();
		user.setId(1);
		userProcessService.login(user);
		
        System.out.println("hello world");
        return "index";
    }

}
