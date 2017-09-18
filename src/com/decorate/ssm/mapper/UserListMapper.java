package com.decorate.ssm.mapper;

import java.util.List;

import com.decorate.ssm.po.UserCustom;
import com.decorate.ssm.po.UserQueryVo;

public interface UserListMapper {
	public List<UserCustom> findUserList(UserQueryVo userQueryVo) throws Exception;
}
