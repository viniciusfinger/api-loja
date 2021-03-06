package com.viniciusfinger.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.viniciusfinger.course.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {}
