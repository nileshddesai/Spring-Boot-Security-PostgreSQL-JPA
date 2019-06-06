package com.nildev.securitypsql.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nildev.securitypsql.repository.user.UserRepository;
import com.nildev.securitypsql.vo.user.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;
	
	@Override
	public User findByUserName(String userName) {
		return userRepository.findByUserName(userName);
	}

	@Override
	public User findByUserId(long userId) {
		return userRepository.findByUserId(userId);
	}

}
