package com.howie.wen.service;

/**
 * @Author:HowieLee
 * @Date:1/7/2019
 * @Description:com.howie.wen.service
 * @version:1.0
 */

import com.howie.wen.dao.UserDAO;
import com.howie.wen.model.User;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserService {
    private static final Logger logger = LoggerFactory.getLogger(UserService.class);
    @Autowired(required=false)
    private UserDAO userDAO;

    public User getUser(int id) {
        return userDAO.selectById(id);
    }

}

