package com.yilmazakkan.TheWeather.service;

import com.yilmazakkan.TheWeather.dto.UserDto;

import java.util.List;

public interface UserService {

    public List<UserDto> findAll();

    public UserDto findById(long id);

    public UserDto save(UserDto user);

    public void deleteById(long id);

    public UserDto update(long id, UserDto user);

    public  UserDto findByUsername(String username);
}
