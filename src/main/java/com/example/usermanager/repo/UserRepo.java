package com.example.usermanager.repo;

import com.example.usermanager.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User, Long> {  //class name and primary key type
    void deleteUserById(Long id);

    Optional<User> findUserById(Long id);
}
