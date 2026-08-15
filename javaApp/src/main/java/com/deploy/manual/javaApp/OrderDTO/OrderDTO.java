package com.deploy.manual.javaApp.OrderDTO;

import org.springframework.stereotype.Service;

@Service
public class OrderDTO {

    private String emailId;

    @Override
    public String toString() {
        return "OrderDTO{" +
                "emailId='" + emailId + '\'' +
                '}';
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

}
