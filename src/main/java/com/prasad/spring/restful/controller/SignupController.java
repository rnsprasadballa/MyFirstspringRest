package com.prasad.spring.restful.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.prasad.spring.restful.model.UserData;

@Controller
@RequestMapping("/signup")
public class SignupController
{

	@RequestMapping(value="/create" , method = RequestMethod.POST)
	@ResponseBody
	public String signupUser(@RequestBody final UserData userData)
	{
		return "list";
	}
}
