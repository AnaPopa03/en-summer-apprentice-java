package com.endava.java2023.controller;

import com.endava.java2023.service.CustomerService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    private CustomerService customerService;

    public CustomerController(CustomerService customerService){
        this.customerService = customerService;
        System.out.println("Creating Account Controller");
    }

}
