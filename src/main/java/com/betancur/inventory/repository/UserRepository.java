package com.betancur.inventory.repository;

import com.betancur.inventory.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface UserRepository extends JpaRepository<User, Integer> {
    @Query("FROM User u where u.userName=:username and u.password=:password ")
    User findByUsernameAndPassword(@Param("username") String username, @Param("password") String password);

}
