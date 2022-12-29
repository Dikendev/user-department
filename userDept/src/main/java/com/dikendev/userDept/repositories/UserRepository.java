package com.dikendev.userDept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dikendev.userDept.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
