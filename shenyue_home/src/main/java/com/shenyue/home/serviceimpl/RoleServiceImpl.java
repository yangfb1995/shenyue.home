package com.shenyue.home.serviceimpl;


import com.shenyue.home.mapper.RoleMapper;
import com.shenyue.home.pojo.Role;
import com.shenyue.home.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 杨发丙
 * @Description:TODO
 * @return a
 * @date 2019/6/14 16:15
 */
@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    RoleMapper roleMapper;
    @Override
    public Role getRoleById(int i) {
        return roleMapper.getRoleById(i);
    }

    @Override
    public int insert(Role role) {
        return roleMapper.insert(role);
    }

    @Override
    public int update(Role role) {
        return roleMapper.update(role);
    }

    @Override
    public int delete(int id) {
        return roleMapper.delete(id);
    }

    @Override
    public Role roleUser(int rid) {
       return roleMapper.roleUser(rid);
    }
}
