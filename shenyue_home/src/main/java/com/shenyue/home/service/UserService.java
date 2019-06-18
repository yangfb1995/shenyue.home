package com.shenyue.home.service;

import com.shenyue.home.pojo.User;

public interface UserService {

    User select(int id);

    int insert(User user);

    int update(User user);

    int delete(int id);

    User userRole(int id);

    int addUserRole(int id, int rid);

    int delUserRole(int id);
}
