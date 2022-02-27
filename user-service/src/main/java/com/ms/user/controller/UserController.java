package com.ms.user.controller;

import com.ms.user.entity.User;
import com.ms.user.service.UserService;
import com.ms.user.vo.DepartmentResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by sahan on 2/12/2022.
 */
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User saveUser(@RequestBody User user) {
        System.out.println("Inside saveUser method of UserController");
        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public DepartmentResponseVO getUserWithDepartment(@PathVariable("id") long userId){
        System.out.println("Inside getUserWithDepartment method of UserController");
        return userService.getUserWithDepartment(userId);
    }

}
