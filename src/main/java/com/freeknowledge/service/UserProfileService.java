package com.freeknowledge.service;
 
import java.util.List;

import com.freeknowledge.model.UserProfile;
 
public interface UserProfileService {
	 
    UserProfile findById(int id);
 
    UserProfile findByType(String type);
     
    List<UserProfile> findAll();
     
}