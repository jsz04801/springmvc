package com.jazz.spring.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jazz.spring.utils.ReturnCode;

@Controller
public class HelloWorld {
	/**
	 * 使用@RequestMapping 注解来映射请求的 url 使用InternalResourceViewResolver试图解析器 prefix
	 * + returnValue +suffix 并转发
	 * 
	 * @return
	 */
	@RequestMapping("/hello")
	public String hello() {
		System.out.println("hello springmvc");
		return ReturnCode.SUCCESS;
	}
}
