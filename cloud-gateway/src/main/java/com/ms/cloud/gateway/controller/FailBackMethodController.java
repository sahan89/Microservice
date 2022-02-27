package com.ms.cloud.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sahan on 2/14/2022.
 */
@RestController
public class FailBackMethodController {

    @GetMapping("/userServiceFailBack")
    public String userServiceFailBack() {
        return "User Service is taking longer than expected. Please try again later.!";
    }

    @GetMapping("/departmentServiceFailBack")
    public String departmentServiceFailBack() {
        return "Department Service is taking longer than expected. Please try again later.!";
    }
}
