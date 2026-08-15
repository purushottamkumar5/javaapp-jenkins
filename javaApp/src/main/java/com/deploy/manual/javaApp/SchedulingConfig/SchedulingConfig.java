package com.deploy.manual.javaApp.SchedulingConfig;

import com.deploy.manual.javaApp.Repository.OrderRepository;
import com.deploy.manual.javaApp.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchedulingConfig {

    @Autowired
    OrderRepository repository;

    @Scheduled(initialDelay = 10000, fixedRate = 5000)
    public void processOrders()
    {
        List<Order>pendingOrders=repository.findByStatus("PENDING");
//        pendingOrders.stream().map(orders->{
//            orders.status="COMPLETED";
//            return repository.save(orders);
//        }).toList();
        pendingOrders.forEach(order->{
            order.status="COMPLETED";
             repository.save(order);
        });
        System.out.println("Size of pending order is : "+pendingOrders.size());


    }
}
