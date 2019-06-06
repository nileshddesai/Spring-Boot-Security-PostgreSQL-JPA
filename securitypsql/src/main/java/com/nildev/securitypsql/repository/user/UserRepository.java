package com.nildev.securitypsql.repository.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nildev.securitypsql.vo.user.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	User findByUserName(String userName);
	
	User findByUserId(long userId);
}
