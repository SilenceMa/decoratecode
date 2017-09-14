package com.decorate.ssm.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.decorate.ssm.exception.MyException;
import com.decorate.ssm.mapper.UserLoginMapper;
import com.decorate.ssm.po.User;
import com.decorate.ssm.service.LoginService;

public class LoginServiceImpl implements LoginService{

	@Autowired
	private UserLoginMapper userLoginMapper;
	
	@Override
	public int findUser(User user) throws Exception {
		//根据用户信息在数据库中进行查询
		int count = userLoginMapper.findloginUser(user);
		//如果用户存在，将查询出来的count返回，如果用户信息不存在抛出异常
		if (count==0) {
			throw new MyException("您输入的用户名或密码有误，请重新输入！");
		}else {
			return count;
		}
	}
	
}
