package com.yy.springjpa.JapController;

import com.yy.springjpa.bean.UserBean;
import com.yy.springjpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JapController {

    @Autowired
    private UserService us;



    @GetMapping("modUser")
    public  void  modUser(UserBean ub){

        System.out.println("jinjinjinihi");

        us.updateUser(ub);

    }



}
