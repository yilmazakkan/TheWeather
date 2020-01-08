package com.yilmazakkan.TheWeather.repository;


import com.yilmazakkan.TheWeather.entity.UserRoles;

public interface UserRoleDAO {
    public UserRoles findById(long id);

    public UserRoles save(UserRoles roles);

}
