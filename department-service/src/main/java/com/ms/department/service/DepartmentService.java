package com.ms.department.service;

import com.ms.department.entity.Department;
import com.ms.department.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by sahan on 2/12/2022.
 */
@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    public Department findDepartmentByDepartmentId(long departmentId) {
        return departmentRepository.findDepartmentByDepartmentId(departmentId);
    }
}
