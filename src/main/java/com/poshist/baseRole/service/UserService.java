package com.poshist.baseRole.service;


import com.poshist.baseRole.entity.User;
import com.poshist.baseRole.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserDao userDao;
    public User getUserBySysName(String name){
        return userDao.findOneBySysname(name);
    }
}
