package com.freeknowledge.service;
 
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.freeknowledge.dao.UserProfileDao;
import com.freeknowledge.model.UserProfile;
 
@Service("userProfileService")
@Transactional
public class UserProfileServiceImpl implements UserProfileService{
     
    @Autowired
    UserProfileDao dao;
     
    public List<UserProfile> findAll() {
        return dao.findAll();
    }
 
    public UserProfile findByType(String type){
        return dao.findByType(type);
    }
 
    public UserProfile findById(int id) {
        return dao.findById(id);
    }
}