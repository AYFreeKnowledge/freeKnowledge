package com.freeknowledge.service;
 
import java.util.List;

import com.freeknowledge.model.UserProfile;
 
public interface UserProfileService {
 
    List<UserProfile> findAll();
     
    UserProfile findByType(String type);
     
    UserProfile findById(int id);
}