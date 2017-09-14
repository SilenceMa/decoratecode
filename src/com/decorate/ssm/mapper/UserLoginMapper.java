package com.decorate.ssm.mapper;

import com.decorate.ssm.po.User;

public interface UserLoginMapper {
	public int findloginUser(User user) throws Exception;
}
