package com.matheus787.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheus787.course.entities.User;
 
public interface UserRepository extends JpaRepository<User, Long>{

}
