package com.example.SpringBootUnitTest.service;

import com.example.SpringBootUnitTest.dao.UserDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {
    @Resource
    private UserDao userDao;
    public String getUser(){
        return userDao.getUser();
    }
}
