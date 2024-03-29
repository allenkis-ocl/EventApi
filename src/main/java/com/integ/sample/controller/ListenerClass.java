package com.integ.sample.controller;



import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//import com.vo.Authentication;
import com.vo.Message;

@RestController
public class ListenerClass {

	@RequestMapping(method=RequestMethod.POST,value="/messages")
	public String listenMessage(@RequestBody Message msg){
		
		if("url_verification".equalsIgnoreCase(msg.getType()))
			return msg.getChallenge();
		else{
			return msg.getText();
		}
			
	}
	
	/*@RequestMapping(method=RequestMethod.POST,value="/auth")
	public String authenticate(@RequestBody Authentication auth){
		return auth.getChallenge();
	}*/
	@RequestMapping("/")
	public String home(){
		return "home page";
	}
}

