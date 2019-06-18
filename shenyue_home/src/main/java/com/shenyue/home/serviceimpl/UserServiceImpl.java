package com.shenyue.home.serviceimpl;

import com.shenyue.home.mapper.RoleMapper;
import com.shenyue.home.mapper.UserMapper;
import com.shenyue.home.pojo.User;
import com.shenyue.home.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Autowired
    RoleMapper roleMapper;
    @Override
    public User select(int id) {
        return userMapper.select(id);
    }

    @Override
    public int insert(User user) {
        return userMapper.insert(user);
    }

    @Override
    public int update(User user) {
        return userMapper.update(user);
    }

    @Override
    public int delete(int id) {
        return userMapper.delete(id);
    }

    @Override
    public User userRole(int id) {
        return userMapper.select(id);
    }

    @Override
    public int addUserRole(int id, int rid) {
        return userMapper.addUserRole(id,rid);
    }

    @Override
    public int delUserRole(int id) {
        return userMapper.delUserRole(id);
    }
}
