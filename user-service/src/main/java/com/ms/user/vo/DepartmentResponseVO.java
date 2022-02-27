package com.ms.user.vo;

import com.ms.user.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by sahan on 2/12/2022.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentResponseVO {
    private User user;
    private Department department;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
