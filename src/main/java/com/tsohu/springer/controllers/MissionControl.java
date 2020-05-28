package com.tsohu.springer.controllers;

import com.tsohu.springer.Services.UserService;
import com.tsohu.springer.jpa.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MissionControl {

    @Autowired
    UserService userService;

    @RequestMapping("/addUser")
    public String addUser(@RequestBody User user) {
        System.out.println("reached adduser");

        return "Hello " + user.getName() + " User ID : " + userService.addUser(user).getId()
                +" Dept ID : " + user.getDepartment().getId();
    }
}
