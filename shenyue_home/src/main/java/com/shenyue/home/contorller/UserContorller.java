package com.shenyue.home.contorller;

import com.shenyue.home.pojo.User;
import com.shenyue.home.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 杨发丙
 * @Description:用户控制层
 * @return
 * @date 2019/6/18 9:42
 */
@RestController
@RequestMapping("User")
public class UserContorller {
    @Autowired
    UserService userService;

    /**
     * 以uuid查询用户名
     * @param uid
     * @return
     */
    @RequestMapping("select")
    public String select(int uid){
        User user=userService.select(uid);
        String userName=user.getUserName();
        return userName;
    }

    /**
     * 添加用户
     * @param user
     * @return
     */
    @RequestMapping("insert")
    public String insert(User user){
        int rows=userService.insert(user);
        int row=0;
        if(rows==1){
            row=userService.addUserRole(user.getUid(),3);
        }
        String str=(rows==1&&row==1)?"添加成功！":"添加失败！";
        return str;
    }

    /**
     * 修改用户
     * @param user
     * @return
     */
    @RequestMapping("update")
    public String update(User user){
        int rows=userService.update(user);
        String str=(rows==1)?"修改成功！":"修改失败！";
        return str;
    }

    /**
     * 删除用户
     * @param uid
     * @return
     */
    @RequestMapping("delete")
    public String delete(int uid){
        int rows=userService.delete(uid);
        int row=0;
        if(rows==1){
            row=userService.delUserRole(uid);
        }
        String str=(rows==1&&row==1)?"删除成功！":"删除失败！";
        return str;
    }

    @RequestMapping("userRole")
    public String userRole(int uid){
        User user=userService.userRole(uid);
        String userName=user.getUserName();
        String roleName=user.getRole().getRoleName();
        return "我叫"+userName+"，我是"+roleName;
    } 
}
