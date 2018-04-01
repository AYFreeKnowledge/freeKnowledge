package com.freeknowledge.service;

import com.freeknowledge.model.User;

public interface UserService {
	 
    void save(User user);
     
    User findById(int id);
     
    User findBySso(String sso);
     
}