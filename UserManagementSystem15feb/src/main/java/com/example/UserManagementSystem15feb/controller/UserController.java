package com.example.UserManagementSystem15feb.controller;

import com.example.UserManagementSystem15feb.model.User;
import com.example.UserManagementSystem15feb.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
   private UserService service;

    @PostMapping("/addUser")
    public ResponseEntity<User> addUser(@RequestBody @Valid User user){
        service.add(user);
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }

    @GetMapping("/userall")
    public List<User> getAll(){
        return service.getall();
    }

    @GetMapping("/userid/{id}")
    public User getbyid(@PathVariable Integer id){
        return service.getbyId(id);
    }

    @PutMapping("/update")
    public ResponseEntity<String> updateUser(@RequestBody @Valid User user, @RequestParam Integer id){
        service.update(user,id);
        return new ResponseEntity<>("updated",HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<String> deleteUser(@RequestParam Integer id){
        service.delete(id);
        return new ResponseEntity<>("deleted",HttpStatus.OK);
    }
}
