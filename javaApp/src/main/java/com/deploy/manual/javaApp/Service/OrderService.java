package com.deploy.manual.javaApp.Service;

import com.deploy.manual.javaApp.OrderDTO.OrderDTO;
import com.deploy.manual.javaApp.Repository.OrderRepository;
import com.deploy.manual.javaApp.entity.Order;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class OrderService {


    private static final Logger log = LoggerFactory.getLogger(OrderService.class);
    @Autowired
    OrderRepository repository;

    public Order saveOrder(OrderDTO dto) {
        log.info("OrderService :: saveOrder Creation of order started in save order");
        Order order=new Order();
        order.setEmail_id(dto.getEmailId());
        log.info("OrderService::saveOrder Order details after settig email {}",dto);
        return repository.save(order);
    }


}
