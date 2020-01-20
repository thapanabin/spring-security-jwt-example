package com.nabin.jwt.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nabin.jwt.api.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	User findByUserName(String username);

}
