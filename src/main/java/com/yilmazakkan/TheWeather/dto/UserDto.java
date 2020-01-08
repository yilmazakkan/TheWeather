package com.yilmazakkan.TheWeather.dto;

import com.yilmazakkan.TheWeather.entity.UserRoles;



public class UserDto {

    private Long id;

    private String userName;

    private String password;

    private UserRoles role;

    private Long roleId;

    public UserDto() {
    }

    public UserDto(Long id, String userName, String password, UserRoles role, Long roleId) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.role = role;
        this.roleId = roleId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserRoles getRole() {
        return role;
    }

    public void setRole(UserRoles role) {
        this.role = role;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", role=" + role +
                ", roleId=" + roleId +
                '}';
    }


}
