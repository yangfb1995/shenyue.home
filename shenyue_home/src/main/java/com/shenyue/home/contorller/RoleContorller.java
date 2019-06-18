package com.shenyue.home.contorller;

import com.shenyue.home.pojo.Role;
import com.shenyue.home.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 杨发丙
 * @Description:RoleContorller控制器
 * @return
 * @date 2019/6/17 9:47
 */
@RestController
@RequestMapping("Role")
class RoleContorller {
    @Autowired
    RoleService roleService;

    /**
     * 查询角色名
     * @param i
     * @return
     */
    @RequestMapping("roleName")
    public String info(int i){
        Role role=roleService.getRoleById(i);
        System.out.println(i);
        String roleName = role.getRoleName();
        return roleName;
    }

    /**
     * 添加角色
     * @param role
     * @return
     */
    @RequestMapping("insert")
    public String insert(Role role){
        int rows = roleService.insert(role);
        String str=(rows == 1)?"添加成功！":"添加失败!";
        return str;
    }

    /**
     * 修改角色
     * @param role
     * @return
     */
    @RequestMapping("update")
    public String update(Role role){
        int rows = roleService.update(role);
        String str = (rows == 1)?"修改成功！":"修改失败!";
        return str;
    }

    /**
     * 删除角色
     * @param rid
     * @return
     */
    @RequestMapping("delete")
    public String delete(int rid){
        int rows = roleService.delete(rid);
        String str = (rows == 1)?"删除成功！":"删除失败！";
        return str;
    }

    @RequestMapping("roleUser")
    public Role roleUser(@RequestParam int rid){
        Role role = roleService.roleUser(rid);
        return role;
    }
}
