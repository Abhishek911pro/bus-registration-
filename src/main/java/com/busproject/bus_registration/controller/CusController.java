package com.busproject.bus_registration.controller;

import com.busproject.bus_registration.Entity.CustomerEntity;
import com.busproject.bus_registration.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CusController {

//    @Autowired
//    private CustomerServiceImpl customerService;


    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("/customers")
    public List<CustomerEntity> showAllCustomer(){
//        return customerService.getAllCustomers();
        return customerRepository.findAll();
    }
}
