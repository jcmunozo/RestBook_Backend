package com.jcmunozo.RestBook.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jcmunozo.RestBook.model.User;
import com.jcmunozo.RestBook.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User create(User user) {
    	return userRepository.save(user);
    }
    
    public User update(User user) {
    	return userRepository.save(user);
    }
    
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(Integer id) {
        Optional<User> user = userRepository.findById(id);
    	return user.orElse(null);
    }
    
    public void deleteUser(Integer id) {
        userRepository.deleteById(id);
    }
}