package com.deploy.manual.javaApp.controller;

import com.deploy.manual.javaApp.OrderDTO.OrderDTO;
import com.deploy.manual.javaApp.Repository.OrderRepository;
import com.deploy.manual.javaApp.Service.OrderService;
import com.deploy.manual.javaApp.entity.Order;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class OrderController {


    private static final Logger log = LoggerFactory.getLogger(OrderController.class);
    @Autowired
    OrderRepository repository;

    @Autowired
    OrderService orderService;

    @PostMapping("create")
    public Order createOrder(@RequestBody OrderDTO order)
    {
        log.info("OrderController :: createOrder ,The order dto object sent from client {}",order);
        log.info("Creation of order started");
        return orderService.saveOrder(order);
    }

    @GetMapping("all")
    public List<Order> getAllOrders()
    {
        log.info("fetching all orders started ");
        return repository.findAll();
    }
}
