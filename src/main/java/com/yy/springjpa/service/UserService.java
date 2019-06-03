package com.yy.springjpa.service;

import com.yy.springjpa.UserDao.UserDao;
import com.yy.springjpa.bean.UserBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {


    @Autowired
    private UserDao ud;


    public  String  updateUser(UserBean user){

       int  row =    ud.modUser(user);

       if (row>0){

           return "11111111111";
       }
         return "22";
    }
}
