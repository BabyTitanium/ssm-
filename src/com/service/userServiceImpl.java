package com.service;

import com.dao.userMapper;
import com.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by ÃÏ“› on 2018/7/6.
 */
@Service
public class userServiceImpl implements userService {
    @Resource
    private userMapper usermapper;
    @Override
    public User findOneUser(Integer id){
        return usermapper.findOneUser(id);
    }

}
