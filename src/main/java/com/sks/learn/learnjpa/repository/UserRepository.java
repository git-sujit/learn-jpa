package com.sks.learn.learnjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sks.learn.learnjpa.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
