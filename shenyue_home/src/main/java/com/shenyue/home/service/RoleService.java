package com.shenyue.home.service;


import com.shenyue.home.pojo.Role;

/**
 * @author 杨发丙
 * @Description TODO
 * @return a
 * @date 2019/6/17 11:28
 */
public interface RoleService {


    /**
     * 查询角色名
     * @param i 以rid查询roleName值
     * @return Role
     */
    Role getRoleById(int i);


    /**
     * 添加角色
     * @param role Roel对象
     * @return int
     */
    int insert(Role role);


    /**
     * 修改角色
     * @param role
     * @return
     */
    int update(Role role);

    /**
     *删除角色
     *  @param rid
     * @return
     */
    int delete(int rid);


    Role roleUser(int rid);
}
