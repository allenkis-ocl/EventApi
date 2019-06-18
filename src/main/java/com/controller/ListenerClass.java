package com.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vo.Authentication;
import com.vo.Message;

@RestController
public class ListenerClass {

	@RequestMapping(method=RequestMethod.POST,value="/messages")
	public void listenMessage(@RequestBody Message msg){
		System.out.println("Request received");
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/auth")
	public String authenticate(@RequestBody Authentication auth){
		return auth.getChallenge();
	}
}
