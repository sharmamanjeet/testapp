package com.sample.service;

import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

	public boolean validateUser(String userName, String password) {
		if ("manjeet".equalsIgnoreCase(userName) && "secret".equals(password)) {
			return true;
		}
		return false;
	}

}
