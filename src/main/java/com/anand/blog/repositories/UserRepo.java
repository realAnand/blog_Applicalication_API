package com.anand.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anand.blog.entities.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
