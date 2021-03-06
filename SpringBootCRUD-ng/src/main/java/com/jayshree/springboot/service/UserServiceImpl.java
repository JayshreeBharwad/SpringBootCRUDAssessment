package com.jayshree.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jayshree.springboot.model.User;
import com.jayshree.springboot.repositories.UserRepository;

/**
 * @author Jayshree
 *
 * @Created-on Jul 22, 2018
 *
 */
@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public User findById(Long id) {
		return userRepository.findOne(id);
	}

	@Override
	public User findByName(String name) {
		return userRepository.findByName(name);
	}

	@Override
	public void saveUser(User user) {
		userRepository.save(user);
	}

	@Override
	public void updateUser(User user) {
		saveUser(user);
	}

	@Override
	public void deleteUserById(Long id) {
		userRepository.delete(id);
	}

	@Override
	public void deleteAllUsers() {
		userRepository.deleteAll();
	}

	@Override
	public List<User> findAllUsers() {
		return userRepository.findAll();
	}

	@Override
	public boolean isUserExist(User user) {
		return findByName(user.getName()) != null;
	}

}
