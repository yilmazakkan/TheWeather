package com.yilmazakkan.TheWeather.service.impl;

import com.yilmazakkan.TheWeather.dto.UserDto;
import com.yilmazakkan.TheWeather.entity.RegistrationRequest;
import com.yilmazakkan.TheWeather.entity.User;
import com.yilmazakkan.TheWeather.repository.UserDAO;
import com.yilmazakkan.TheWeather.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserDAO userDAO;

    private ModelMapper modelMapper;

    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public UserServiceImpl(UserDAO userDAO, ModelMapper modelMapper, BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.userDAO = userDAO;
        this.modelMapper = modelMapper;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    @Override
    @Transactional
    public List<UserDto> findAll() {
        List<User> data = userDAO.findAll();
        return Arrays.asList(modelMapper.map(data, UserDto[].class));
    }

    @Override
    @Transactional
    public UserDto findById(long id) {
        User u = userDAO.findById(id);
        return modelMapper.map(u, UserDto.class);
    }

    @Override
    @Transactional
    public UserDto save(UserDto user) {

        if (user != null) {
            User userDb = modelMapper.map(user, User.class);

            userDb.setRole("USER");

            User UserDbSaved = userDAO.save(userDb);
            if (UserDbSaved != null) {
                return modelMapper.map(UserDbSaved, UserDto.class);
            }
        }
        return user;
    }


    @Override
    @Transactional
    public void deleteById(long id) {
        userDAO.deleteById(id);
    }



    @Override
    @Transactional
    public UserDto update(long id, UserDto user) {

        if (user != null) {
            User userDb = modelMapper.map(user, User.class);
            User userDbSaved = userDAO.update(id, userDb);
            if (userDbSaved != null) {
                return modelMapper.map(userDbSaved, UserDto.class);
            }
        }
        return user;
    }


    @Override
    public UserDto findByUsername(String username) {
        User u = userDAO.findByUsername(username);
        return modelMapper.map(u, UserDto.class);
    }
    @Transactional
    public Boolean register(RegistrationRequest registrationRequest) {
        try {
            User user = new User();
            user.setPassword(bCryptPasswordEncoder.encode(registrationRequest.getPassword()));
            user.setUsername(registrationRequest.getUsername());
            userDAO.save(user);
            return Boolean.TRUE;
        } catch (Exception e) {
            return Boolean.FALSE;
        }
    }
}
