package com.nildev.securitypsql.vo.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="user_t")
@Getter @Setter
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id", length = 10)
	private long userId;
	
	@Column(name = "name", length = 100)
	private String name;
	
	@Column(name = "user_name", length = 50)
	private String userName;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "role", length = 50)
	private String role;
}
