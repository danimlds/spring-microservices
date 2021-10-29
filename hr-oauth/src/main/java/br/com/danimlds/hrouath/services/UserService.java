package br.com.danimlds.hrouath.services;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import br.com.danimlds.hrouath.entities.User;
import br.com.danimlds.hrouath.feignclients.UserFeignClient;

@Service
public class UserService {

	Logger logger = org.slf4j.LoggerFactory.getLogger(UserService.class);
	
	@Autowired
	private UserFeignClient userFeignClient;
	
	public User findByEmail(String email) {
		
		User user = userFeignClient.findByEmail(email).getBody();
		if(user == null) {
			logger.error("Email not found " +email);
			throw new IllegalArgumentException("Email not found");
		}
		logger.info("Email Found " +email);
		return user;
	}
	
}
