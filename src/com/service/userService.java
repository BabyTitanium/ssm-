package com.service;

import com.model.User;
import org.springframework.stereotype.Service;

/**
 * Created by ÃÏ“› on 2018/7/6.
 */
public interface userService {
    public User findOneUser(Integer id);
}
