/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ams.jud.pocams.service;

import com.ams.jud.pocams.model.User;
import java.util.List;

/**
 *
 * @author julio
 */
public interface UserService {
     long save(User user);
    User get(long id);
    List<User> list();
    void update(long id, User user);
    void delete(long id);
    
}
