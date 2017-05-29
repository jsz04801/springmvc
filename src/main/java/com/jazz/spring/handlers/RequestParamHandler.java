package com.jazz.spring.handlers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jazz.spring.utils.ReturnCode;

public class RequestParamHandler {
	/**
	 * testRequestParam.do?userName=Jazz
	 * 
	 * @param userName
	 * @param age
	 *            required = false 表示此参数是可选的
	 * @return
	 */
	@RequestMapping(value = "/testRequestParam")
	public String testRequestParam(@RequestParam(value = "userName") String userName,
			@RequestParam(value = "age", required = false, defaultValue = "10") Integer age) {
		System.out.println("UserName: " + userName + " , age:" + age);
		return ReturnCode.SUCCESS;
	}
}