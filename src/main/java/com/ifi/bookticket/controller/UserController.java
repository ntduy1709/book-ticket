package com.ifi.bookticket.controller;

import com.ifi.bookticket.dto.UserDTO;
import com.ifi.bookticket.model.User;
import com.ifi.bookticket.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users", produces = MediaType.APPLICATION_JSON_VALUE)
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<UserDTO> getUsers() {
        return userService.getUsers();
    }

    @PostMapping
    public UserDTO postUser(@RequestBody UserDTO userDTO) {
        return userService.postUser(userDTO);
    }
}
