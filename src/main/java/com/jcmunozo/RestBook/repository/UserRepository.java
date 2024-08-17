package com.jcmunozo.RestBook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jcmunozo.RestBook.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}