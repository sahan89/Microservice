package com.ms.user.repository;

import com.ms.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by sahan on 2/12/2022.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUserId(long userId);
}
