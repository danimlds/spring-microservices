package br.com.danimlds.hruser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.danimlds.hruser.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	User findByEmail(String email);

}
