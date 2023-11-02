package com.example.ist412project.repository;

import com.example.ist412project.model.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserInfo, Long> {
    UserInfo findByUserName(String userName);
    UserInfo findByUserNameAndPassword(String username, String password);
    // You can add custom query methods here if needed

}
