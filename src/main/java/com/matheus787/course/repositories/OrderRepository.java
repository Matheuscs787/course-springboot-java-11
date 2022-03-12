package com.matheus787.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheus787.course.entities.Order;
 
public interface OrderRepository extends JpaRepository<Order, Long>{

}
