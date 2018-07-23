package com.jayshree.springboot.service;

import java.util.List;

import com.jayshree.springboot.model.User;

/**
 * @author Jayshree
 *
 * @Created-on Jul 22, 2018
 *
 */
public interface UserService {

	User findById(Long id);

	User findByName(String name);

	void saveUser(User user);

	void updateUser(User user);

	void deleteUserById(Long id);

	void deleteAllUsers();

	List<User> findAllUsers();

	boolean isUserExist(User user);
}