package com.shenyue.home.pojo;

import java.util.List;

public class Role {
    private int rid;
    private String roleName;
    private List<User> userList;

    @Override
    public String toString() {
        return "Role{" +
                "rid=" + rid +
                ", roleName='" + roleName + '\'' +
                '}';
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
}
