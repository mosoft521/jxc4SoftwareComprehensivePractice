package com.gmail.mosoft521.cp.jxc.service.impl;

import com.gmail.mosoft521.cp.jxc.dao.UserMapper;
import com.gmail.mosoft521.cp.jxc.entity.UserExample;
import com.gmail.mosoft521.cp.jxc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public boolean checkLogin(String username, String pass) {
        UserExample userExample = new UserExample();
        UserExample.Criteria userExampleCriteria = userExample.createCriteria();
        userExampleCriteria.andUsernameEqualTo(username);
        userExampleCriteria.andPassEqualTo(pass);
        long count = userMapper.countByExample(userExample);
        return count > 0;
    }
}
