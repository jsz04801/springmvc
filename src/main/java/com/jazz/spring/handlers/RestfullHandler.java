package com.jazz.spring.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jazz.spring.utils.ReturnCode;
/**
 * There will be an error when you use tomcat8.0
 * @author Jazz at 24-May-2017
 * Rest full style
 */
@Controller
public class RestfullHandler {
	
	@RequestMapping(value="/rest/{id}",method = RequestMethod.GET)
	public String testRest(@PathVariable Integer id){
		System.out.println("test get:"+id);
		return ReturnCode.SUCCESS;
	}
	@RequestMapping(value="/rest",method = RequestMethod.POST)
	public String testRest(){
		System.out.println("test POST:");
		return "redirect:/hello.do";
	}
	@RequestMapping(value="/rest/{id}",method = RequestMethod.DELETE)
	public String testRestDelete(@PathVariable Integer id){
		System.out.println("test delete:"+id);
		return ReturnCode.SUCCESS;
	}
	
	@RequestMapping(value="/rest/{id}",method = RequestMethod.PUT)
	public String testRestPut(@PathVariable Integer id){
		System.out.println("test put:"+id);
		return "redirect:/hello.do";
	}
}