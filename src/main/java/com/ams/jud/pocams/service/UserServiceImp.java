/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ams.jud.pocams.service;

import com.ams.jud.pocams.dao.UserDao;
import com.ams.jud.pocams.model.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author julio
 */
@Service
@Transactional(readOnly = true)
public class UserServiceImp implements UserService{

    @Autowired
    private UserDao userDao;
    
    @Transactional
    @Override
    public long save(User user) {
        return userDao.save(user);
    }

    @Override
    public User get(long id) {
        return userDao.get(id);
    }

    @Override
    public List<User> list() {
        return userDao.list();
    }

    @Override
    public void update(long id, User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
