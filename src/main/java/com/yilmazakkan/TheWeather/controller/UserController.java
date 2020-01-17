package com.yilmazakkan.TheWeather.controller;


import com.yilmazakkan.TheWeather.dto.UserDto;
import com.yilmazakkan.TheWeather.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    // expose "/users" and return list of users
    @GetMapping("/users")
    public List<UserDto> findAll() {
        return userService.findAll();
    }

    // add mapping for GET /users/{id}

    @GetMapping("/users/{id}")
    public UserDto getUser(@PathVariable long id) {

        UserDto user = userService.findById(id);

        if (user == null) {
            throw new RuntimeException("User id not found - " + id);
        }

        return user;
    }

    // add mapping for POST /users - add new user

    @PostMapping("/users")
    public UserDto addUser(@RequestBody UserDto user) {

        return userService.save(user);
//        userService.save(user);
//        return user;     bu şekilde yapınca postmande id null görünüyor db sorun yok
    }

    // add mapping for PUT /user - update existing user

    @PutMapping("/user/{id}")
    public UserDto userUpdate(@PathVariable long id, @RequestBody UserDto user) {


        return userService.update(id, user);

    }

    // add mapping for DELETE /users/{id} - delete user

    @DeleteMapping("/users/{id}")
    public String deleteUser(@PathVariable long id) {

        UserDto user = userService.findById(id);

        // throw exception if null

        if (user == null) {
            throw new RuntimeException("User id not found - " + id);
        }

        userService.deleteById(id);

        return "Deleted user id - " + id;
    }


}
