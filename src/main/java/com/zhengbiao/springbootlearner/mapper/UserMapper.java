package com.zhengbiao.springbootlearner.mapper;

import java.util.List;
import com.zhengbiao.springbootlearner.model.User;

public interface UserMapper {
	
	public List<User> findAll();
	
}
