package com.example.UserManagementSystem15feb.service;

import com.example.UserManagementSystem15feb.dao.Iuser;
import com.example.UserManagementSystem15feb.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
   private Iuser iuser;


    public void add(User user) {
        iuser.save(user);
    }

    public List<User> getall() {
        return iuser.findAll();
    }

    public User getbyId(Integer id) {
        return iuser.findById(id).get();
    }

    public void update(User newuser, Integer id) {
        User us = iuser.findById(id).get();
        us.setUserId(newuser.getUserId());
        us.setUsername(newuser.getUsername());
        us.setEmail(newuser.getEmail());
        us.setDate(newuser.getDate());
        us.setTime(newuser.getTime());
        us.setDateOfbirth(newuser.getDateOfbirth());
        us.setPhNumber(newuser.getPhNumber());
        iuser.save(us);
    }

    public void delete(Integer id) {
        iuser.deleteById(id);
    }
}
