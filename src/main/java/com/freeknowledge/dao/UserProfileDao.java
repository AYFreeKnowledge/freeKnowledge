package com.freeknowledge.dao;
 
import java.util.List;

import com.freeknowledge.model.UserProfile;
 
public interface UserProfileDao {
	 
    List<UserProfile> findAll();
     
    UserProfile findByType(String type);
     
    UserProfile findById(int id);
}