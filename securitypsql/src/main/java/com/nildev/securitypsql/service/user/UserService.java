package com.nildev.securitypsql.service.user;

import com.nildev.securitypsql.vo.user.User;

public interface UserService {

	public User findByUserName(String userName);
	
	public User findByUserId(long userId);
}
