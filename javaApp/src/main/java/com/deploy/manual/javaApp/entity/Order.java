package com.deploy.manual.javaApp.entity;


import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;
    private String email_id;
    public String status;
    public LocalDateTime createdAt;

    @PrePersist
    public void prePersist()
    {
        this.status="PENDING";
        this.createdAt=LocalDateTime.now();
    }

    public String getEmail_id() {
        return email_id;
    }

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", email_id='" + email_id + '\'' +
                ", status='" + status + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}
