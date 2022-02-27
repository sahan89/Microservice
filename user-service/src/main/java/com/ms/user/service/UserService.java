package com.ms.user.service;

import com.ms.user.entity.User;
import com.ms.user.repository.UserRepository;
import com.ms.user.vo.Department;
import com.ms.user.vo.DepartmentResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by sahan on 2/12/2022.
 */
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public DepartmentResponseVO getUserWithDepartment(long userId) {
        DepartmentResponseVO departmentResponseVO = new DepartmentResponseVO();
        User user = userRepository.findByUserId(userId);
        Department department = restTemplate.getForObject("http://department-service:9001/departments/"+ user.getDepartmentId() , Department.class);
        departmentResponseVO.setUser(user);
        departmentResponseVO.setDepartment(department);

        return departmentResponseVO;
    }
}
