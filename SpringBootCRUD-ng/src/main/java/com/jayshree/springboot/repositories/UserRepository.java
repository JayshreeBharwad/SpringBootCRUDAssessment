package com.jayshree.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jayshree.springboot.model.User;

/**
 * @author Jayshree
 *
 * @Created-on Jul 22, 2018
 *
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	User findByName(String name);

}
