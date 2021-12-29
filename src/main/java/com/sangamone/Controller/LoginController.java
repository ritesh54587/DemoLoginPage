package com.sangamone.LoginController;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import com.sangamone.entity.Login;
import com.sangamone.repository.LoginRepo;




@Controller
public class LoginController {

@Autowired
LoginRepo loginRepo;
	@RequestMapping("/loginPage")
	
	public String home() {
		return "login.jsp";
	}

	
@RequestMapping("/login")
public String login(@RequestParam String email, @RequestParam String password) {
	loginRepo.getLoginByEmailAndPassword(email, password);
	
	
	if(loginRepo.getLoginByEmailAndPassword(email, password) != null) {
		System.out.println("Null");

		
		return "Index.jsp";
	}
	else {
		return "error.jsp";
	}
		
	
	
}}


