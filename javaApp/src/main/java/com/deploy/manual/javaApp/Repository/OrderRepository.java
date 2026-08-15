package com.deploy.manual.javaApp.Repository;

import com.deploy.manual.javaApp.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {

    List<Order> findByStatus(String status);
}
