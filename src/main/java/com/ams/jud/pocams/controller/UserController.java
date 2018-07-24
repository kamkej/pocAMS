/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ams.jud.pocams.controller;

import com.ams.jud.pocams.model.User;
import com.ams.jud.pocams.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author julio
 */
@RestController
public class UserController {
    
    @Autowired
    private UserService userService;
    
   @PostMapping("/user")
    public ResponseEntity<?> save(@RequestBody User user) {
        long id  = userService.save(user);
        return ResponseEntity.ok().body("New User has been saved with ID: "+ id);
    }
    @GetMapping("/user/{id}")
    public ResponseEntity<User> get(@PathVariable("id") long id){
        User user = userService.get(id);
        return ResponseEntity.ok().body(user);
    }
    @GetMapping("/user")
    public ResponseEntity<List<User>> list(){
        List<User> users = userService.list();
        return ResponseEntity.ok().body(users);
    }
}
