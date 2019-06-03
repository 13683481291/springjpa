package com.yy.springjpa.UserDao;

import com.yy.springjpa.bean.UserBean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;


public interface UserDao extends JpaRepository<UserBean,Integer> {

    @Transactional
    @Modifying
    @Query(value = "update  UserBean set uname =:name,uphone=:phone where uid=:id")
    int modUser(UserBean userBean );


}
