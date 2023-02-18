package com.example.UserManagementSystem15feb.dao;

import com.example.UserManagementSystem15feb.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Iuser extends JpaRepository<User,Integer> {
}
