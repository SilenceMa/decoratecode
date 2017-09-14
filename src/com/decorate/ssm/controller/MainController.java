package com.decorate.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 主界面，用来进行用户信息的查看，添加、删除
 * @author Silence
 *
 */
@Controller
@RequestMapping("/main")
public class MainController {
	
	//查询用户信息
	@RequestMapping("/queryUser")
	public String queryUser() throws Exception{
		return "";
	}
	
	//根据id删除用户信息
	@RequestMapping("/deleteUserById{id}")
	public String deleteUserById() throws Exception{
		return "";
	}
	
	//批量删除用户信息
	@RequestMapping("/deleteUserByIdList")
	public String deleteUserByIdList() throws Exception{
		return "";
	}
	
	//添加用户信息
	@RequestMapping("/addUser")
	public String addUser() throws Exception{
		return "";
	}
}
