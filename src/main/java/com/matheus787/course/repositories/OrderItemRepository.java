package com.matheus787.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheus787.course.entities.OrderItem;
 
public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
