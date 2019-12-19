package com.yilmazakkan.TheWeather.repository;

import com.yilmazakkan.TheWeather.entity.User;

import java.util.List;

public interface UserDAO {

    public List<User> findAll();

    public User findById(long id);

    public void save(User user);

    public void deleteById(long id);

    public User update(long id, User user);
}
