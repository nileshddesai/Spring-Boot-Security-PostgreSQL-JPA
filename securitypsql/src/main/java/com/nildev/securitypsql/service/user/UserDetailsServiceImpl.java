package com.nildev.securitypsql.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.nildev.securitypsql.repository.user.UserRepository;
import com.nildev.securitypsql.vo.user.User;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		User user = userRepository.findByUserName(username); 
		
		if(user == null)
			throw new UsernameNotFoundException(username + " not found.");
		
		return new org.springframework.security.core.userdetails.User(user.getUserName(), user.getPassword(),
				AuthorityUtils.createAuthorityList(user.getRole()));
	}

}
