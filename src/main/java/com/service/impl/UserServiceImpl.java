package com.service.impl;


import com.dao.UserDao;
import com.pojo.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> queryAllUser() {
        System.out.println("yes 2");
        List<User> l = userDao.queryAllUser();
        System.out.println("hello"+l.get(0).getUsername()+l.get(0).getId());
        return l;
    }
}