package com.decorate.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.decorate.ssm.po.User;
import com.decorate.ssm.po.UserCustom;
import com.decorate.ssm.po.UserQueryVo;
import com.decorate.ssm.service.UserService;

/**
 * 主界面，用来进行用户信息的查看，添加、删除
 * @author Silence
 *
 */
@Controller
@RequestMapping("/main")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	//查询用户信息
	@RequestMapping("/queryUser")
	public ModelAndView queryUser(UserQueryVo userQueryVo) throws Exception{
		List<UserCustom> userList = userService.findUserList(userQueryVo);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("userList", userList);
		modelAndView.setViewName("/main/main");
		
//		model.addAttribute("userList", userList);
//		return "/main/main";
		return modelAndView;
	}
	
	//根据id删除用户信息
	@RequestMapping("/deleteUserById")
	public String deleteUserById(@RequestParam(value="id",required = true,defaultValue="0") Integer user_id) throws Exception{
		try {
			userService.deleteUser(user_id);
		} catch (Exception e) {
			e.printStackTrace();
			return "/error";
		}
		return "/success";
	}
	
	//批量删除用户信息
	@RequestMapping("/deleteUserByIdList")
	public String deleteUserByIdList() throws Exception{
		return "/success";
	}
	
	//添加用户信息
	@RequestMapping("/addUser")
	public String addUser(User user) throws Exception{
		userService.addUser(user);
		return "/success";
	}
	
	//根据id查询用户信息
	@RequestMapping("editUser")
	public String editUser(Model model ,Integer id) throws Exception{
		UserCustom userCustom = null;
		if (id!=null) {
		userCustom = userService.findUserById(id);
		model.addAttribute("userCustom", userCustom);
		}
		return "/main/editUser";
	}
	
	//根据用户id修改用户信息
	@RequestMapping("/updateUserById")
	public String updateUserById(Integer id,UserCustom userCustom) throws Exception{
		userService.updateUser(id, userCustom);
		return "/success";
	}
}
