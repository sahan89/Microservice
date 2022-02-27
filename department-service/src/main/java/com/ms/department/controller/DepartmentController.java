package com.ms.department.controller;

import com.ms.department.entity.Department;
import com.ms.department.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by sahan on 2/12/2022.
 */
@RestController
@RequestMapping("/departments")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department) {
        System.out.println("Inside saveDepartment method of DepartmentController");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Department findDepartmentByDepartmentId(@PathVariable("id") long departmentId){
        System.out.println("Inside FindDepartmentById method of DepartmentController");
        return departmentService.findDepartmentByDepartmentId(departmentId);
    }
}
