package com.shenyue.home.mapper;

import com.shenyue.home.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    User select(int id);

    int insert(User user);

    int update(User user);

    int delete(int id);

    int addUserRole(@Param("id") int id, @Param("rid") int rid);

    int delUserRole(int id);
}
