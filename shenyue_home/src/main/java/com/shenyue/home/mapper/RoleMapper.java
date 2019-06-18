package com.shenyue.home.mapper;


import com.shenyue.home.pojo.Role;
import org.apache.ibatis.annotations.Param;

/**
 * @author 杨发丙
 * @Description TODO
 * @return
 * @date 2019/6/17 9:48
 */
public interface RoleMapper {

    /**
     * 以Id得到Role对象
     * @param i 表Role的ID
     * @return Role
     * @author 杨发丙
     */
    Role getRoleById(int i);

    /**
     * 添加角色信息
     * @param role
     * @return
     */
    int insert(Role role);


    /**
     * 修改角色
     * @param role
     * @return
     */
    int update(Role role);

    /**
     * 删除角色
     * @param id
     * @return
     */
    int delete(int id);

    Role roleUser(@Param("rid") int rid);

}
