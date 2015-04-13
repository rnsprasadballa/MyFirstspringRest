package com.prasad.spring.restful.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.prasad.spring.restful.business.UserAccountBusiness;
import com.prasad.spring.restful.converter.UserConverter;
import com.prasad.spring.restful.model.UserData;

@Controller
@RequestMapping("/signup")
public class SignupController
{
	@Autowired
	private UserAccountBusiness userAccountBusines;
	
	@RequestMapping(value="create" , method = RequestMethod.POST)
	@ResponseBody
	public UserData signupUser(@RequestBody final UserData userData)
	{
		return UserConverter.convertUserAccount(
				userAccountBusines.saveUserAccountDetails(UserConverter.convertUserData(userData)));
	}

}
