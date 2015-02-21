package com.prasad.spring.restful.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/sms/messages")
public class SMSMessagesController
{

	@RequestMapping(value="/{send}", method = RequestMethod.POST)
	@ResponseBody
	public String sendMessage(final String name)
	{
		//sample messge sending.
		
		return "list";
	}
}
